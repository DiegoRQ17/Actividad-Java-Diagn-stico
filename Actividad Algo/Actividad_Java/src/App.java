import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> miLista = new ArrayList<>();
        //Agregue los numeros iguales para ver si no me agregaba los numeros iguales en el segundo metodo
        //Agregue mas de dos numeros consecutivos para ver si los agregaba bien
        miLista.add(27);
        miLista.add(6);
        miLista.add(1);
        miLista.add(2);
        miLista.add(3);
        miLista.add(4);
        miLista.add(14);
        miLista.add(8);
        miLista.add(8);
        miLista.add(9);
        miLista.add(9);
        miLista.add(12);
        miLista.add(13);


        int cantidad = ListAnalyzer.contadorImpares(miLista);

        System.out.println( "Cantidad de numeros impares: " + cantidad ); 

        List<Integer> numConsecutivos = ListAnalyzer.numerosConsecutivos(miLista);
        System.out.println("Numeros consecutivos de la lista: " + numConsecutivos);
    }
}
