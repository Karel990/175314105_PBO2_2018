/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import java.io.File;
import Model.Pasien;

/**
 *
 * @author admin
 */
public class TestStream2 {
    public static void main(String[] args) {
        Pasien.bacaDaftarPasien(new File("daftar.txt"));
        for (int i = 0; i < Pasien.daftarPasien.size(); i++) {
            System.out.println(Pasien.getDaftarPasien().get(i).toString());
        }
        }
    }

