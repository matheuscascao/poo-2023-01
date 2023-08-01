package com.github.matheuscascao.ufg.poo.t019.onibus;
import  java.util.List;
import java.util.ArrayList;
public class Viagem {
    private String origem;
    private String destino;
    private String horarioPartida;
    private String horarioChegada;
    private Motorista motorista;
    private List <Passageiro> passageiros;


    public Viagem(String origem, String destino, String horarioPartida, String horarioChegada, Motorista motorista) {
        this.origem = origem;
        this.destino = destino;
        this.horarioPartida = horarioPartida;
        this.horarioChegada = horarioChegada;
        this.motorista = motorista;
        this.passageiros = new ArrayList <> ( );
    }
}