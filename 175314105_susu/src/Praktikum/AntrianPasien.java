package Praktikum;

public class AntrianPasien {
    private int tanggalAntrian,bulanAntrian, tahunAntrian; //variabel bertipe data integer bersifaat private
    private Klinik klinik; //variabel bertipe data Klinik bersifat private
    private Pasien daftarPasien[]; //deklarasi array bertipe data Pasien bersifat private

    public Klinik getKlinik() {//method getKlinik yang akan mereturn variabel bertipe data Klinik
        return klinik;
    }

    public void setKlinik(Klinik klinik) { //method void setKlinik dengan parameter Klinik
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() { //method getDaftarPasien yang akan mereturn array data Pasien
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) { //method void setDaftarPasien dengan parameter array daftarPasien bertipe data Pasien
        this.daftarPasien = daftarPasien;
    }
}
