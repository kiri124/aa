import java.util.IntSummaryStatistics;
import java.util.Arrays;
import java.util.List;

public class EstadisticasNumeros {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 8, 5, 12, 3, 15, 7, 10);

        IntSummaryStatistics stats = numeros.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        System.out.println("Recuento: " + stats.getCount());
        System.out.println("Mínimo: " + stats.getMin());
        System.out.println("Máximo: " + stats.getMax());
        System.out.println("Suma: " + stats.getSum());
        System.out.println("Promedio: " + stats.getAverage());
    }
}
