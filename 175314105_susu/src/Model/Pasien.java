/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.net.ftp.FtpClient;

/**
 *
 * @author admin
 */
public final class Pasien implements Serializable {
    private String nama, alamat, tempatLahir;
    private String nomorRekamMedis, NIK;
    private int tanggalLahir, bulanLahir, tahunLahir;
    /**
     *
     */
    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    /**
     * konstruktor untuk mendeklarasikan kelas Pasien
     */
    public Pasien() {
    }
    /**
     * konstruktor untuk mendeklarasikan kelas Pasien dengan parameter
     *
     * @param nama
     * @param alamat
     * @param tempatLahir
     * @param tanggalLahir
     * @param bulanLahir
     * @param tahunLahir
     * @param NIK
     */
    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String NIK) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.NIK = NIK;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
    }
    /**
     *
     * @param nama
     * @param tanggalLahir
     * @param bulanLahir
     * @param tahunLahir
     * @param noRM
     */
    public Pasien(String nama, int tanggalLahir, int bulanLahir, int tahunLahir, String noRM) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
    }
    /**
     * dalam method ini kita akan mengembalikan value nama
     *
     * @return
     */
    public String getNama() {
        return nama;
    }
    /**
     * dalam method ini kita akan mengatur value nama dengan parameter alamat
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * dalam method ini kita akan mengembalikan value alamat
     *
     * @return
     */
    public String getAlamat() {
        return alamat;
    }
    /**
     * dalam method ini kita akan mengatur value alamat dengan parameter alamat
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    /**
     * dalam method ini kita akan mengembalikan value tempatLahir
     *
     * @return
     */
    public String getTempatLahir() {
        return tempatLahir;
    }
    /**
     * dalam method ini kita akan mengatur value tempatLahir dengan parameter
     * tempatLahir
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    /**
     * method ini mengembalikan value tanggalLahir
     *
     * @return
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }
    /**
     * mengset nilai variabel NIK sama dengan parameter NIK dengan tipe data
     * String
     *
     * @param NIK
     * @throws Exception
     */
    public void setNIK(String NIK) throws Exception {
        if (NIK.length() == 16) {
            String nik = NIK;
            this.setNomorRekamMedis(nik);
            this.NIK = NIK;
        } else {
            throw new Exception("Nomor Induk Kependudukan terdiri dari 16 karakter");
        }
    }
    /**
     * mengembalikan nilai NIK
     *
     * @return
     */
    public String getNIK() {
        return NIK;
    }
    /**
     * mengembalikan nilai nomorRekamMedis
     *
     * @return
     */
    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }
    /**
     * mengset nilai variabel nomorRekamMedis sama dengan NIK
     *
     * @param nomorRekamMedis
     * @throws Exception
     */
    public void setNomorRekamMedis(String nomorRekamMedis) {
        //pengecekan panjang karakter variabel nomorRekamMedis harus sama dengan 16
        //if (nomorRekamMedis.length() == 16) {
        //nilai variabel nomorRekamMedis sama dengan NIK
        this.nomorRekamMedis = nomorRekamMedis;
        //  } else {
        //pesan jika bernilai false
        //      throw new Exception("Nomor Rekam Medis terdiri dari 16 karakter ");
        // }
    }
    /**
     * mengset nilai tanggalLahir sama dengan nilai parameter tanggalLahir
     * dengan tipe data integer
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Tanggal lahir yang anda masukkan tidak valid");
            }
        } else {
            throw new Exception("Tanggal lahir yang anda masukkan tidak valid");
        }
    }
    /**
     * mengembalikan nilai variabel bulanLahir
     *
     * @return
     */
    public int getBulanLahir() {
        return bulanLahir;
    }
    /**
     * mengset nilai variabel bulanLahir sama dengan nilai parameter bulanLhair
     * dengan tipe data integer
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Bulan lahir yang anda masukkan tidak valid");
            }
        } else {
            throw new Exception("Bulan lahir yang anda masukkan tidak valid");
        }
    }
    /**
     * mengembalikan nilai variabel tahunLahir
     *
     * @return
     */
    public int getTahunLahir() {
        return tahunLahir;
    }
    /**
     * mengset nilai tahunLahir sama dengan nilai parameter tahunLahir dengan
     * tipe data integer
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Tahun lahir yang anda masukkan tidak valid");
        }
    }
    /**
     * membuat format tanggal kelahiran dengan objek Date
     *
     */
    public void getTanggalKelahiran() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
    }
    /**
     * mengembalikan nilai objek daftarPasien dengan tipe ArrayList
     *
     * @return
     */
    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }
    /**
     * menambahkan objek pasienBaru ke dalam objek daftarPasien
     *
     * @param pasienBaru
     */
    public static void tambahPasienBaru(Pasien pasienBaru) {
        daftarPasien.add(pasienBaru);
    }
    /**
     * mencari data pasien berdasarakan nomor rekam medis
     *
     * @param NoRM
     * @return
     */
    public static Pasien cariPasien(String NoRM) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNIK().equals(NoRM)) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }
    /**
     *
     * @param file
     */
    public static void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, false);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    /**
     *
     * @param file
     */
    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        String hasil = "";
        int dataInt;
        boolean noRM = false;
        boolean nama = false;
        boolean alamat = false;
        Pasien temp = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t') {
                        hasil = hasil + (char) dataInt;
                    } else {
                        if (noRM == false) {
                            temp.setNomorRekamMedis(hasil);
                            noRM = true;
                            hasil = "";
                        } else if (nama == false) {
                            temp.setNama(hasil);
                            nama = true;
                            hasil = "";
                        }
                    }
                } else {
                    temp.setAlamat(hasil);
                    alamat = true;
                    hasil = "";
                    Pasien.tambahPasienBaru(temp);
                    noRM = false;
                    nama = false;
                    alamat = false;
                    temp=new Pasien();
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    /**
     * method ini membuat kita lebih mudah saat akan menampilkannya di main
     *
     */
    public void printInfo() {
        System.out.printf("%-25s", "Nomor Rekam Medis Pasien");
        System.out.println(": " + getNomorRekamMedis());
        System.out.printf("%-25s", "Nama Pasien");
        System.out.println(": " + getNama());
        System.out.printf("%-25s", "Tempat, Tanggal Lahir");
        System.out.print(": " + getTempatLahir() + " , ");
        getTanggalKelahiran();
        System.out.printf("%-25s", "Alamat");
        System.out.println(": " + getAlamat());
        System.out.println("");
    }

    @Override
    public String toString() {
        return nomorRekamMedis + "\t" + nama + "\t" + alamat + "\n";
    }

}
    