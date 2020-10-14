/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author abu
 */

import java.io.*;

class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Instance of Class
        Hendphon hp = new Hendphon();
        
        //Looping statement
        boolean lanjut = true;
        while (lanjut) {            
            //Input
            System.out.print("Masukan Merek HP\t\t  : ");
            String merkHp = br.readLine();
            System.out.print("Masukan Tipe HP\t\t\t  : ");
            String tipeHp = br.readLine();
            System.out.print("Masukan Warna HP\t\t  : ");
            String warnaHp = br.readLine();
            System.out.print("Masukan Harga HP\t\tRp: ");
            double hargaHp = Double.parseDouble(br.readLine());

            hp.setMerek(merkHp);
            hp.setTipe(tipeHp);
            hp.setWarna(warnaHp);
            hp.setHarga(hargaHp);


            //Output
            System.out.println("+========================================+");
            System.out.println("+ Daftar Harga Ponsel dan Spesifikasinya +");
            System.out.println("+========================================+");
            System.out.println("Merek Hp\t\t\t  : "+hp.getMerek());
            System.out.println("Tipe Hp\t\t\t\t  : "+hp.getTipe());
            System.out.println("Warna Hp\t\t\t  : "+hp.getWarna());
            System.out.println("Harga Hp Sebelum Diskon \tRp: "+hp.getHarga());
            hp.keterangan();
            
            //Question Continue
            System.out.println("-------------------------------------------");
            System.out.print("Ingin Mengulangi? (Y/n): ");
            String jawaban = br.readLine();
            
            if(jawaban.equalsIgnoreCase("y")){
                lanjut=true;
            }else if(jawaban.equalsIgnoreCase("n")){
                lanjut=false;
            }
            System.out.println("-------------------------------------------");
        }
    }
}
