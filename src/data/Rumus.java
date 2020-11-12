/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

/**
 *
 * @author Dean
 */
public class Rumus {
    private double massa;
    private int kecepatan0;
    private int kecepatan1;

    public Rumus() {
        System.out.println("Sebuah bola baseball dengan massa 145 g dilempar");
        System.out.println("dengan kecepatan 25 m/s.");
        System.out.println("a. Berapakah energi kinetiknya?");
        System.out.println("b. Berapakah usaha yang dilakukan pada bola untuk mencapai kecepatan");
        System.out.println("   ini, jika dimulai dari keadaan diam?");
    }       

    public double getMassa() {
        return massa;
    }

    public void setMassa(double massa) {
        this.massa = massa;
    }

    public int getKecepatan0() {
        return kecepatan0;
    }

    public void setKecepatan0(int kecepatan0) {
        this.kecepatan0 = kecepatan0;
    }

    public int getKecepatan1() {
        return kecepatan1;
    }

    public void setKecepatan1(int kecepatan1) {
        this.kecepatan1 = kecepatan1;
    }

    
    public double hitungEnergiKinetik(){
        return 0.5 * getMassa() * Math.pow(getKecepatan1(),2);
    }
    
    public double hitungUsaha(){
        return  0.5 * getMassa() * (Math.pow(getKecepatan1(),2) - Math.pow(getKecepatan0(),2));
    }
}
