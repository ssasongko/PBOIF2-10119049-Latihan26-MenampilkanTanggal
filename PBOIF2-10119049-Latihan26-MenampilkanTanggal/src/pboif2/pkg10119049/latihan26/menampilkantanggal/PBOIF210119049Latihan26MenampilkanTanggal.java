/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119049.latihan26.menampilkantanggal;
	
import java.util.Date;  
import java.text.DateFormat;  
import java.text.SimpleDateFormat;  

/**
 * Nama  : Nur Sasongko
 * Kelas : PBOIF2
 * NIM   : 10119049
 * Deskripsi Program : program untuk menampilkan tanggal indonesia
 */
public class PBOIF210119049Latihan26MenampilkanTanggal {
    
    public static String getHari(){
        DateFormat dateFormat = new SimpleDateFormat("EEE");  
        Date date = new Date();  
        String hari = dateFormat.format(date);
        
        switch(hari){
            case "Mon" :
                return "Senin";
            case "Tue" :
                return "Selasa";
            case "Wed" :
                return "Rabu";
            case "Thu" :
                return "Kamis";
            case "Fri" :
                return "Jum'at";
            case "Sat" :
                return "Sabtu";    
            default :
                return "Minggu";
        }
    }
    
    public static String getWaktu(){
        DateFormat dateFormat = new SimpleDateFormat("dd MMM YYYY HH:mm:ss");  
        Date date = new Date();  
        return dateFormat.format(date);  
    }
    
    public static void getTampilWaktu(){
        System.out.printf("Hari ini adalah hari : %s, %s%n",getHari(), getWaktu());
    }
    
    public static void main(String[] args) {
       getTampilWaktu();
    }
    
}
