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
public class Klinik {
    private String idKlinik;
    private String namaKlinik;
    private ArrayList<Dokter> daftarDokter = new ArrayList();
  
    public Klinik(String idKlinik, String namaKlinik) {
    this.idKlinik = idKlinik;
    this.namaKlinik = namaKlinik;
  }
  public Klinik() {
  }
  public String getIdKlinik(){
    return idKlinik;
  }
  public void setIdKlinik(String idKlinik){
    this.idKlinik = idKlinik;
  }
  public String getNamaKlinik(){
    return namaKlinik;
  }
  public void setNamaKlinik(String namaKlinik){
    this.namaKlinik = namaKlinik;
  }
  public ArrayList<Dokter> getDaftarDokter(){
    return daftarDokter;
  }
  public void setDaftarDokter(ArrayList<Dokter> daftarDokter){
    this.daftarDokter = daftarDokter;
  }
  public void tambahDokter(Dokter dokter) {
    daftarDokter.add(dokter);
  }
}