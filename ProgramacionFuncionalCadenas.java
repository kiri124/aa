import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class ProgramacionFuncionalCadenas {
    public static void main(String[] args) {

        List<String> cadenasAleatorias = generarCadenasAleatorias(5, 10);


        long numCadenasVacias = cadenasAleatorias.stream().filter(String::isEmpty).count();


        long numCadenasLongitudSuperior5 = cadenasAleatorias.stream().filter(s -> s.length() > 5).count();


        long numCadenasComienzanConS = cadenasAleatorias.stream().filter(s -> s.startsWith("s") || s.startsWith("S")).count();


        List<String> listaSinCadenasVacias = cadenasAleatorias.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());


        List<String> listaCadenasMasDe5Caracteres = cadenasAleatorias.stream().filter(s -> s.length() > 5).collect(Collectors.toList());


        String resultado = cadenasAleatorias.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(","));


        System.out.println("Cadenas aleatorias: " + cadenasAleatorias);
        System.out.println("Cadenas vacías: " + numCadenasVacias);
        System.out.println("Cadenas con longitud superior a 5: " + numCadenasLongitudSuperior5);
        System.out.println("Cadenas que comienzan con 's': " + numCadenasComienzanConS);
        System.out.println("Lista sin cadenas vacías: " + listaSinCadenasVacias);
        System.out.println("Cadenas con más de 5 caracteres: " + listaCadenasMasDe5Caracteres);
        System.out.println("Cadenas en mayúsculas separadas por comas: " + resultado);
    }

    public static List<String> generarCadenasAleatorias(int cantidad, int longitud) {
        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        List<String> cadenas = new java.util.ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < longitud; j++) {
                int indice = random.nextInt(caracteres.length());
                sb.append(caracteres.charAt(indice));
            }
            cadenas.add(sb.toString());
        }
        return cadenas;
    }
}
