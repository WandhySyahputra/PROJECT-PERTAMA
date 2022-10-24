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
public class percabangan {
    public static void main (String[]args){
        Scanner masukan = new Scanner(System.in);
        System.out.println("Masukkan angka = ");
        int angka = masukan.nextInt();
        if (angka%2==0)
        {
            System.out.println("Bilangan genap");
        }
        else
        {
            System.out.println("Bilangan ganjil");
        }
    }
}
