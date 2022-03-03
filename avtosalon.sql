-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.4.22-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- Dumping database structure for avtosalon
CREATE DATABASE IF NOT EXISTS `avtosalon` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `avtosalon`;

-- Dumping structure for table avtosalon.marki
CREATE TABLE IF NOT EXISTS `marki` (
  `marki_id` tinyint(2) unsigned NOT NULL AUTO_INCREMENT,
  `marki_name` varchar(50) NOT NULL,
  `country` varchar(30) NOT NULL,
  `eu` tinyint(1) NOT NULL,
  PRIMARY KEY (`marki_id`),
  UNIQUE KEY `marki_id` (`marki_id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- Dumping data for table avtosalon.marki: ~20 rows (approximately)
/*!40000 ALTER TABLE `marki` DISABLE KEYS */;
INSERT INTO `marki` (`marki_id`, `marki_name`, `country`, `eu`) VALUES
	(1, 'Renault', 'France', 1),
	(2, 'WV', 'Germany', 1),
	(3, 'Mercedes', 'Geramany', 1),
	(4, 'Opel', 'Hungary', 1),
	(5, 'Peugeot', 'France', 1),
	(6, 'Citroen', 'France', 1),
	(7, 'Tojota', 'Japan', 0),
	(8, 'Honda', 'Japan', 0),
	(9, 'KIA', 'Korea', 1),
	(10, 'hyundai', 'Korea', 0),
	(11, 'Chevrolet', 'Hungary', 1),
	(13, 'Dacia', 'Romania', 1),
	(14, 'Tofas', 'Turkey', 0),
	(15, 'Ford', 'USA', 0),
	(16, 'Graet Wall', 'China', 0),
	(18, 'Audi', 'Germany', 1),
	(20, 'Alfa', 'Italy', 1),
	(24, 'Captur', 'France', 1),
	(27, 'Fiat', 'Italy', 1),
	(28, 'Skoda', 'Chehia', 1);
/*!40000 ALTER TABLE `marki` ENABLE KEYS */;

-- Dumping structure for table avtosalon.modeli
CREATE TABLE IF NOT EXISTS `modeli` (
  `modeli_id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `modeli_name` varchar(50) NOT NULL,
  `color` varchar(20) NOT NULL,
  `price` int(6) NOT NULL,
  `marki_id` tinyint(2) unsigned NOT NULL,
  PRIMARY KEY (`modeli_id`),
  UNIQUE KEY `modeli_id` (`modeli_id`),
  KEY `FK_modeli_marki` (`marki_id`),
  CONSTRAINT `FK_modeli_marki` FOREIGN KEY (`marki_id`) REFERENCES `marki` (`marki_id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- Dumping data for table avtosalon.modeli: ~14 rows (approximately)
/*!40000 ALTER TABLE `modeli` DISABLE KEYS */;
INSERT INTO `modeli` (`modeli_id`, `modeli_name`, `color`, `price`, `marki_id`) VALUES
	(1, 'A3', 'black', 14520, 18),
	(2, 'Captur', 'brown', 13820, 11),
	(3, 'passat', 'grey', 4800, 4),
	(4, 'delta', 'white', 1520, 27),
	(5, 'A8', 'black', 4520, 5),
	(6, 'C220', 'brown', 13820, 6),
	(7, 'polo', 'red', 4800, 15),
	(8, 'panda', 'white', 3520, 9),
	(9, '3m series', 'blue', 11500, 16),
	(10, '307', 'orange', 10820, 10),
	(11, 'megane', 'red', 11800, 18),
	(13, 'brabus', 'black', 30600, 10),
	(14, 'carrera', 'black', 19899, 3),
	(20, 'yaris', 'blue', 3850, 9);
/*!40000 ALTER TABLE `modeli` ENABLE KEYS */;

-- Dumping structure for procedure avtosalon._cheapest_model
DELIMITER //
CREATE PROCEDURE `_cheapest_model`(
	IN `limit_param` INT
)
BEGIN
SELECT * FROM modeli 
INNER  JOIN marki
ON marki.marki_id = modeli.marki_id
ORDER BY modeli.price ASC 
LIMIT limit_param ;
END//
DELIMITER ;

-- Dumping structure for function avtosalon._danok
DELIMITER //
CREATE FUNCTION `_danok`(`price_param` INT
) RETURNS int(11)
BEGIN
RETURN price_param;
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._danok_marka
DELIMITER //
CREATE PROCEDURE `_danok_marka`(
	IN `limit_param` INT
)
BEGIN
SELECT marki.marki_name ,SUM(modeli.price) AS Vkupen_promet , SUM(modeli.price*0.1) AS danok
from  modeli  
inner join marki 
ON  modeli.marki_id = marki.marki_id 
GROUP BY marki.marki_name
ORDER BY Vkupen_promet DESC
LIMIT limit_param;
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._delete_marki
DELIMITER //
CREATE PROCEDURE `_delete_marki`(
	IN `pk_value` TINYINT(2)
)
BEGIN
DELETE FROM marki
WHERE marki_id = pk_value;
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._delete_modeli
DELIMITER //
CREATE PROCEDURE `_delete_modeli`(
	IN `pk` INT(2)
)
BEGIN
DELETE FROM modeli 
WHERE modeli_id = (pk);
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._finansiska_kartica
DELIMITER //
CREATE PROCEDURE `_finansiska_kartica`(
	IN `limit_param` INT
)
BEGIN
SELECT marki.country ,SUM(modeli.price) AS Vkupen_promet , SUM(modeli.price*0.1) AS danok, _danok (modeli.price) AS profit
from  modeli  
inner join marki 
ON  modeli.marki_id = marki.marki_id 
GROUP BY marki.country
ORDER BY Vkupen_promet DESC
LIMIT limit_param;

END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._insert_marki
DELIMITER //
CREATE PROCEDURE `_insert_marki`(
	IN `marki_name_new` VARCHAR(50),
	IN `country_new` VARCHAR(30),
	IN `eu_new` TINYINT(2)
)
BEGIN
INSERT INTO marki (marki_name,country,eu)
VALUES (marki_name_new,country_new,eu_new);
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._insert_modeli
DELIMITER //
CREATE PROCEDURE `_insert_modeli`(
	IN `modeli_name_new` VARCHAR(50),
	IN `color_new` VARCHAR(20),
	IN `price_new` INT(6)
)
BEGIN
INSERT INTO modeli (modeli_name,color,price)
VALUES (modeli_name_new, color_new,price_new);
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._most_expensive_modeli
DELIMITER //
CREATE PROCEDURE `_most_expensive_modeli`()
BEGIN
select max(price) as most_expencive 
from modeli;
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._selectEU
DELIMITER //
CREATE PROCEDURE `_selectEU`()
BEGIN
select * from marki
where EU=1;
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._selectnonEU
DELIMITER //
CREATE PROCEDURE `_selectnonEU`()
BEGIN
select * from marki
where EU=0;
END//
DELIMITER ;

-- Dumping structure for procedure avtosalon._select_marki_name
DELIMITER //
CREATE PROCEDURE `_select_marki_name`()
BEGIN
SELECT (marki_name) from marki;
END//
DELIMITER ;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
