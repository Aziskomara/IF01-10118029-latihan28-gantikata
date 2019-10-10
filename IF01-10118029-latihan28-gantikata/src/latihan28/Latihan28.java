/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan28;

import java.util.Scanner;

/**
 *
 * @author acer
 * NAMA      : Azis komara
 * KELAS     : IF-1
 * NIM       : 10118029
 * Deskripsi Program   : Program ini berisi program ganti kata
 */
public class Latihan28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("------Program mengganti kata------");
        System.out.print("Masukan kalimat : ");
        String awal = input.nextLine();
        System.out.print("Ganti kata : ");
        String ganti = input.next();
        System.out.print("Menjadi kata : ");
        String jadi = input.next();
        String akhir = awal.replace(ganti, jadi);
        System.out.println("\n");
        System.out.println("------Hasil formating------");
        System.out.println("Kalimat awal : " + awal);
        System.out.println("Kalimat baru : " + akhir);
        
        
    }
    
}
