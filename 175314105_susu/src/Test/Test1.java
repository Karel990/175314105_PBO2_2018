/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.PrintStream;
import Model.Klinik;
import Model.RumahSakit;
import java.util.ArrayList;

/**
 *
 * @author user only
 */
public class Test1 {

    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit("RSKU");
        System.out.println("Nama RumahSakit : " + rs.getNama());

        Klinik klinik1 = new Klinik("001", "Anak");
        Klinik klinik2 = new Klinik("002", "Penyakit Dalam");

        rs.tambahKlinik(klinik1);
        rs.tambahKlinik(klinik2);

        for (int i = 0; i < rs.getDaftarKlinik().size(); i++) {
            System.out.println(
                    "IdKlinik: "
                    + rs.getDaftarKlinik().get(i).getIdKlinik()
                    + ", Nama : "
                    + rs.getDaftarKlinik().get(i).getNamaKlinik()
            );
        }
    }
}