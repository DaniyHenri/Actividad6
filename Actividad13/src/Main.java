import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();
        lista.add("perro");
        lista.add("caballo");
        lista.add("aguila");
        lista.add("gato");
        lista.add("conejo");
        lista.add("jirafa");
        lista.add("elefante");
        lista.add("leon");
        lista.add("cocodrilo");


        //Imprecion de metodos
        Ordenar.LongitudClaseAnonima(lista);
        Ordenar.LongitudLambda(lista);
        Ordenar.AlfabeticoClaseAnonima(lista);
        Ordenar.AlfabeticoLambda(lista);

    }
}
