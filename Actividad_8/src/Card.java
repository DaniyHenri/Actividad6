public class Card {

    //Atributos
    public String palo;
    public String color;
    public String valor;

    //Constructor
    public Card (String palo, String color, String valor){
        this.color=color;
        this.palo=palo;
        this.valor=valor;
    }

    @Override
    public String toString() {
        return "\nPalo: " + palo + "  " + "Color: " + color +
                "  " + "Valor: " + valor;
    }

    }



