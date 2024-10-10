package br.insper.banda.banda;

import br.insper.banda.musica.Musica;

import java.util.List;

record CadastrarBandaDTO
        (String nome, String pais, Integer anoFormacao) {
}

record RetornarBandaDTO(String id, String nome, String pais) {}

record EditarBandaDTO(String nome, String pais) {}

record ListaMusicasBanda(String nome, List<Musica> musicas) {}
