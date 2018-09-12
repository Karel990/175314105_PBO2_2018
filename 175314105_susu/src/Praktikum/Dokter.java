package Praktikum;

public class Dokter {
    private String nomorPegawai,nama,alamat,tempatLahir; //variabel bertipe String dan bersifat private
    private int tanggalLahir; //variabel bertipe integer dan bersifat private
    
    public String getNomorPegawai() {
        return nomorPegawai;
    }
    public void setNomorPegawai(String nomorPegawai) throws NumberFormatException{ //method void dengan menambahkan throws NumberFormatException
        if (nomorPegawai.toCharArray().length>=6) //Method ini mengalokasikan array karakter baru, yang panjangnya sesuai dengan panjang String yang telah ditentukan
        this.nomorPegawai = nomorPegawai;
        else{
            throw new NumberFormatException("Nomor Pegawai Medis Salah"); //NumberFormatException berfungsi untuk menangani kesalahan dalam format penulisan angka.
    }
    }
    public String getNama() { //method bernama getNama yang akan mereturn variabel data String
        return nama;
    }
    public void setNama(String nama) { //method void setNama dengan parameter variabel nama bertipe data String
        this.nama = nama;
    }
    public String getAlamat() { //method bernama getAlamat yang akan mereturn variabel data String
        return alamat;
    }
    public void setAlamat(String alamat) {  //method void setNama dengan parameter variabel alamat data String
        this.alamat = alamat;
    }
    public String getTempatLahir() { //method getTempatLair yang akan mereturn variabel data String
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {  //method void setTempatLahir dengan parameter variabel tempatLahir bertipe data integer
        this.tempatLahir = tempatLahir;
    }
    public int getTanggalLahir() {   //method bernama getTanggalLahir yang akan mereturn variabel data integer
        return tanggalLahir;
    }
    public void setTanggalLahir(int tanggalLahir) throws NumberFormatException{ //method void bernama setTanggalLahir dengan parameter variabel tanggalLahir bertipe data integer
        if(tanggalLahir>0 && tanggalLahir<32)
        this.tanggalLahir = tanggalLahir;
        else throw new NumberFormatException("Tanggal Lahir Tidak vaild");
    }  
}
