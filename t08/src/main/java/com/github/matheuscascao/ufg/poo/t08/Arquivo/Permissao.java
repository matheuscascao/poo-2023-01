package com.github.matheuscascao.ufg.poo.t08.Arquivo;

public class Permissao {
    private Grupo grupo;
    private Arquivo arquivo;

    public Permissao(Grupo grupo, Arquivo arquivo) {
        this.grupo = grupo;
        this.arquivo = arquivo;
    }
}
