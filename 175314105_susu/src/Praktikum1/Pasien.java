package Praktikum1;

public class Pasien {
    private String noRekamMedis,nama,alamat,tempatLahir; //variabel bertipe data String dan bersifat private
    private int tanggalLahir,bulanLahir,tahunLahir; //variabel bertipe data integer dan bersifat privat
    
    public Pasien(){ //menambahkan konstruktor, Konsktruktor adalah method yang pertama kali dijalankan pada saat sebuah objek pertama kali diciptakan    
    }
    public String getNoRekamMedis() { //method getNoRekamedis yang akan mereturn variabel data String
        return noRekamMedis;
    }
    public void setNoRekamMedis(String noRekamMedis) throws NumberFormatException { //method void dengan menambahkan throws NumberFormatException
        if (noRekamMedis.toCharArray().length>=6) { //Method ini mengalokasikan array karakter baru, yang panjangnya sesuai dengan panjang string yang telah ditentukan
            this.noRekamMedis = noRekamMedis;
        }else{
                throw new NumberFormatException("Nomor Rekam Medis Salah"); //NumberFormatException berfungsi untuk menangani kesalahan yang ada dalam format penulisan angka.
                }
    }
    public String getNama() { //method bernama getNama yang akan mereturn variabel data String
        return nama;
    }
    public void setNama(String nama) { //method void setNama dengan parameter variabel nama bertipe data String
        this.nama = nama;
    }
    public String getAlamat() { //method getAlamat yang akan mereturn variabel data String
        return alamat;
    }
    public void setAlamat(String alamat) { //method void setNama dengan parameter variabel alamat bertipe data String
        this.alamat = alamat;
    }
    public String getTempatLahir() { //method getTempatLair yang akan mereturn variabel bertipe data String
        return tempatLahir;
    }
    public void setTempatLahir(String tempatLahir) {  //method void setTempatLahir dengan parameter variabel tempatLahir bertipe data integer
        this.tempatLahir = tempatLahir;
    }
    public int getTanggalLahir() { //method getTanggalLahir yang mereturn variabel data integer
        return tanggalLahir;
    }
    public void setTanggalLahir(int tanggalLahir) throws NumberFormatException { //method void setTanggalLahir dengan parameter variabel tanggalLahir bertipe data integer
        if(tanggalLahir>0 && tanggalLahir<32)
        this.tanggalLahir = tanggalLahir;
        else{  throw new NumberFormatException("Tanggal Lahir tidak vaild");}
    }
    public int getBulanLahir() {  //method getBulanLahir yang akan mereturn variabel data integer
        return bulanLahir;
    }
    public void setBulanLahir(int bulanLahir) throws NumberFormatException { //method void setBulanLahir dengan parameter variabel bulanLahir bertipe data integer
        if(bulanLahir>0 && bulanLahir<13)
        this.bulanLahir = bulanLahir;
        else{  throw new NumberFormatException("Bulan Lahir tidak vaild");}
    }
    public int getTahunLahir() {  //method getTahunLahir yang mereturn variabel data integer
        return tahunLahir;
    }
    public void setTahunLahir(int tahunLahir)  throws NumberFormatException { //method void setTahunlahir dengan parameter variabel tahunLahir bertipe data integer
         if(tahunLahir>0 )
        this.tahunLahir = tahunLahir;
         else{  throw new NumberFormatException("Tahun Lahir tidak vaild");}
    }
}
