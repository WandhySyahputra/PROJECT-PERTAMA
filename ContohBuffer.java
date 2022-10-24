/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpertama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Asus
 */
public class ContohBuffer {
    public static void main(String[]args) throws IOException{
        InputStreamReader isr = new InputStreamReader (System.in);
        String nama;
        int usia;
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Masukkan nama");
        nama = br.readLine ();
        System.out.println("Masukkan usia");
        usia = Integer.parseInt(br.readLine());
        System.out.println("Nama saya adalah "+nama);
        System.out.println("Usia saya adalah "+usia);
    }
}
