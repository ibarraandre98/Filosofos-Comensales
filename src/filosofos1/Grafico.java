package filosofos1;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Grafico extends JFrame implements ActionListener {

    JPanel arriba,abajo;
    JButton binicio;
    int numfilo, tenedor;
    String estado;
    JLabel label, label2, label3, label4, label5;
    JLabel label6,label7,label8,label9,label10;

    public Grafico() {
        setTitle("Filosofos comensales");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setBounds(0, 0, 1160, 568);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        iniciacion();
        ejemplo();
        setVisible(true);
        Tenedores ten = new Tenedores();
        Filosofo filosofos1 = new Filosofo(1, false,false,ten, label);
        Filosofo filosofos2 = new Filosofo(2, false,false,ten, label2);
        Filosofo filosofos3 = new Filosofo(3, false,false,ten, label3);
        Filosofo filosofos4 = new Filosofo(4, false,false,ten, label4);
        Filosofo filosofos5 = new Filosofo(5, false,false,ten, label5);
        filosofos1.start();
        filosofos2.start();
        filosofos3.start();
        filosofos4.start();
        filosofos5.start();

    }

    public void iniciacion() {
        arriba = new JPanel();
        arriba.setLayout(new GridLayout());
        label = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        label2.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        label3.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        label4.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        label5.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        arriba.add(label);
        arriba.add(label2);
        arriba.add(label3);
        arriba.add(label4);
        arriba.add(label5);
        add(arriba, BorderLayout.NORTH);
    }
    public void ejemplo(){
        abajo=new JPanel();
        abajo.setLayout(new GridLayout());
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label6.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        label7.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        label8.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        label9.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        label10.setIcon(new ImageIcon("C:\\Users\\André\\Documents\\NetBeansProjects\\Principal\\pensando.jpg"));
        abajo.add(label6);
        abajo.add(label7);
        abajo.add(label8);
        abajo.add(label9);
        abajo.add(label10);
        add(abajo, BorderLayout.SOUTH);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == binicio) {

        }
    }


    public int getNumfilo() {
        return numfilo;
    }

    public void setNumfilo(int numfilo) {
        this.numfilo = numfilo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getTenedor() {
        return tenedor;
    }

    public void setTenedor(int tenedor) {
        this.tenedor = tenedor;
    }

}
