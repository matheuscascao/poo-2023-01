package com.github.matheuscascao.ufg.poo.t018;

public class Lance {
    Posicao origem;
    Posicao destino;
    Peca peca;
    Jogador jogador;

    public Lance(Posicao origem, Posicao destino, Peca peca, Jogador jogador) {
        this.origem = origem;
        this.destino = destino;
        this.peca = peca;
        this.jogador = jogador;
    }
}
