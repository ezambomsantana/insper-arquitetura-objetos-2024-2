package br.insper.biblioteca;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.setNome("Biblioteca Insper");
        biblioteca.setEndereco("Rua ABC");

        Usuario usuario = new Usuario();
        usuario.setNome("eduardo");
        usuario.setEmail("a@a.com");
        usuario.setEndereco("Rua xyz");

        usuario.setBiblioteca(biblioteca);
        biblioteca.adicionaUsuario(usuario);

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.setCodigo("EMP1");
        emprestimo.setStatus("FINALIZADO");
        emprestimo.setDataDevolucao(LocalDateTime.now());

        emprestimo.setUsuario(usuario);
        usuario.adicionaEmprestimo(emprestimo);



    }

}
