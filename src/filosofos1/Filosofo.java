package filosofos1;

import java.awt.Image;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Filosofo extends Thread {

    ImageIcon imagen1,imagen2;
    Icon fondo1,fondo2;
    int num;
    Tenedores obj;
    Random rn = new Random();
    JLabel label, label1;
    boolean tienetd, tieneti;

    public Filosofo(int filo, boolean tieneti, boolean tienetd, Tenedores obj1, JLabel label) {
        num = filo;
        this.tieneti = tieneti;
        this.tienetd = tienetd;
        obj = obj1;
        this.label = label;
    }

    @Override
    public void run() {
        imagen1 = new ImageIcon(getClass().getResource("/imagen/pensandoo.png"));
        fondo1 = new ImageIcon(imagen1.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        imagen2 = new ImageIcon(getClass().getResource("/imagen/comiendoo.png"));
        fondo2 = new ImageIcon(imagen2.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        try {
            while (true) {
                pensando();
                obj.obtenTenedor(num, "izq");
                obj.obtenTenedor(num, "der");
                comiendo();
                obj.devolverTenedor(num, "der");
                obj.devolverTenedor(num, "izq");

            }
        } catch (InterruptedException e) {

        }

    }

    public void comiendo() throws InterruptedException {
        System.out.println("Filosofo " + num + " comiendo.");
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/comiendoo.png")));
        label.setIcon(fondo2);
        Thread.sleep(rn.nextInt(10000) + 1);
    }

    public void pensando() throws InterruptedException {
        System.out.println("Filosofo " + num + " pensando.");
        label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/pensandoo.png")));
        label.setIcon(fondo1);
        Thread.sleep(rn.nextInt(10000) + 1);
    }

}
