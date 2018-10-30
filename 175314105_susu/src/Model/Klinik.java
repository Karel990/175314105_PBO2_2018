/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Klinik implements Serializable {
    private String idKlinik;
    private String namaKlinik;
    private static ArrayList<Klinik> klinik = new ArrayList<Klinik>();
    
    public Klinik() {
    }
    public Klinik(String idKlinik, String namaKlinik) {
        this.idKlinik = idKlinik;
        this.namaKlinik = namaKlinik;
    }
    public static void mendaftarKlinik(Klinik klinikOther) {
        klinik.add(klinikOther);
    }
    public String getIdKlinik() {
        return idKlinik;
    }
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }
    public String getNamaKlinik() {
        return namaKlinik;
    }
    public void setNama(String namaKlinik) {
        this.namaKlinik = namaKlinik;
    }
    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("KLINIK " + getNamaKlinik().toUpperCase() + "\n");
        System.out.printf("%-25s", "Nomor ID Klinik");
        System.out.print(": ");
        System.out.println(getIdKlinik());

    }
}