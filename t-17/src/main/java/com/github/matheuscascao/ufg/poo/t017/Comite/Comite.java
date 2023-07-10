package com.github.matheuscascao.ufg.poo.t017.Comite;

import java.util.ArrayList;

public class Comite {
    ArrayList<Pessoa> presidentes;
    ArrayList<Pessoa> membros;

    public Comite() {
        presidentes = new ArrayList<>();
        membros = new ArrayList<>();
    }

    public void adicionarPresidente(Pessoa presidente) {
        if (presidentes.size() < 3) {
            presidentes.add(presidente);
        } else {
            System.out.println("O comitê já possui o número máximo de presidentes.");
        }
    }

}
