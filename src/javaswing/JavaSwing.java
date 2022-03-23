package javaswing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JavaSwing {
    public static void main(String[] args) {
        /*JFrame frame = new JFrame();
        frame.setTitle("Kalkulator");
        frame.setSize(600,400);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        */
        GUI app = new GUI();
    }
}

class GUI extends JFrame implements ActionListener{
    JLabel panjang = new JLabel("Panjang : ");
    final JTextField input_panjang = new JTextField(10);

    JLabel lebar = new JLabel("Lebar : ");
    final JTextField input_lebar = new JTextField(10);

    JLabel tinggi = new JLabel("Tinggi : ");
    final JTextField input_tinggi = new JTextField(10);

    JButton hitung = new JButton("Hitung");
    JButton reset = new JButton("Reset");

    JLabel result = new JLabel("Result :");

    public GUI(){
        setTitle("Kalkulator Balok");
        setSize(300,400);

        setLayout(null);
        add(panjang);
        add(input_panjang);
        add(lebar);
        add(input_lebar);
        add(tinggi);
        add(input_tinggi);
        add(hitung);
        add(reset);
        add(result);

        panjang.setBounds(5, 20, 120, 40);
        input_panjang.setBounds(100, 34, 150, 20);

        lebar.setBounds(5, 40, 120, 40);
        input_lebar.setBounds(100, 54, 150, 20);

        tinggi.setBounds(5, 60, 120, 40);
        input_tinggi.setBounds(100, 74, 150, 20);

        hitung.setBounds(13, 120, 120, 40);
        reset.setBounds(150, 120, 120, 40);

        result.setBounds(123,190,130,30);
        setVisible(true);

        hitung.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == hitung){
            System.out.println("Hitung di klik");
            System.out.println(input_lebar);
            System.out.println(input_panjang);
            System.out.println(input_tinggi);



        }

    }
}

