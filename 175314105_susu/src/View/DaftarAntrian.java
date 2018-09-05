/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DaftarAntrian extends JDialog {
    private JLabel JudulLabel;
    private JLabel NamaLabel;
    private JTextField NamaText;
    private JButton SaveButton;

    public static void main(String[] args) {
        DaftarAntrian test = new DaftarAntrian();
        test.setSize(300, 400);
        test.setVisible(true);
    }
    public void init() {
        this.setLayout(null);
        JudulLabel = new JLabel("Daftar Pasien");
        JudulLabel.setBounds(100, 25, 150, 10); //horizontal, vertikal, panjang kalimat, menipiskan font
        this.add(JudulLabel);
        
        NamaLabel = new JLabel("NoRM");
        NamaLabel.setBounds(10, 80, 50, 10);
        this.add(NamaLabel);
        
        NamaText = new JTextField();
        NamaText.setBounds(80, 75, 200, 25);
        this.add(NamaText);
        
        NamaLabel = new JLabel("Nama");
        NamaLabel.setBounds(10, 130, 50, 10);
        this.add(NamaLabel);
        
        NamaText = new JTextField();
        NamaText.setBounds(80, 125, 200, 25);
        this.add(NamaText);
        
        NamaLabel = new JLabel("Alamat");
        NamaLabel.setBounds(10, 180, 50, 10);
        this.add(NamaLabel);
        
        NamaText = new JTextField();
        NamaText.setBounds(80, 175, 200, 25);
        this.add(NamaText);
        
        SaveButton = new JButton("Simpan");
        SaveButton.setBounds(80, 240, 150, 30);
        this.add(SaveButton);
    }
    
    public DaftarAntrian() {
        init();
    }
    public DaftarAntrian (String title) {
        this.setTitle(title);
        init();
    }
}