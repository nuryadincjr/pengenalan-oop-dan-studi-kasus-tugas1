/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abu
 */
class Hendphon {
    //Declaration (Atribut)
    private String merek, tipe, warna;
    private double harga;
    
    
    //setTer (Method)
    public void setMerek(String merek){
        this.merek = merek;
    }
    
     public void setTipe(String tipe){
        this.tipe = tipe;
    }
    
    //Alternatif
//    public void setWarna(String colour){
//        warna = colour;
//    }
    
    public void setWarna(String warna){
        this.warna = warna;
    }
    
     public void setHarga(double harga){
        this.harga = harga;
    }
     
    
    //getTer (Method)
    public String getMerek(){
        return merek;
    }
    
    public String getTipe(){
        return tipe;
    }
    
    public String getWarna(){
        return warna;
    }
    
    public double getHarga(){
        return harga;
    }
    
    
    //Method tambahan
    public double hargaDiskon(){
        double diskon, total;
        diskon = (0.1*getHarga());
        total = (getHarga()-diskon);
        return total;
    }
    
    public void keterangan(){
        System.out.println("Harga HP Sesudah diskon (10%)\tRp: "+hargaDiskon());
    }
}
