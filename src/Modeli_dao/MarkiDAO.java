/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeli_dao;

import Model_pojo.Marki;
import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author kocev
 */
public class MarkiDAO extends Marki {
    // clas  attributs 
   // DB myDB ;
    DB myDB;
    private String table_name = "marki";
    private String pk_name = "marki_id";
    private String colomns_name = "marki_name,country, eu";
    
    
    // construct
    public MarkiDAO () {
    this.myDB = new DB () ;
    }
   // public MarkiDAO (DB myDB) {
   // }
    // CRUD operations
    public void insertMarki ()  {
        String marki_name = super.getMarki_name();
        String country = super.getCountry();
        int eu = super.getEu();
        String coloms_value = "'"+marki_name+"','"+country+"',"+eu+"";
        // comunicacija so parent 
         this.myDB.insertRow (this.table_name,this.colomns_name, coloms_value);
         
    }
  public void deleteMarki ()  {
      int marki_id = super.getMarki_id();
      System.out.println("Delete from Marki where marki_id =" + marki_id );
      // comunicacija so parent 
        this.myDB.deleteRow (this.table_name,this.pk_name,marki_id);
      
    }  
  public void updateMarki ()  {
        String Marki_name = super.getMarki_name();
        String Country = super.getCountry();
        int Eu = super.getEu();
        int Marki_id = super.getMarki_id();
        String colomns = "Marki_id='"+Marki_id+"',Country='"+Country+"',Eu= "+Eu+"";
        String condition = "Marki_id = " +  Marki_id;
        this.myDB.updateRow(this.table_name,colomns,condition);
              
    }
  
  
      public ArrayList<Marki> selectMarki ()  {
      ArrayList<Marki> arrayMarki= new ArrayList<Marki> ();
       String sql = "Select * from " + this.table_name ;
     try
        {
 
     java.sql.PreparedStatement preparedStmt = this.myDB.myConn.prepareStatement(sql);
     this.myDB.myRes  = preparedStmt.executeQuery();       
     //this.myDB.myRes = this.myDB.selectRow(this.table_name);
     while ( this.myDB.myRes.next() )
    {
      int Marki_id = this.myDB.myRes.getInt("Marki_id");
      String Marki_name = this.myDB.myRes.getString("Marki_name");
      String Country = this.myDB.myRes.getString("Country");
      int Eu = this.myDB.myRes.getInt("Eu");
       
       Marki objMarki = new Marki (Marki_id,Marki_name,Country,Eu);
          
       arrayMarki.add(objMarki);//adding Agency class object  
    }
    this.myDB.myRes.close();
  }catch (Exception e){
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
     return arrayMarki;
    }
       public ArrayList<Marki> selectFinansiskaKartica (int limit)  {
      ArrayList<Marki> arrayMarki= new ArrayList<Marki> ();
       String sql = "SELECT country ,SUM(modeli.price) AS Vkupen_promet , SUM(modeli.price*0.1) AS danok \n" +
"from  modeli  \n" +
"inner join marki \n" +
"ON  modeli.marki_id = marki.marki_id \n" +
"GROUP BY marki.country\n" +
"ORDER BY Vkupen_promet DESC\n" +
"LIMIT "+ limit+" "  ;
     try
        {
 
     java.sql.PreparedStatement preparedStmt = this.myDB.myConn.prepareStatement(sql);
     this.myDB.myRes  = preparedStmt.executeQuery();       
     //this.myDB.myRes = this.myDB.selectRow(this.table_name);
     while ( this.myDB.myRes.next() )
    {
//      int Marki_id = this.myDB.myRes.getInt("Marki_id");
//      String Marki_name = this.myDB.myRes.getString("Marki_name");
      String Country = this.myDB.myRes.getString("Country");
      int Vkupen_promet  = this.myDB.myRes.getInt("Vkupen_promet");
      float danok  = this.myDB.myRes.getFloat("danok"); 
      Marki objMarki = new Marki (Country,Vkupen_promet,danok);
          
       arrayMarki.add(objMarki);//adding Agency class object  
    }
    this.myDB.myRes.close();
  }catch (Exception e){
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
     return arrayMarki;
    }
}
//public ArrayList<Agency> selectAgency  () {
//     ArrayList<Agency> arrayAgency=new ArrayList<Agency>(); 
//    String sql = "Select * from " + this.table_name ;
//     try
//        {
//     PreparedStatement preparedStmt = this.myDB.myConn.prepareStatement(sql);
//      
//     this.myDB.myRes  = preparedStmt.executeQuery();       
//     //this.myDB.myRes = this.myDB.selectRow(this.table_name);
//     while ( this.myDB.myRes.next() )
//    {
//       int ID_Nr = this.myDB.myRes.getInt("ID_Nr");
//       String Aname = this.myDB.myRes.getString("Aname");
//       String Contact_Nr = this.myDB.myRes.getString("Contact_Nr");
//       Agency objAgency = new Agency (ID_Nr,Aname,Contact_Nr);
//          
//       arrayAgency.add(objAgency);//adding Agency class object  
//    }
//    this.myDB.myRes.close();
//  }catch (Exception e){
//          System.err.println("Got an exception!");
//          System.err.println(e.getMessage());
//        }
//     return arrayAgency;
//    }