import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ordenar {
    //Metodo ordenar por longitud clase aninima
    public static void LongitudClaseAnonima(List<String> lista) {
        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());

            }
        });

        System.out.println("\nLongitud clase anonima: " + lista);
    }

    //Metodo ordenar por longitud lambda
    public static void LongitudLambda(List<String> lista) {
        lista.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        System.out.println("\nLongitud lambda " + lista);
    }


    //Metodo ordenar por Alfabetico clase anonima
    public static void AlfabeticoClaseAnonima(List<String> lista) {
        lista.sort(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        System.out.println("\nAlfabetico clase anonima: " + lista);
    }


    //Metodo ordenar por Alfabetico Lambda
    public static void AlfabeticoLambda(List<String> lista) {
        lista.sort((s1, s2) -> s1.compareTo(s2));
        System.out.println("\nAlfabetico lambda: " + lista);
    }
}


