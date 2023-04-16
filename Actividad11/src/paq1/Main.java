package paq1;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //Aqui inicia el menu
        Scanner scanner = new Scanner(System.in);
        int option;
        Shape shape = null;

        do {
            System.out.println("Seleccione la propiedad a calcular:");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.println("3. Salir");
            option = scanner.nextInt();

            if (option == 1 || option == 2) {
                System.out.println("Seleccionar la figura:");
                System.out.println("1. Círculo");
                System.out.println("2. Triángulo");
                System.out.println("3. Cuadrado");
                System.out.println("4. Rectangulo");
                int figure = scanner.nextInt();

                switch (figure) {
                    case 1:
                        System.out.println("Ingrese el radio del círculo:");
                        double radius = scanner.nextDouble();
                        shape = new Circle(radius);
                        break;
                    case 2:
                        System.out.println("Ingrese el lado del triangulo:");
                        double sideLenght = scanner.nextDouble();
                        shape = new Triangle(sideLenght);
                        break;
                    case 3:
                        System.out.println("Ingrese el lado del cuadrado:");
                        double side = scanner.nextDouble();
                        shape = new Square(side);
                        break;
                    case 4:
                        System.out.println("Ingrese el largo rectángulo:");
                        double altura = scanner.nextDouble();
                        System.out.println("Ingrese el ancho rectángulo:");
                        double base = scanner.nextDouble();
                        shape = new Rectangle(altura,base);
                        break;
                }

                if (option == 1) {
                    System.out.println("El área es: "+ shape.area());
                } else {
                    System.out.println("El perímetro es: " + shape.perimeter());
                }
            }

        } while (option != 3);

        scanner.close();


    }

}
