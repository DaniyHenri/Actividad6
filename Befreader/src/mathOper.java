
interface MathOperation {
    double make(double a, double b);
}

public class mathOper {

    public static void main(String[] args) {

        double x = 10.0;
        double y = 5;

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation prod = (a, b) -> a * b;
        MathOperation div = (a, b) -> a / b;

        System.out.println(" Add = " + add.make(x, y));
        System.out.println(" Sub = " + sub.make(x, y));
        System.out.println("Prod = " + prod.make(x, y));
        System.out.println(" Div = " + div.make(x, y));

    }

}