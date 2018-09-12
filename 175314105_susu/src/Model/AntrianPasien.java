/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author admin
 */
public class AntrianPasien {
    private int tanggalAntrian,bulanAntrian, tahunAntrian; //deklarasi variabel bertipe data integer bersifaat private
    private Klinik klinik; //deklarasi variabel bertipe data Klinik bersifat private
    private Pasien daftarPasien[]; //deklarasi array bertipe data Pasien bersifat private

    public Klinik getKlinik() {//membuat method bernama getKlinik yang akan mereturn variabel bertipe data Klinik
        return klinik;
    }

    public void setKlinik(Klinik klinik) { //membuat method void bernama setKlinik dengan parameter variabel nama bertipe data Klinik
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() { //membuat method bernama getDaftarPasien yang akan mereturn array bertipe data Pasien
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) { //membuat method void bernama setDaftarPasien dengan parameter array daftarPasien bertipe data Pasien
        this.daftarPasien = daftarPasien;
}
}
