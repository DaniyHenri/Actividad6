public class NumerosPrimos {

    int [] n = new int[100];

    int contador;


    public void ImpNumPri() {
        for (int i = 0; i<100; i++) {
            n[i]=i;
            contador=0;
            for(int j=1; j<n.length; j++){
                if ((n[i] % j) == 0){
                    contador++;
                }
            }
            if (contador==2){
                System.out.println(n[i]+" ");
            }

        }
        System.out.println();
    }
}
