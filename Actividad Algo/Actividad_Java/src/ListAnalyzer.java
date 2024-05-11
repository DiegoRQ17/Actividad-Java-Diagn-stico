import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {

    public static int contadorImpares(List<Integer> lista) {
        int contador = 0;
        for (int num : lista) {
            if (num % 2 != 0) {
                contador++;
            }
        }
        return contador;
    }

    public static List<Integer> numerosConsecutivos(List<Integer> lista) {
        List<Integer> consecutivos = new ArrayList<>();
        for (int i = 0; i < lista.size() - 1; i++) {
            //En este if veo si el numero actual+1 de la lista es igual al siguiente y si es asi es por que son consecutivos
            if (lista.get(i) + 1 == lista.get(i + 1)) {

                if (!consecutivos.contains(lista.get(i))){
                    consecutivos.add(lista.get(i));
                }

                if (!consecutivos.contains(lista.get(i+1))){
                    consecutivos.add(lista.get(i+1));
                }
            }
        }

        return consecutivos;
    }
}