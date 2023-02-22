package novidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import static java.util.Comparator.*;

public class SimplificandoMaisComMethodReferences {
    public static void main(String[] args){
        List<String> palavras = new ArrayList<>();
        palavras.add("Amanda");
        palavras.add("Queiroz");
        palavras.add("Sena");
        
        Function<String, Integer> funcao = s -> s.length();
        Comparator<String> comparador = Comparator.comparing(funcao);
        palavras.sort(comparador);

        // forma mais simples
        palavras.sort(Comparator.comparing(String::length));

        // importando estaticamente, pode ficar ainda mais simples
        palavras.sort(comparing(String::length));

        //usando method reference para printar

        palavras.forEach(System.out::println);

        // podemos fazer

        Consumer<String> impressora = System.out::println;
        palavras.forEach(impressora);

        // outro criterio de comparacao
        palavras.sort(String.CASE_INSENSITIVE_ORDER);
    }
}
