package novidades;
import java.util.ArrayList;
import java.util.List;


public class SimplificandoComLambdas {
    public static void main(String[] args){
        List<String> palavras = new ArrayList<>();
        palavras.add("Amanda");
        palavras.add("Queiroz");
        palavras.add("Sena");



        System.out.println(palavras);

        palavras.sort((s1, s2) -> {
            if(s1.length() < s2.length()) 
                return -1;
            if(s1.length() > s2.length()) 
                return 1;
            return 0;
        });

        // forma equivalente
        palavras.sort((s1, s2) -> 
            Integer.compare(s1.length(), s2.length()));
        
        // outra forma equivalente

        palavras.sort((s1, s2) -> s1.length() - s2.length());

        palavras.forEach(s->System.out.println(s));

        new Thread(() -> System.out.println("Executando um Runnable")).start();
    }
}
