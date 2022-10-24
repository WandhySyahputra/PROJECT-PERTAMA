/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpertama;

import java.util.Scanner;
/**
 *
 * @author Asus
 */
public class KonversiNilai {
    public static void main (String[]args){
        String nim, nama, prodi, matkul, predikat;
        int nilai;
        Scanner masukan = new Scanner (System.in);
        System.out.println("====MASUKKAN DATA==== ");
        System.out.println("Masukkan NIM =");
        nim = masukan.nextLine();
        System.out.println("Masukkan Nama =");
        nama = masukan.nextLine();
        System.out.println("Masukkan Mata Kuliah =");
        matkul = masukan.nextLine();
        
        System.out.println("====JURUSAN ANDA====");
        //MENGAMBIL JURUSAN DARI NIM
        prodi=nim.substring(3,5);
        System.out.println(prodi);
        if (prodi.equals("52")) {
            System.out.println("prodi = S1-TI");
        } else if(prodi.equals("51")){
            System.out.println("prodi = S1-SI");
        } else if(prodi.equals("31")){
            System.out.println("prodi = D3-SI");
        } else{
            System.out.println("prodi tidak ada");
        }
        
        System.out.println("====NILAI ANDA====");
        //KARTU HASIL STUDI
        nilai = masukan.nextInt();
        System.out.println(nilai);
        if(nilai >= 85 && nilai <=100){
            System.out.println("Anda mendapat nilai A");
            System.out.println("Sangat memuaskan");
        } else if(nilai >= 80 && nilai <=84){
            System.out.println("Anda mendapat nilai A-");
            System.out.println("Sangat memuaskan");
        } else if(nilai >= 75 && nilai <=79){
            System.out.println("Anda mendapat nilai B+");
            System.out.println("Memuaskan");
        } else if(nilai >= 70  && nilai <=74){
            System.out.println("Anda mendapat nilai B");
            System.out.println("Cukup");
        } else if(nilai >= 65 && nilai <=69){
            System.out.println("Anda mendapat nilai B-");
            System.out.println("Kurang memuaskan");
        } else if(nilai >= 60 && nilai <=64){
            System.out.println("Anda mendapat nilai C");
            System.out.println("Tidak Memuaskan");
        } else if(nilai >= 55 && nilai <=59){
            System.out.println("Anda mendapat nilai C-");
            System.out.println("Buruk");
        } else if(nilai <=55){
            System.out.println("Anda mendapat nilai D");
            System.out.println("Sangat memuaskan");
        }
        
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("Jurusan : " + prodi);
        System.out.println("Matakuliah : " + matkul);
        System.out.println("Nilaimu Adalah : " + nilai);
        
    }
}
