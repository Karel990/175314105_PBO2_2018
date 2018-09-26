/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class RumahSakit {
    private String nama;
    private ArrayList<Klinik> daftarKlinik = new ArrayList();
    private ArrayList<Dokter> daftarDokter = new ArrayList();
  
    public RumahSakit() {
    }
  
    public RumahSakit(String nama){
    this.nama = nama;
    }
    public String getNama(){
    return nama;
    }
    public void setNama(String nama){
    this.nama = nama;
    }
    public ArrayList<Klinik> getDaftarKlinik() {
    return daftarKlinik;
    }
    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik)
    {
    this.daftarKlinik = daftarKlinik;
    }
    public void tambahKlinik(Klinik klinik) {
    if (cariKlinik(klinik.getNamaKlinik()) == -1) {
      getDaftarKlinik().add(klinik);
    }
    }
    public ArrayList<Dokter> getDaftarDokter()
    {
    return daftarDokter;
    }
    public void setDaftarDokter(ArrayList<Dokter> daftarDokter)
    {
    this.daftarDokter = daftarDokter;
    }
    public void tambahDokter(Dokter dokter){
    if (cariDokter(dokter.getNama()) == -1) {
      daftarDokter.add(dokter);
    }
  }
    public int cariDokter(String nama){
    for (int i = 0; i < getDaftarDokter().size(); i++) {
      if (nama.equalsIgnoreCase(
        ((Dokter)getDaftarDokter().get(i)).getNama())) {
        return i;
      }
    }
    return -1;
  }
    public int cariKlinik(String nama)
    {
    for (int i = 0; i < getDaftarKlinik().size(); i++) {
      if (nama.equalsIgnoreCase(
        ((Klinik)getDaftarKlinik().get(i)).getNamaKlinik())) {
        return i;
      }
    }
    return -1;
  }
}