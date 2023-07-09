package com.github.matheuscascao.ufg.poo.t011.Armario;

import java.util.ArrayList;

public class Compartimento {
    private ArrayList<Livro> livros;
    private ArrayList<CD> cds;

    public Compartimento() {
        livros = new ArrayList<>();
        cds = new ArrayList<>();
    }

    public void adicionarLivro(Livro livro) {
        if (livros.size() < 3) {
            livros.add(livro);
        } else {
            System.out.println("O compartimento já está cheio de livros.");
        }
    }

    public void adicionarCD(CD cd) {
        if (cds.size() == 2 || cds.size() == 4 || cds.size() == 7 || cds.size() > 7) {
            System.out.println("O compartimento já está cheio de CDs.");
        } else {
            cds.add(cd);
        }
    }

}