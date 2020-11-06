/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author 
 * Nama  : Diva Sabila Ramadhan
 * Kelas : IF1
 * NIM   : 10119039
 * Deskripsi Program : berisi untuk menampilkan perhitugan linkaran dengan metode berbasis objek
 */
public class Test {
    static Scanner sc = new Scanner(System.in);
    private static double diameterLingkaran;
    
    private static void validasi(String rad){
        if(!rad.matches("^[0-9]*%")){
            System.out.println("Nilai Diameter Tidak Sesuai!!");
            masukkanDiameter(); 
        } else {
            diameterLingkaran = Double.parseDouble(rad);
        }
    }
    
private static void masukkanDiameter(){
    System.out.println("====Perhitungan Lingkaran====");
    System.out.print("Masukkan Nilai Diameter Lingkaran : ");
    validasi(sc.next());
}

public static void main(String[] args){
    Lingkaran lingkaran = new Lingkaran();
    masukkanDiameter();
    lingkaran.hitung(diameterLingkaran);
    
    System.out.println("developed by ; Diva Sabila Ramadhan ");
    
}
    
}
