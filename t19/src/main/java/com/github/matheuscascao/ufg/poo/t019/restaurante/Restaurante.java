package com.github.matheuscascao.ufg.poo.t019.restaurante;
import java.util.List;
import java.util.ArrayList;

    class Restaurante {
        private List <Mesa> mesas;

        // Construtor
        public Restaurante() {
            this.mesas = new ArrayList <> ( );
        }

        // Método para adicionar uma mesa ao restaurante
        public void adicionarMesa(Mesa mesa) {
            mesas.add (mesa);


        }
    }


