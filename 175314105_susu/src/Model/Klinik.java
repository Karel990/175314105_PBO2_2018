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
public class Klinik {
    private String idKlinik, nama; //deklarasi variabel bertipe data String bersifat private

    public String getIdKlinik() { //membuat method bernama getIdKlinik yang akan mereturn variabel bertipe data String
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) { //membuat method void bernama setIdKlinik dengan parameter variabel idKlinik bertipe data String
        this.idKlinik = idKlinik;
    }

    public String getNama() { //membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return nama;
    }

    public void setNama(String nama) { //membuat method void bernama setNama dengan parameter variabel nama bertipe data String
        this.nama = nama;
}
}
