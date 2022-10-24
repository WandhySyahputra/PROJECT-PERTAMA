/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectpertama;

/**
 *
 * @author Asus
 */
public class ProjectPertama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama = "Shierly Margaretha";
        String nik = "3573025303030002";
        String tmplahir = "Malang", tgllahir ="13-03-2003";
        int usia = 19;
        char jenkel ='P';
        final double bb =60;
        System.out.println("Identitas Pribadi");
        System.out.println("=================");
        System.out.println("NIK :"+nik);
        System.out.println("Nama :"+nama);
        System.out.println("Usia :"+usia);
        System.out.println("jenia Kelamin :"+jenkel);
        System.out.format("Tempat, Tangal Lahir : %s %s %n",tmplahir,tgllahir);
        System.out.println("berat badan :"+bb);
    }
    
}
