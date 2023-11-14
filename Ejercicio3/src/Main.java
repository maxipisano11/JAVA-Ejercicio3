import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static List<String> aMayusculas(List<String> lista){
        return lista.stream().map(palabra -> palabra.toUpperCase()).toList();
    }

    public static String palabrasLargas(List<String> lista, int longitud){
        return lista.stream().filter(palabra -> palabra.length() > longitud)
                .collect(Collectors.joining(", "));
    }

    public static void main(String[] args) {
        List<String> listaInicial = List.of("Perro", "casa", "AUTO", "cocina");
        System.out.println(aMayusculas(listaInicial));
        System.out.println(palabrasLargas(listaInicial, 4));

    }
}