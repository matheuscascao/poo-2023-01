package com.github.matheuscascao.ufg.poo.t09.CirculoPonto;

public class Circulo {
    Ponto centro;
    Integer raio;

    public void transladar(int x, int y){
        this.centro.x = x;
        this.centro.y = y;
    }
}
