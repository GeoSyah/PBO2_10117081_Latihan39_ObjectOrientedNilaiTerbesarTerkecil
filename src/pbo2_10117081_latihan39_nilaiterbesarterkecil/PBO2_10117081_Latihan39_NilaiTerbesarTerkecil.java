/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2_10117081_latihan39_nilaiterbesarterkecil;

import java.util.Scanner;

/**
 *
 * @author Geo Syah Alkautsar
 * NIM : 10117081
 * Kelas : IF2/PBO2 : 
 * Deskripsi Program : Program ini berisi program untuk mengetahui nilai mahasiswa 
 *              yang terbesar dan terkecil 
 */
public class PBO2_10117081_Latihan39_NilaiTerbesarTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String petugas;
        int jumlahMhs;

        Nilai hasil = new Nilai();
        Scanner scan = new Scanner(System.in);

        System.out.println("===Program nilai terbesar dan nilai terkceil===");
        System.out.print("Masukkan Nama Petugas : ");
        petugas = scan.nextLine();
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa :  ");
        jumlahMhs = scan.nextInt();
        System.out.println();

        hasil.inputNilaiMhs(jumlahMhs);
        System.out.println();
        
        hasil.tampilNilaiBesarKecil(jumlahMhs);
        System.out.println("Nilai Terbesar : " + hasil.max);
        System.out.println("Nilai Terkecil : " + hasil.min);
        System.out.println();
        System.out.println("Nama Petugas : " + petugas);
    }
    
}
