package com.github.matheuscascao.ufg.poo.t011.Armario;

public class Compartimento {
    private List<Livro> livros;
    private List<CD> cds;

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