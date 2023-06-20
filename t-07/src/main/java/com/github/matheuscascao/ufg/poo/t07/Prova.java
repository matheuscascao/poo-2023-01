package com.github.matheuscascao.ufg.poo.t07;

public class Prova {
    private Integer numeroDeQuestoes;

    Integer getNumeroDeQuestoes() {
        return numeroDeQuestoes;
    }
    Integer getNumeroDeQuestoes(int n) {
        if(n>0) {
            return(numeroDeQuestoes = n);
        }
        return 0;
    }
}