//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.*;
import java.util.Scanner;

public class Deck {
    public ArrayList<Card> ListaCard = new ArrayList(52);

    public Deck() {
        this.ListaCard.add(new Card("Trebol", "Negro", "2"));
        this.ListaCard.add(new Card("Trebol", "Negro", "3"));
        this.ListaCard.add(new Card("Trebol", "Negro", "4"));
        this.ListaCard.add(new Card("Trebol", "Negro", "5"));
        this.ListaCard.add(new Card("Trebol", "Negro", "6"));
        this.ListaCard.add(new Card("Trebol", "Negro", "7"));
        this.ListaCard.add(new Card("Trebol", "Negro", "8"));
        this.ListaCard.add(new Card("Trebol", "Negro", "9"));
        this.ListaCard.add(new Card("Trebol", "Negro", "10"));
        this.ListaCard.add(new Card("Trebol", "Negro", "A"));
        this.ListaCard.add(new Card("Trebol", "Negro", "J"));
        this.ListaCard.add(new Card("Trebol", "Negro", "Q"));
        this.ListaCard.add(new Card("Trebol", "Negro", "K"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "2"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "3"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "4"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "5"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "6"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "7"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "8"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "9"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "10"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "A"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "J"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "Q"));
        this.ListaCard.add(new Card("Corazon", "Rojo", "K"));
        this.ListaCard.add(new Card("Picas", "Negro", "2"));
        this.ListaCard.add(new Card("Picas", "Negro", "3"));
        this.ListaCard.add(new Card("Picas", "Negro", "4"));
        this.ListaCard.add(new Card("Picas", "Negro", "5"));
        this.ListaCard.add(new Card("Picas", "Negro", "6"));
        this.ListaCard.add(new Card("Picas", "Negro", "7"));
        this.ListaCard.add(new Card("Picas", "Negro", "8"));
        this.ListaCard.add(new Card("Picas", "Negro", "9"));
        this.ListaCard.add(new Card("Picas", "Negro", "10"));
        this.ListaCard.add(new Card("Picas", "Negro", "A"));
        this.ListaCard.add(new Card("Picas", "Negro", "J"));
        this.ListaCard.add(new Card("Picas", "Negro", "Q"));
        this.ListaCard.add(new Card("Picas", "Negro", "K"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "2"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "3"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "4"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "5"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "6"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "7"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "8"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "9"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "10"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "A"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "J"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "Q"));
        this.ListaCard.add(new Card("Diamante", "Rojo", "K"));
    }

    public int getSize() {
        return this.ListaCard.size();
    }

    public ArrayList<Card> getDeck() {
        return this.ListaCard;
    }

    public Object shuflle() {
        Collections.shuffle(this.ListaCard);
        System.out.println("Se mezcló el Deck.");
        Iterator var1 = this.ListaCard.iterator();
        return null;
    }

    public Object head() throws Exception {
        System.out.println(this.ListaCard.get(0));
        System.out.println("Primer carta del Juego");
        this.ListaCard.remove(0);
        System.out.println("Quedan " + this.ListaCard.size() + " cartas en Deck.");
        if (ListaCard.size() == 0) {
            throw new Exception("Se han agotado las cartas");
        }
        return null;
    }

    public void pick() throws Exception {
        Random random= new Random();
        System.out.println(ListaCard.get(random.nextInt(ListaCard.size())));
        System.out.println("Seleccionamos una carta al azar");
        ListaCard.remove(random.nextInt(ListaCard.size()));
        System.out.println("Quedan " + this.ListaCard.size() + " cartas en Deck.");
        if (ListaCard.size() == 0) {
            throw new Exception("Se han agotado las cartas");
        }
    }


    public void hand() throws Exception {
        if (  ListaCard.size()==0) {
            throw new Exception("Se han agotado las cartas");
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println(ListaCard.get(i));
        }
        for (int i = 0; i <= 4; i++){
            for (i = 0; i <= 4; i++) {
                ListaCard.remove(i);
            }
                System.out.println("Repartimos 5 cartas");
                System.out.println("Quedan " + this.ListaCard.size() + " cartas en Deck.");
            }
    }

        //Metodo para cambiar cartas
        public Card[] cambiar(int numCartas) throws Exception {
            if (numCartas > ListaCard.size()) {
                throw new Exception("Se han agotado las cartas");
            }
            Card[] cambiar = new Card[numCartas];
            for (int i = 0; i < 5; i++) {
                cambiar[i] = ListaCard.remove(0);
            }
            System.out.println("Se tomaron " + numCartas + " cartas del deck.");
            System.out.println("Quedan " + this.ListaCard.size() + " cartas en Deck.");
            return cambiar;
        }


        public void mostrarMenu () throws Exception {

            Scanner scanner = new Scanner(System.in);
            int opcion = 0;
            Deck deck = new Deck();
            do {

                System.out.println("Seleccionar una opcion:");
                System.out.println("1. Para revolver las cartas");
                System.out.println("2. Para sacar la primera carta.");
                System.out.println("3. Para sacar una carta al azar.");
                System.out.println("5. Para sacar cinco cartas al azar.");
                System.out.println("5. Para elegir cuantas cartas quieres cambiar.");
                System.out.println("6. Salir");
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        deck.shuflle();
                        break;
                    case 2:
                        deck.head();
                        break;
                    case 3:
                        deck.pick();
                        break;
                    case 4:
                        deck.hand();
                        break;
                    case 5:
                        System.out.println("¿Cuántas cartas desea tomar? (1-5)");
                        int numCartas = scanner.nextInt();
                        try {
                            Card[] cambiar = deck.cambiar(numCartas);
                            for (Card card : cambiar) {
                                System.out.println(card);
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                        break;
                    case 6:
                        System.out.println("Salir");
                        break;
                    default:
                        System.out.println("Opción inválida, intente de nuevo.");
                        break;
                }

            }
            while (opcion != 0);

            scanner.close();


        }
    }

    








