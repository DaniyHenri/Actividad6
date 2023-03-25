import javax.swing.*;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deck juego = new Deck();

        //Aqui inicia el switch
        int opcion = 0;

        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido \n Ingresar un numero del 1 al 5 \n 1: Para revolver las cartas. \n 2: Para sacar la primer carta. \n 3: Para sacar una carta al azar. \n 4: Para sacar 5 cartas al azar. \n 5: Para elegir cuantas cartas quieres cambiar."));
        System.out.println("Bienvenido");
        System.out.println("Iniciamos el juego con: " + juego.getSize() + " cartas.");
        Iterator var2 = juego.getDeck().iterator();


        switch (opcion) {

            case 1: {
                JOptionPane.showMessageDialog(null, juego.shuflle());
                break;
            }
            case 2: {
                JOptionPane.showMessageDialog(null, juego.head());
                break;
            }
            case 3: {
                JOptionPane.showMessageDialog(null, juego.pick());
                break;
            }
            case 4: {
                JOptionPane.showMessageDialog(null, juego.hand());
                break;
            }
            case 5: {
                JOptionPane.showMessageDialog(null, juego.cambiar());
                break;
            }
            default: {
                System.out.println("No corresponde a ningun numero");
            }
        }

    }
}

