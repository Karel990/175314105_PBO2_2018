/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.AntrianPasien;
import Model.Klinik;
import Model.Pasien;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kosen
 */
public class TestAntrianPasien {

    public static void main(String[] args) {
        try {
            AntrianPasien.buatAntrian(21, 9, 2018, new Klinik("001", "Anak"));
            AntrianPasien.buatAntrian(21, 9, 2018, new Klinik("002", "Saraf"));
            //AntrianPasien.buatAntrian(21, 9, 2018, new Klinik("001", "Anak"));

            for (int i = 0; i < AntrianPasien.antrianPasien.size(); i++) {
                System.out.println(AntrianPasien.antrianPasien.get(i).getKlinik().getNamaKlinik());
            }
            System.out.println("\n");

            Pasien pas1 = new Pasien();
            pas1.setNama("Puspa");
            pas1.setAlamat("Klaten");

            Pasien pas2 = new Pasien();
            pas2.setNama("Adi");
            pas2.setAlamat("Klaten");

            int indeksAntrian = AntrianPasien.cariAntrian(21, 9, 2018, new Klinik("001", "Anak"));
            if (indeksAntrian >= 0) {
                AntrianPasien.antrianPasien.get(indeksAntrian).Mendaftar(pas1);
                AntrianPasien.antrianPasien.get(indeksAntrian).Mendaftar(pas2);
            }

            for (int i = 0; i < AntrianPasien.antrianPasien.get(indeksAntrian).getDaftarPasien().size(); i++) {
                System.out.println(AntrianPasien.antrianPasien.get(indeksAntrian).getDaftarPasien().get(i).getNama());
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

}
