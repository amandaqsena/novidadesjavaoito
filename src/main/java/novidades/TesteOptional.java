package novidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class TesteOptional {
    public static void main(String[] args){
        List<Curso> cursos = new ArrayList<Curso>();
        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));
    
        Optional<Curso> optional = cursos.stream()
            .filter(c -> c.getAlunos() > 100)
            .findAny();
        
        //Curso curso = optional.get(); // pode gerar exception

        Curso curso = optional.orElse(null);
        System.out.println(curso);

        optional.ifPresent(c -> System.out.println(c.getNome()));

        cursos.stream()
            .filter(c -> c.getAlunos() > 100)
            .findAny()
            .ifPresent(c -> System.out.println(c.getNome()));

        Map<String,Integer> mapa = cursos 
            .stream() 
            .filter(c -> c.getAlunos() > 100) 
            .collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()));
        
        mapa.forEach((nome,alunos) ->
                System.out.format("O curso %s possui %d alunos \n",
                nome, alunos));

        //média

        cursos.stream()
            .mapToInt(c -> c.getAlunos())
            .average();
    }
    
}
