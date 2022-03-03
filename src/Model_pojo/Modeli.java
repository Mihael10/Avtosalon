/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_pojo;

/**
 *
 * @author kocev
 */
public class Modeli {
   //classAtributs
    private int modeli_id;
    private String modeli_name;
    private String color ;
    private int price ;
    private String marki_name;
    private String country ;
    private int eu ;
    private int marki_id;
    // constructor
    public Modeli () {
    
    }
     public Modeli (int modeli_id,String modeli_name,String color,int price) {
        this.modeli_id = modeli_id ;
        this.modeli_name = modeli_name ;
        this.color = color ;
        this.price= price ;
     }
     // constructor model and mnarki
     public Modeli (int modeli_id,String modeli_name,String color,int price,String marki_name,String country,int eu) {
        this.modeli_id = modeli_id ;
        this.modeli_name = modeli_name ;
        this.color = color ;
        this.price= price ;
        this.marki_name = marki_name ;
        this.country = country ;
        this.eu = eu ;
     }
    // seters 
    public void setModeli_id (int modeli_id) {
        this.modeli_id = modeli_id ;
    }
    public void setModeli_name (String modeli_name) {
        this.modeli_name = modeli_name ;
    }
     public void setColor (String color) {
        this.color = color ;
    }
     public void setPrice (int price) {
        this.price = price ;
    }
    // geters
    public int getModeli_id () {
      return   this.modeli_id  ;
    }
    public String getModeli_name () {
     return   this.modeli_name ;
    }
     public String getColor () {
       return this.color  ;
    }
      public int getPrice () {
        return this.price  ;
    }   
      // tabe name marki
      public void setMarki_name (String marki_name) {
        this.marki_name = marki_name ;
    }
     public void setCountry (String country) {
        this.country = country ;
    }
     public void setEu (int eu) {
        this.eu = eu ;
    }
    // geters
    public int getMarki_id () {
      return   this.marki_id  ;
    }
    public String getMarki_name () {
     return   this.marki_name ;
    }
     public String getCountry () {
       return this.country  ;
    }
      public int getEu () {
        return this.eu  ;
    }
}
