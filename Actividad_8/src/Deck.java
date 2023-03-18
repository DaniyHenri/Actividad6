import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Deck {
    public ArrayList<Card> ListaCard; //deck

    //Constructor
    public Deck() {
        ListaCard = new ArrayList<Card>(52);
        ListaCard.add(new Card("Trebol", "Negro", "2"));
        ListaCard.add(new Card("Trebol", "Negro", "3"));
        ListaCard.add(new Card("Trebol", "Negro", "4"));
        ListaCard.add(new Card("Trebol", "Negro", "5"));
        ListaCard.add(new Card("Trebol", "Negro", "6"));
        ListaCard.add(new Card("Trebol", "Negro", "7"));
        ListaCard.add(new Card("Trebol", "Negro", "8"));
        ListaCard.add(new Card("Trebol", "Negro", "9"));
        ListaCard.add(new Card("Trebol", "Negro", "10"));
        ListaCard.add(new Card("Trebol", "Negro", "A"));
        ListaCard.add(new Card("Trebol", "Negro", "J"));
        ListaCard.add(new Card("Trebol", "Negro", "Q"));
        ListaCard.add(new Card("Trebol", "Negro", "K"));
        ListaCard.add(new Card("Corazon", "Rojo", "2"));
        ListaCard.add(new Card("Corazon", "Rojo", "3"));
        ListaCard.add(new Card("Corazon", "Rojo", "4"));
        ListaCard.add(new Card("Corazon", "Rojo", "5"));
        ListaCard.add(new Card("Corazon", "Rojo", "6"));
        ListaCard.add(new Card("Corazon", "Rojo", "7"));
        ListaCard.add(new Card("Corazon", "Rojo", "8"));
        ListaCard.add(new Card("Corazon", "Rojo", "9"));
        ListaCard.add(new Card("Corazon", "Rojo", "10"));
        ListaCard.add(new Card("Corazon", "Rojo", "A"));
        ListaCard.add(new Card("Corazon", "Rojo", "J"));
        ListaCard.add(new Card("Corazon", "Rojo", "Q"));
        ListaCard.add(new Card("Corazon", "Rojo", "K"));
        ListaCard.add(new Card("Picas", "Negro", "2"));
        ListaCard.add(new Card("Picas", "Negro", "3"));
        ListaCard.add(new Card("Picas", "Negro", "4"));
        ListaCard.add(new Card("Picas", "Negro", "5"));
        ListaCard.add(new Card("Picas", "Negro", "6"));
        ListaCard.add(new Card("Picas", "Negro", "7"));
        ListaCard.add(new Card("Picas", "Negro", "8"));
        ListaCard.add(new Card("Picas", "Negro", "9"));
        ListaCard.add(new Card("Picas", "Negro", "10"));
        ListaCard.add(new Card("Picas", "Negro", "A"));
        ListaCard.add(new Card("Picas", "Negro", "J"));
        ListaCard.add(new Card("Picas", "Negro", "Q"));
        ListaCard.add(new Card("Picas", "Negro", "K"));
        ListaCard.add(new Card("Diamante", "Rojo", "2"));
        ListaCard.add(new Card("Diamante", "Rojo", "3"));
        ListaCard.add(new Card("Diamante", "Rojo", "4"));
        ListaCard.add(new Card("Diamante", "Rojo", "5"));
        ListaCard.add(new Card("Diamante", "Rojo", "6"));
        ListaCard.add(new Card("Diamante", "Rojo", "7"));
        ListaCard.add(new Card("Diamante", "Rojo", "8"));
        ListaCard.add(new Card("Diamante", "Rojo", "9"));
        ListaCard.add(new Card("Diamante", "Rojo", "10"));
        ListaCard.add(new Card("Diamante", "Rojo", "A"));
        ListaCard.add(new Card("Diamante", "Rojo", "J"));
        ListaCard.add(new Card("Diamante", "Rojo", "Q"));
        ListaCard.add(new Card("Diamante", "Rojo", "K"));
    }
    public int getSize() {
        return ListaCard.size(); //Metodo para imprimir las cartas
    }

    public ArrayList<Card> getDeck() {  //Imprime la cartas
        return ListaCard;
    }

    public void shuflle() {
        Collections.shuffle(ListaCard);
        System.out.println("Se mezcló el Deck.");
        for (Card x : ListaCard) {
            System.out.print(x);
        }
    }


    // El método get al igual que el set, es un método público,
    // pero el get se encarga de mostrar un valor a una propiedad o atributo de un objeto
    public void head() {
        System.out.println(ListaCard.get(0));
        System.out.println("Primer carta del Juego");
        ListaCard.remove(0);   //El elemento remove se encarga de eliminar cartas del mazo
        System.out.println("Quedan " + ListaCard.size() + " cartas en Deck.");

    }

    //.Size se encarga de contar los elementos que hay en la lista
    public void pick() {
        Random random = new Random();//Random nos sirve para generar valores aleatorios
        System.out.println(ListaCard.get(random.nextInt(ListaCard.size())));
        System.out.println("Seleccionamos una carta al azar");
        ListaCard.remove(random.nextInt(ListaCard.size()));//nextInt Genera un nuevo valor tipo Integer pseudoaleatorio.
        System.out.println("Quedan " + ListaCard.size() + " cartas");//size Regresa el tamaño del HashSet.
    }

        public void hand () {
            for (int i = 0; i <= 4; i++) {
                System.out.println(ListaCard.get(i));
            }
            for (int i = 0; i <= 4; i++) {
                ListaCard.remove(i); //Aqui sacamos 5 cartas de mazo( empezando 0,1,2,3,4) Por eso es mayor o igual
            }
            System.out.println("Repartimos 5 cartas");
            System.out.println("Quedan " + ListaCard.size() + " cartas");
        }
    }








