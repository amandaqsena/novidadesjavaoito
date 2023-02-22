package novidades;

import java.util.function.Function;

public class ExemploUsuario {
    public static void main(String[] args){
        //Function<Usuario, String> funcao = u -> u.getNome();
        // pode ser escrito como
        Function<Usuario, String> funcao = Usuario::getNome;
    }
}

class Usuario{
    private String nome;
    public String getNome(){
        return this.nome;
    }
}
