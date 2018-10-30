/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author admin
 */
public class Dokter implements Serializable {
    private String nomorPegawai; //mendeklarasikan variabel nomorPegawai dengan tipe data String
    private String nama, alamat, tempatLahir; //mendeklarasikan variable nama, alamat, tempatLahir dengan tipe data String
    private int tanggalLahir, bulanLahir, tahunLahir; //mendeklarasikan variabel tanggalLahir, bulanLahir, tahunLahir dengan tipe data integer
    /**
     * method akan mengembalikan nilai nomorPegawai jika dipanggil
     *
     * @return
     */
    public Dokter () {
    }
    public String getNomorPegawai() {
        String noPegawai = (nomorPegawai + nama.substring(0, 3));
        return noPegawai;
    }
    /**
     * method akan mengatur nilai nomorPegawai dengan parameter nomorPegawai
     * yang bertipe data String
     *
     * @param nomorPegawai
     */
    public void setNomorPegawai(String nomorPegawai) throws Exception {
        if (nomorPegawai.length() == 5) {
            this.nomorPegawai = nomorPegawai;
        } else {
            throw new Exception("Nomor Pegawai Error");
        }
    }
    /**
     * method akan mengembalikan nilai nama jika dipanggil
     *
     * @return
     */
    public String getNama() {
        return nama;
    }
    /**
     * method akan mengatur nilai nama dengan parameter nama yang bertipe data
     * String
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
    /**
     * method akan mengembalikan nilai alamat jika dipanggil
     *
     * @return
     */
    public String getAlamat() {
        return alamat;
    }
    /**
     * method akan mengatur nilai alamat dengan parameter alamat yang bertipe
     * data String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    /**
     * method akan mengembalikan nilai tempatLahir jika dipanggil
     *
     * @return
     */
    public String getTempatLahir() {
        return tempatLahir;
    }
    /**
     * method akan mengatur nilai tenpatLahir dengan parameter tempatLahir yang
     * bertipe data String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }
    /**
     * method akan mengembalikan nilai tanggalLahir jika dipanggil
     *
     * @return
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }
    /**
     * method akan mengatur nilai tanggalLahir dengan parameter tanggalLahir
     * yang bertipe data integer
     *
     * @param tanggalLahir
     * @throws Exception
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception { //meyhod akan melemparkan exception jika ada kesalahan input
        if (tanggalLahir > 0) { // apakah nilai tanggalLahir lebih besar dari 0? jika iya maka akan masuk kedalam perintah if
            if (tanggalLahir <= 31) { // apakah nilai tanggalLahir lebih kecil sama dengan 31? jika iya maka akan masuk kedalam perintah if
                this.tanggalLahir = tanggalLahir; // nilai tanggalLahir akan diisi dengan nilai parameter tanggalLahir
            } else {
                throw new Exception("Tanggal lahir yang anda masukkan lebih dari 30"); // jika nilai tanggalLahir lebih besar dari 31 maka akan melemparkan exception 
            }

        } else {
            throw new Exception("Tanggal lahir yang anda masukkan kurang dari 0"); // jika nilai tanggalLahir lebih kecil sama dengan 0 maka akan melemparkan exception
        }
    }
    /**
     * method akan mengembalikan nilai bulanLahir jika dipanggil
     *
     * @return
     */
    public int getBulanLahir() {
        return bulanLahir;
    }
    /**
     * methid akan mengatur nilai bulanLahir dengan parameter bulanLahir yang
     * bertipe data integer
     *
     * @param bulanLahir
     * @throws Exception
     */
    public void setBulanLahir(int bulanLahir) throws Exception {//method ini akan melemparkan exception jika ada kesalahan input
        if (bulanLahir > 0) {//apakah nilai bulanLahir lebih besar dari 0? jika iya maka akan masuk kedalam perintah if
            if (bulanLahir <= 12) {//apakah nilai bulanLahir lebih kecil sama dengan 12? jika iya maka akan masuk kedalam perintah if
                this.bulanLahir = bulanLahir;//nilai bulanLahir akan diisi dengan nilai parameter bulanLahir
            } else {
                throw new Exception("Bulan lahir yang anda masukkan lebih dari 12");//jika nilai bulanLahir lebih besar dari 12 maka akan melemparkan exception
            }
        } else {
            throw new Exception("Bulan lahir yang anda masukkan kurang dari 0");//jika nilai bulanLahir lebih kecil sama dengan 0 maka akan melemparkan exception
        }
    }
    /**
     * method ini akan mengembalikan nilai tahunLahir jika dipanggil
     *
     * @return
     */
    public int getTahunLahir() {
        return tahunLahir;
    }
    /**
     * method ini mengatur nilai tahunLahir dengan parameter tahunLahir yang
     * bertipe data integer
     *
     * @param tahunLahir
     * @throws Exception
     */
    public void setTahunLahir(int tahunLahir) throws Exception {//method ini akan melemparkan exception jika ada kesalahan input
        if (tahunLahir > 0) {//apakah nilai tahunLahir lebih besar dari 0? jika iya maka akan masuk kedalam perintah if
            this.tahunLahir = tahunLahir;//nilai tahun lahir akan diisi dengan nilai parameter tahunLahir
        } else {
            throw new Exception("Tahun lahair yang anda masukkan tidak valid");//jika nilai tahunLahir lebih besar dari 
        }
        /*
        Dalam method ini kita mengatur(set)tahun lahir dokter.
        jika tahun lahir yang diinputkan lebih besar dari 0 maka akan masuk kedalam if. 
        jika tanggal lahir kurang dari sama dengan 0 maka akan masuk kedalah else dan melemparkan exception.
        
         */
    }
    public void getTanggalKelahiranDokter() {
        Date tanggalKelahiran = new Date(getTahunLahir() - 1900, getBulanLahir() - 1, getTanggalLahir());
        SimpleDateFormat ft = new SimpleDateFormat("dd - MM - yyyy");
        System.out.println(ft.format(tanggalKelahiran));
        /*
        dalam method ini kita membuat format tanggal kelahiran dokter agar lebih mudah
         */
    }
    public void printInfo() {
        System.out.println();
        System.out.printf("%-20s", "");
        System.out.println("Biodata Dokter" + "\n");
        System.out.printf("%-25s", "Nomor Pegawai");
        System.out.println(": " + getNomorPegawai());
        System.out.printf("%-25s", "Nama");
        System.out.println(": " + getNama());
        System.out.printf("%-25s", "Alamat");
        System.out.println(": " + getAlamat());
        System.out.printf("%-25s", "Tempat, Tanggal Lahir");
        System.out.print(": " + getTempatLahir() + ", ");
        getTanggalKelahiranDokter();
        /*
        dalam method ini kita dimudahkan saat akan menampilkan karena hanya memanggil method ini saja
         */
    }
}