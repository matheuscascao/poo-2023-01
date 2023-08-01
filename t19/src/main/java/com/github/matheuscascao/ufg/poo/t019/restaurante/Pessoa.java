package com.github.matheuscascao.ufg.poo.t019.restaurante;

    abstract class Pessoa {
        private String nome;

        // Construtor
        public Pessoa(String nome) {
            this.nome = nome;
        }


        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }
