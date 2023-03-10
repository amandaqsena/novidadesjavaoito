package novidades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemploCursos {
    public static void main(String[] args){
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        cursos.sort(Comparator.comparingInt(c -> c.getAlunos()));

        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        cursos.stream()
            .filter(c -> c.getAlunos() > 100)
            .map(Curso::getAlunos)
            .forEach(System.out::println);

        // streams primitivos

        IntStream stream = cursos.stream()
            .filter(c -> c.getAlunos() > 100)
            .mapToInt(Curso::getAlunos);

        int soma = stream.sum();

        System.out.println(
            "Soma de alunos dos cursos que mais possuem alunos: "
             + soma);


        // transformar o nosso Stream<Curso> em um Stream<String> 
        // contendo apenas os nomes dos cursos
        Stream<String> nomes = cursos.stream().map(Curso::getNome);
        nomes.forEach(System.out::println);
    }
}
