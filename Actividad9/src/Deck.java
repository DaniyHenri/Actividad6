//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.*;

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

        while (var1.hasNext()) {
            Card x = (Card) var1.next();
            System.out.print(x);
        }


        return null;
    }

    public Object head() {
        System.out.println(this.ListaCard.get(0));
        System.out.println("Primer carta del Juego");
        this.ListaCard.remove(0);
        System.out.println("Quedan " + this.ListaCard.size() + " cartas en Deck.");
        return null;
    }

    public Object pick() {
        Random random = new Random();
        System.out.println(this.ListaCard.get(random.nextInt(this.ListaCard.size())));
        System.out.println("Seleccionamos una carta al azar");
        this.ListaCard.remove(random.nextInt(this.ListaCard.size()));
        System.out.println("Quedan " + this.ListaCard.size() + " cartas");
        return null;
    }

    public Object hand() {
        int i;
        for (i = 0; i <= 4; ++i) {
            System.out.println(this.ListaCard.get(i));
        }

        for (i = 0; i <= 4; ++i) {
            this.ListaCard.remove(i);
        }

        System.out.println("Repartimos 5 cartas");
        System.out.println("Quedan " + this.ListaCard.size() + " cartas");
        return null;
    }

    //Metodo para cambiar cartas
    public Object cambiar() {

        int numC;
        System.out.println("Cuantas cartas quieres del 1 al 5");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch(opcion) {
            case 1: {
                for(numC = 0; numC <= 0; ++numC) {
                    System.out.println(this.ListaCard.get(numC));
                }
                for(numC = 0; numC <= 0; ++numC) {
                    this.ListaCard.remove(numC );
                }
                System.out.println("Quedan " + this.ListaCard.size() + " cartas");
                break;
            }

            case 2: {
                for(numC = 0; numC <= 1; ++numC) {
                    System.out.println(this.ListaCard.get(numC));
                }
                for(numC = 0; numC <= 1; ++numC) {
                    this.ListaCard.remove(numC );
                }
                System.out.println("Quedan " + this.ListaCard.size() + " cartas");
                break;
            }

            case 3: {
                for(numC = 0; numC <= 2; ++numC) {
                    System.out.println(this.ListaCard.get(numC));
                }
                for(numC = 0; numC <= 2; ++numC) {
                    this.ListaCard.remove(numC );
                }
                System.out.println("Quedan " + this.ListaCard.size() + " cartas");
                break;
            }

            case 4: {
                for(numC = 0; numC <= 3; ++numC) {
                    System.out.println(this.ListaCard.get(numC));
                }

                for(numC = 0; numC <= 3; ++numC) {
                    this.ListaCard.remove(numC );
                }
                System.out.println("Quedan " + this.ListaCard.size() + " cartas");
                break;
            }

            case 5: {
                for(numC = 0; numC <= 4; ++numC) {
                    System.out.println(this.ListaCard.get(numC));
                }
                for(numC = 0; numC <= 4; ++numC) {
                    this.ListaCard.remove(numC );
                }
                System.out.println("Quedan " + this.ListaCard.size() + " cartas");
                break;
            }

            default:{
                System.out.println("No corresponde a ningun numero");
            }
        }

        return null;
    }
}







