/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianPasien;
import Model.Dokter;
import Model.Klinik;
import Model.Pasien;

/**
 *
 * @author Kosen
 */
public class TestModel {
    public static void main(String[] args) {
        //Deklarasi 
        Klinik klinik = new Klinik();
        Dokter dokter = new Dokter();
        Pasien pasien1 = new Pasien();
        AntrianPasien antrian = new AntrianPasien();

        //Klinik 
        klinik.setIdKlinik("1234521KL");
        klinik.setNama("Sanata Dharma");

        //Dokter
        try {
            dokter.setNama("Bemon");
            dokter.setNomorPegawai("1234321");
            dokter.setTempatLahir("Banjarmasin");
            dokter.setTanggalLahir(12);
            dokter.setBulanLahir(5);
            dokter.setTahunLahir(1999);
        } catch (Exception ex) {
            System.out.println(ex);
        }
        dokter.setAlamat("Maguwoharjo");

        //Pasien 1
        try {
            pasien1.setNIK("999999909789089");
            pasien1.setNama("Karel Aristo");
            pasien1.setAlamat("Jalan Paingan 7 No 96B, Maguwoharjo, Kab.Sleman, Daerah Istimewa Yogyakarta");
            pasien1.setTempatLahir("Pontianak");
            pasien1.setTanggalLahir(9);
            pasien1.setBulanLahir(6);
            pasien1.setTahunLahir(1999);
        } catch (Exception ex) {
            System.out.println(ex);
        }

        //Mendaftar
        antrian.setKlinik(klinik);
        antrian.Mendaftar(pasien1);
        
        //Print Output
        antrian.getKlinik().printInfo();
        dokter.printInfo();
        for (int i = 0; i <antrian.getDaftarPasien().size(); i++) {
            antrian.printInfo();
        }
    }
}
