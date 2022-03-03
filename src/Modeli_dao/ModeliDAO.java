/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modeli_dao;

import Model_pojo.Modeli;
import com.mysql.jdbc.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author kocev
 */
public class ModeliDAO extends Modeli {
     DB myDB;
    private String table_name = "modeli";
    private String pk_name = "modeli_id";
    private String colomns_name = "modeli_name,color, price";
    // CRUD operations
    
    public ModeliDAO () {
    this.myDB = new DB () ;
    }
    public void insertModeli ()  {
        String modeli_name = super.getModeli_name();
        String color = super.getColor();
        int price = super.getPrice();
        String colums_value= " '"+modeli_name+"','"+color+"',"+price+"";
        this.myDB.insertRow(this.table_name,this.colomns_name,colums_value);
    }
  public void deleteModeli ()  {
      int modeli_id = super.getModeli_id();
      System.out.println("Delete from Modeli where modeli_id =" + modeli_id);
       myDB.deleteRow(this.table_name,this.pk_name,modeli_id);
    }  
  public void updateModeli ()  {
        String Modeli_name = super.getModeli_name();
        String Color = super.getColor();
        int Price = super.getPrice();
        int Modeli_id = super.getModeli_id();
        String colomns = "Modeli_id='"+Modeli_id+"',Color='"+Color+"',Price= "+Price+"";
        String condition = "Modeli_id = " +  Modeli_id;
        this.myDB.updateRow(this.table_name,colomns,condition);
    }
  public ArrayList<Modeli> selectModeli ()  {
      ArrayList<Modeli> arrayModeli= new ArrayList<Modeli> ();
       String sql = "Select * from " + this.table_name + " inner join marki ON modeli.marki_id = marki.marki_id" ;
     try
        {
 
     java.sql.PreparedStatement preparedStmt = this.myDB.myConn.prepareStatement(sql);
     this.myDB.myRes  = preparedStmt.executeQuery();       
     //this.myDB.myRes = this.myDB.selectRow(this.table_name);
     while ( this.myDB.myRes.next() )
    {
      int Modeli_id = this.myDB.myRes.getInt("Modeli_id");
      String Modeli_name = this.myDB.myRes.getString("Modeli_name");
      String Color = this.myDB.myRes.getString("Color");
      int Price = this.myDB.myRes.getInt("Price");
       // tabele name marki
      String Marki_name = this.myDB.myRes.getString("Marki_name");
      String Country = this.myDB.myRes.getString("Country");
      int Eu = this.myDB.myRes.getInt("Eu");
       Modeli objModeli = new Modeli (Modeli_id,Modeli_name,Color,Price,Marki_name,Country,Eu);
          
       arrayModeli.add(objModeli);//adding Agency class object  
    }
    this.myDB.myRes.close();
  }catch (Exception e){
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
     return arrayModeli;
    }
}
