package novidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings{
    public static void main(String[] args){
        List<String> palavras = new ArrayList<>();
        palavras.add("Amanda");
        palavras.add("Queiroz");
        palavras.add("Sena");


        Collections.sort(palavras);
        System.out.println(palavras);

        Comparator<String> comparador = new ComparadorDeStringPorTamanho();
        //Collections.sort(palavras, comparador);
        palavras.sort(comparador);//método default da interface list
        
        // enhanced for
        //for (String p: palavras){
        //    System.out.println(p);
        //}

        Consumer<String> consumidor = new ImprimeNaLinha();
        palavras.forEach(consumidor);

        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executando um Runnable");
            }
        
        }).start();
    }
    
}

class ComparadorDeStringPorTamanho implements Comparator<String>{

    @Override
    public int compare(String s1, String s2) {
        if(s1.length() < s2.length()) 
            return -1;
        if(s1.length() > s2.length()) 
            return 1;
        return 0;
    }

}

class ImprimeNaLinha implements Consumer<String>{

    @Override
    public void accept(String s) {
        System.out.println(s);
    }

}