//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.swing.*;

public class Card {
    public String palo;
    public String color;
    public String valor;

    public String num;




    public Card(String palo, String color, String valor) {
        this.color = color;
        this.palo = palo;
        this.valor = valor;

    }

    public String toString() {
        return "\nPalo: " + this.palo + "  Color: " + this.color + "  Valor: " + this.valor;
    }
}
