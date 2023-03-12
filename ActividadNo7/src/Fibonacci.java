public class Fibonacci {
    public int[] n = new int[100];
    int var = 1;
    int x = 0;
    int y = 0;
    public int contador = 0;

    public void ImprimirFibonacci() {
        for (int n = 0; n <= 100; n++) {
            System.out.println(String.valueOf(y) + " , ");
            {
                x = y;
                y = var;
                var = x + y;
            }

        }

    }
}