package Praktikum1;

public class Klinik {
    private String idKlinik, nama; //variabel bertipe String bersifat private

    public String getIdKlinik() { //method bernama getIdKlinik yang mereturn variabel data String
        return idKlinik;
    }
    public void setIdKlinik(String idKlinik) { //method void setIdKlinik dengan parameter variabel idKlinik bertipe data String
        this.idKlinik = idKlinik;
    }
    public String getNama() { //method bernama getNama yang akan mereturn variabel data String
        return nama;
    }
    public void setNama(String nama) { //method void bernama setNama dengan parameter variabel nama bertipe data String
        this.nama = nama;
    }
}
