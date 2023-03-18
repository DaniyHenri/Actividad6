import java.util.ArrayList;
public class Main {
        public static void main(String[] args) {

            Deck juego = new Deck();

            System.out.println("Iniciamos el juego con: " + juego.getSize()+ " cartas.");

            for (Card x : juego.getDeck()) {
                System.out.print(x );
            }
            System.out.println("\n");
            juego.shuflle();
            System.out.println("\n");
            juego.head();
            System.out.println("\n");
            juego.pick();
            System.out.println("\n");
            juego.hand();
        }
    }




