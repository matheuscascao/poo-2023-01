package com.github.matheuscascao.ufg.poo.t019.restaurante;
class Mesa extends Pessoa {
    private int numero;
    private int capacidade;

    public Mesa(String nome, int numero, int capacidade) {
        super (nome);
        this.numero = numero;
        this.capacidade = capacidade;
    }
}
