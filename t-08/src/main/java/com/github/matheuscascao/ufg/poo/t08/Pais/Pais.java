package com.github.matheuscascao.ufg.poo.t08.Pais;

import java.util.ArrayList;

public class Pais {
    String nomePais;
    ArrayList<Cidade> cidades;
    Cidade capital;

    public Pais(String nomePais, ArrayList cidades, Cidade capital){
        this.nomePais = nomePais;
        this.cidades = cidades;
    }

}
