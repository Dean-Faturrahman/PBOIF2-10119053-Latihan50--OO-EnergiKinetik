/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119053.latihan50.oo.energikinetik;

import data.Rumus;
import java.util.Scanner;
/**
 *
 * @author Dean
 * Nama  : Dean Ghifari Faturrahman
 * Kelas : PBOIF2
 * NIM   : 10119053
 * Deskripsi Program : Program ini berisi program energi kinetik
 */
public class PBOIF210119053Latihan50OOEnergiKinetik {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rumus rumus = new Rumus();
        
        System.out.print("\nMasukkan berat bola (kg) = ");
        rumus.setMassa(input.nextDouble());
        System.out.print("Masukkan kecepatan awal bola (m/s) = ");
        rumus.setKecepatan0(input.nextInt());
        System.out.print("Masukkan kecepatan akhir bola (m/s) = ");
        rumus.setKecepatan1(input.nextInt());
        System.out.println("\na. Energi Kinetik = 1/2mv^2");
        System.out.println("                  = " + rumus.hitungEnergiKinetik() + " Joule");
        System.out.println("b. Usaha = W = deltaEK");
        System.out.println("             = 1/2m(v1^2-v0^2)");
        System.out.println("             = " + rumus.hitungUsaha() + " Joule");
    }
    
}
