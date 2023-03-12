import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        NumerosPrimos NumP = new NumerosPrimos();
        System.out.println("Numeros primos: ");
        NumP.ImpNumPri();

        Fibonacci SucFib = new Fibonacci();
        System.out.println("Sucesion Fibonacci: ");
        SucFib.ImprimirFibonacci();


    }

}

