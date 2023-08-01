package com.github.matheuscascao.ufg.poo.t011.Armario;

import java.util.ArrayList;

public class Prateleira {
    private ArrayList<Compartimento> compartimentos;

    public Prateleira() {
        compartimentos = new ArrayList<>();
    }

    public void adicionarCompartimento(Compartimento compartimento) {
        compartimentos.add(compartimento);
    }
}