
package filosofos1;
public class Tenedores{
    int[] Tenedores = {0, 0, 0, 0, 0};
    boolean tienetd,tieneti;
    public synchronized void obtenTenedor(int num, String lado) {
        if (lado.equals("izq")) {
            int tenedor = (num - 1) % 5;
            while (Tenedores[tenedor] == 1) {
                try {
                    wait();
                } catch (InterruptedException e) {
                }
            }
            while (Tenedores[tenedor] == 0) {
                System.out.println("Filosofo " + num + " toma el tenedor izquierdo numero " + tenedor);
                Tenedores[tenedor] = 1;
            }
        } else if (lado.equals("der")) {
            int tenedor = num % 5;
            while (Tenedores[tenedor] == 1) {
                try {
                    /*if(Tenedores[0]==0&&Tenedores[1]==0&&Tenedores[2]==0&&Tenedores[3]==0&&Tenedores[4]==0){
                        for (int i = 0; i < 5; i++) {
                            Tenedores[i]=1;
                        }
                    }*/
                    wait();
                    
                } catch (InterruptedException e) {
                }
            }
            while (Tenedores[tenedor] == 0) {
                System.out.println("Filosofo " + num+ " toma el tenedor derecho numero " + tenedor);
                Tenedores[tenedor] = 1;
            }
        }
    }

    public synchronized void devolverTenedor(int num, String lado) {
        if (lado.equals("izq")) {
            int tenedor = (num - 1) % 5;
            System.out.println("Filosofo " + num + " deja el tenedor izquierdo numero " + tenedor);
            Tenedores[tenedor] = 0;
            notify();
        } else if (lado.equals("der")) {
            int tenedor = num % 5;
            System.out.println("Filosofo " + num + " deja el tenedor derecho numero " + tenedor);
            Tenedores[tenedor] = 0;
            notify();
        }

    }
}
