package novidades;

import java.util.function.Function;

public class ExemploUsuario {
    public static void main(String[] args){
        //Function<Usuario, String> funcao = u -> u.getNome();
        // pode ser escrito como
        Function<Usuario, String> funcao = Usuario::getNome;

        Usuario u = new Usuario();
        u.setNome("Amanda");
        
        System.out.println(funcao.apply(u));
    }
}

class Usuario{
    private String nome;
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
