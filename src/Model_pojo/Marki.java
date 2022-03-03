/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model_pojo;

/**
 *
 * @author kocev
 */
public class Marki {
    //classAtributs
    private int marki_id;
    private String marki_name;
    private String country ;
    private int eu ;
    private int Vkupen_promet;
    private float danok;
    // constructor
    public Marki () {
    
    }
     public Marki (int marki_id,String marki_name,String country,int eu) {
        this.marki_id = marki_id ;
        this.marki_name = marki_name ;
        this.country = country ;
        this.eu = eu ;
     }
     public Marki (String country,int Vkupen_promet,float danok) {
        this.country = country ;
        this.Vkupen_promet= Vkupen_promet;
        this.danok = danok;
        
        
     }
    // seters 
    public void setMarki_id (int marki_id) {
        this.marki_id = marki_id ;
    }
    public void setMarki_name (String marki_name) {
        this.marki_name = marki_name ;
    }
     public void setCountry (String country) {
        this.country = country ;
    }
     public void setEu (int eu) {
        this.eu = eu ;
        
    }
      public void setVkupen_promet (int Vkupen_promet) {
        this.Vkupen_promet= Vkupen_promet;
        
    }
       public void setDanok (float danok) {
        this.danok = danok;
        
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
      public int getVkupen_promet () {
        return this.Vkupen_promet;
        
    }
       public float getDanok () {
       return this.danok ;
        
    }
}
