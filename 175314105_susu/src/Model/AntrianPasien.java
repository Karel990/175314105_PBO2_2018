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
public class AntrianPasien implements Serializable {
    private int tanggalAntrian, bulanAntrian, tahunAntrian;
    private Klinik klinik;//mendeklarasikan variabel klinik dengan tipe objek Klinik
    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();//mendeklarasikan variabel array pasienList dengan tipe objek ArrayList
    public static ArrayList<AntrianPasien> antrianPasien = new ArrayList<AntrianPasien>();

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
    /**
     * konstruktor untuk mendeklarasikan objek AntrianPasien
     */
    public AntrianPasien() {
    }
    /**
     * method akan mengembalikan nilai klinik jika dipanggil
     *
     * @return
     */
    public Klinik getKlinik() {
        return klinik;
    }
    /**
     * method akan mengatur nilai klinik sama dengan nilai parameter klinik
     * dengan tipe data-nya objek Klinik
     *
     * @param klinik
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }
    /**
     * mathod akan mengembalikan nilai pasienList jika dipanggil
     *
     * @return
     */
    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasienAntri;
    }
    /**
     * method akan mengatur nilai pasienList sama dengan nilai parameter pasien
     *
     * @param pasien
     */
    public void setDaftarPasien(ArrayList<Pasien> pasien) {
        this.daftarPasienAntri = pasien;
    }
    /**
     * method untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     */
    public void Mendaftar(Pasien pasien) {
        daftarPasienAntri.add(pasien);
    }
    public static void daftarPasien(Pasien pasien, int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            AntrianPasien.antrianPasien.get(cariAntrian(tanggal, bulan, tahun, klinik)).Mendaftar(pasien);
        } else {
            buatAntrian(tanggal, bulan, tahun, klinik);
        }
    }
    public static AntrianPasien cariPasien(String noRM) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).daftarPasienAntri.equals(noRM)) {
                return antrianPasien.get(i);
            }
        }
        return null;
    }
    public static int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        for (int i = 0; i < antrianPasien.size(); i++) {
            if (antrianPasien.get(i).getTanggalAntrian() == tanggal) {
                if (antrianPasien.get(i).getBulanAntrian() == bulan) {
                    if (antrianPasien.get(i).getTahunAntrian() == tahun) {
                        if (antrianPasien.get(i).getKlinik().getIdKlinik().equalsIgnoreCase(klinik.getIdKlinik())) {
                            return i;
                        }
                    }
                }
            }
        }
        return -1;
    }
    public static void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        AntrianPasien antrian = new AntrianPasien();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        if (cariAntrian(tanggal, bulan, tahun, klinik) == -1) {
            antrianPasien.add(antrian);
        } else {
            throw new Exception("Data sudah terdaftar");
        }
    }
    public void printInfo() {
        System.out.println("");
        System.out.printf("%-20s", "");
        System.out.println("Daftar Antrian Pasien" + "\n");
        for (int i = 0; i < daftarPasienAntri.size(); i++) {
            daftarPasienAntri.get(i).printInfo(); //mengeprint data pasien setiap index
        }
    }
}