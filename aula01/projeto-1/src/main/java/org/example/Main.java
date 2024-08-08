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

    }

}