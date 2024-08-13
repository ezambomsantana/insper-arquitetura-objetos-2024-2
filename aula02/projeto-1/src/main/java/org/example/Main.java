package org.example;

import org.example.csv.CsvReader;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        CsvReader reader = new CsvReader("clubes.csv");
        reader.readCsv();

        ArrayList<PosicaoClube> data = reader.getData();
        for (PosicaoClube row : data) {
            System.out.println(row.ano);
            System.out.println(row.clube);
            System.out.println(row.vitorias);
        }

        // 1 - Quantas vitórias teve o Botafogo no total?
        // 2 - Quantas vitórias teve o Corinthians em 2015
        // 3 - Quantas vitórias, derrotas e empates hoouveram no total?
        // 4 - Qual time teve mais vitórias, palmeiras ou corinthians?
        // 5 - Adicione na classe PosicaoClube os gols pró e contra
        // 6 - Adicione na classe CsvReader a leitura dos gols pró e contra, note que os dados estão em uma única célula, separados por um :
        // 7 - Some o total de gols feitos por todos os times em 2015

    }

}