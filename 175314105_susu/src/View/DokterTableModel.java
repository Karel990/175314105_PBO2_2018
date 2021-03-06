/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;
import Model.Dokter;

/**
 *
 * @author user only
 */
public class DokterTableModel extends AbstractTableModel {

    private ArrayList<Dokter> daftarDokter;
    private String[] columns;

    public DokterTableModel() {
    }

    public DokterTableModel(ArrayList<Dokter> daftarDokter) {
        super();
        columns = new String[]{"Nomor Pegawai", "Nama"};
        this.setDaftarDokter(daftarDokter);
    }

    @Override
    public int getRowCount() {
        //To change body of generated methods, choose Tools | Templates.
        return daftarDokter.size();
    }

    @Override
    public int getColumnCount() {
        //To change body of generated methods, choose Tools | Templates.
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        //To change body of generated methods, choose Tools | Templates.
        Dokter dokter = daftarDokter.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return dokter.getNomorPegawai();
            case 1:
                return dokter.getNama();
            default:
                return null;
        }
    }

    // Optional, the name of your column
    public String getColumnName(int col) {
        return columns[col];
    }

    /**
     * @return the daftarDokter
     */
    public ArrayList<Dokter> getDaftarDokter() {
        return daftarDokter;
    }

    /**
     * @param daftarDokter the daftarDokter to set
     */
    public void setDaftarDokter(ArrayList<Dokter> daftarDokter) {
        this.daftarDokter = daftarDokter;
    }

}
