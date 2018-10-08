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
 * Deskripsi Kelas : Kelas ini berisi input nilai dan output nilai serta 
 *              pemisah nilai besar dan kecil
 */
class Nilai {
    public int nilai[] = new int[20];
    public int max, min;
    
    public void inputNilaiMhs(int jumlahMhs) {
        int i;
        Scanner scan = new Scanner(System.in);
        for (i = 1; i <= jumlahMhs; i++) {
          System.out.print("Masukkan Nilai Mahasiswa Ke-" + i + " : ");
         nilai[i] = scan.nextInt();
        }
    }
    
    public void tampilNilaiMhs(int jumlahMhs){
        int i;
        System.out.println("=== Hasil Nilai Mahasiswa ===");
        for (i = 1; i <= jumlahMhs; i++) {
          System.out.println("Nilai Mahasiswa Ke-" + i + " = " + nilai[i]);
        }
    }
    
    public void tampilNilaiBesarKecil(int jumlahMhs) {
        int i;
        min = nilai[1];
        max = nilai[1];
        for (i = 1; i <= jumlahMhs; i++) {
          if (nilai[i] > max) {
            max = nilai[i];
          } else if (nilai[i] < min) {
              min = nilai[i];
            }
        }
    }
}
