/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Kosen
 */
public class AntrianKlinik {
    private int tanggalAntrian,bulanAntrian,tahunAntrian;

    public AntrianKlinik() {
    }

    public AntrianKlinik(int tanggalAntrian, int bulanAntrian, int tahunAntrian) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
    }
    
//    public void mendaftar(Pasien pasien){
//    daftarPasienKlinik.add(pasien);}
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }
    public void setTanggalAntrian(int tanggalAntrian) {
        this.tanggalAntrian = tanggalAntrian;
    }
    public int getBulanAntrian() {
        return bulanAntrian;
    }
    public void setBulanAntrian(int bulanAntrian) {
        this.bulanAntrian = bulanAntrian;
    }
    public int getTahunAntrian() {
        return tahunAntrian;
    }
    public void setTahunAntrian(int tahunAntrian) {
        this.tahunAntrian = tahunAntrian;
    } 
}
