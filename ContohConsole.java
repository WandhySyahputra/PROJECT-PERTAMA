/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpertama;

import java.io.Console;
/**
 *
 * @author Asus
 */
public class ContohConsole {
    public static void main(String[]args){
        String nama;
        int usia;
        Console masukan = System.console();
        System.out.println("Masukkan nama :");
        nama = masukan.readLine();
        System.out.println("Masukkan usia :");
        usia = Integer.parseInt(masukan.readLine());
        System.out.println("Nama saya adalah "+nama);
        System.out.println("Usia saya adalah "+usia);
        
        
}
}
