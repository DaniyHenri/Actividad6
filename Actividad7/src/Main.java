import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        //Variables
        String nombre;
        int suma= 0;
        float promedio;

        //Arreglo
        int[] calificacion = new int[5];

        //Entradas
        nombre = JOptionPane.showInputDialog("Captura el nombre del alumno (a): ");

        //Llenar el arreglo con las calificaciones


            System.out.println("Ingresar la calificacion de español: ");//Intentar agregar aqui las 6 calificaciones
            calificacion[0]=s.nextInt();

            System.out.println("Ingresar la calificacion de matematicas: ");//Intentar agregar aqui las 6 calificaciones
            calificacion[1]=s.nextInt();

            System.out.println("Ingresar la calificacion de Geografia: ");//Intentar agregar aqui las 6 calificaciones
            calificacion[2]=s.nextInt();

            System.out.println("Ingresar la calificacion de Historia: ");//Intentar agregar aqui las 6 calificaciones
            calificacion[3]=s.nextInt();

            System.out.println("Ingresar la calificacion de Civica y Etica: ");//Intentar agregar aqui las 6 calificaciones
            calificacion[4]=s.nextInt();

        for (int i = 0; i <calificacion.length; i++) {
            suma+=calificacion[i];

        }
            promedio=(suma/calificacion.length);

            //Crear el objeto
            Alumno num1 = new Alumno(nombre, calificacion, promedio);

            //Invocar metodo
            num1.Imprimir();

        if (promedio<=50){
            System.out.println("La calificacion final es F");
        }
        if (promedio>=51 && promedio<60){
            System.out.println("La calificacion final es E");
        }
        if (promedio>=61 && promedio<70){
            System.out.println("La calificacion final es D");
        }
        if (promedio>=71 && promedio<80){
            System.out.println("La calificacion final es C");
        }
        if (promedio>=81 && promedio<90){
            System.out.println("La calificacion final es B");
        }
        if (promedio>=91 && promedio<100){
            System.out.println("La calificacion final es A");
        }

    }

}