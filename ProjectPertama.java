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
        String nama = "Wandhy Syahputra";
        String nik = "1471072706010001";
        String tmplahir = "PEMATANG SIANTAR", tgllahir ="27-06-2001";
        int usia = 21;
        char jenkel ='L';
        final double bb =50;
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
