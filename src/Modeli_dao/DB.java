package Modeli_dao;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kocev
 */

import java.sql.*;
     public class DB {
     public Connection myConn       = null;
     public Statement  myStatment   = null;
     public    ResultSet  myRes        = null;
     
     private   String      user         ="root";
     private   String      pass         ="";
     private   String      host         ="jdbc:mysql://localhost:3306/avtosalon";
     // DB defolt constructor
    DB(){
        try
        {
          //  String myDriver = "org.gjt.mm.mysql.Driver";
     
          // Class.forName(myDriver);
            //get a connection to a database
            this.myConn  =   DriverManager.getConnection(this.host,this.user,this.pass);
        }catch (Exception e){
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
        }
    public void queryExecute (String sql){
     try
        {
     
       PreparedStatement preparedStmt = this.myConn.prepareStatement(sql);
      
      preparedStmt.execute();
      
      this.myConn.close();
      }catch (Exception e){
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
    }
    
    public void insertRow (String table_name, String colomns_name,String coloms_value) {
    String sql = "Insert into "+table_name+" ("+colomns_name+")values ("+coloms_value+")";
      this.queryExecute(sql);
    }
    public void updateRow (String table_name,String colomns_name, String condition) {
      
     String sql = "update "+table_name+" set "+colomns_name+" where "+condition+"";
     this.queryExecute(sql);
     
    
    }
    public void deleteRow (String table_name,String pk_name,int pk_id ) {
        String sql = "Delete from " + table_name + " where " + pk_name + " =" + pk_id;
    
       this.queryExecute(sql);
    
    }
    
    
     public ResultSet selectRow (String table_name) {
    String sql = "Select * from " + table_name ;
    try
        {
     
       PreparedStatement preparedStmt = this.myConn.prepareStatement(sql);
      
      this.myRes  = preparedStmt.executeQuery();

      this.myConn.close();
     
      }catch (Exception e){
          System.err.println("Got an exception!");
          System.err.println(e.getMessage());
        }
      return this.myRes ;
      
    }

}


      