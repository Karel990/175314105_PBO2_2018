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
public class Dokter {
    private String nomorPegawai,nama,alamat,tempatLahir; //deklarasi variabel bertipe data String dan bersifat private
    private int tanggalLahir; //deklarasi variabel bertipe data integerdan bersifat private

    public String getNomorPegawai() {
        return nomorPegawai;
    }
    public void setNomorPegawai(String nomorPegawai) throws NumberFormatException{ //membuat method void dengan menambahkan throws NumberFormatException
        if (nomorPegawai.toCharArray().length>=6) //Method ini mengalokasikan array karakter baru, yang panjangnya sesuai dengan panjang string yang ditentukan
        this.nomorPegawai = nomorPegawai;
        else{
                throw new NumberFormatException("Nomor Pegawai Medis Salah"); //NumberFormatException berfungsi untuk menangani kesalahan2 dalam format penulisan angka.
    }
    }
    public String getNama() { //membuat method bernama getNama yang akan mereturn variabel bertipe data String
        return nama;
    }

    public void setNama(String nama) { //membuat method void bernama setNama dengan parameter variabel nama bertipe data String
        this.nama = nama;
    }

    public String getAlamat() { //membuat method bernama getAlamat yang akan mereturn variabel bertipe data String
        return alamat;
    }

    public void setAlamat(String alamat) {  //membuat method void bernama setNama dengan parameter variabel alamat bertipe data String
        this.alamat = alamat;
    }

    public String getTempatLahir() { //membuat method bernama getTempatLair yang akan mereturn variabel bertipe data String
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {  //membuat method void bernama setTempatLahir dengan parameter variabel tempatLahir bertipe data integer
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {   //membuat method bernama getTanggalLahir yang akan mereturn variabel bertipe data integer
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws NumberFormatException{ //membuat method void bernama setTanggalLahir dengan parameter variabel tanggalLahir bertipe data integer
        if(tanggalLahir>0 && tanggalLahir<32)
        this.tanggalLahir = tanggalLahir;
        else throw new NumberFormatException("Tanggal Lahir Tidak vaild");
}
}
