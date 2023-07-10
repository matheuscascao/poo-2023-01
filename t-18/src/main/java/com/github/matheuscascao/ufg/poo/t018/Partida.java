package com.github.matheuscascao.ufg.poo.t018;

public class Partida {
    Lance lances[];

    public Partida(Lance[] lances) {
        this.lances = lances;
    }

    public String toString() {
        StringBuilder partidaTextual = new StringBuilder();
        for (Lance lance : lances) {
            partidaTextual.append(lance.toString()).append(" ");
        }
        return partidaTextual.toString().trim();
    }

    public static void main(String[] args) {
        Posicao posicao1 = new Posicao("e2", 2);
        Posicao posicao2 = new Posicao("e4", 4);
        Posicao posicao3 = new Posicao("e7", 7);
        Posicao posicao4 = new Posicao("e5", 5);
        Posicao posicao5 = new Posicao("g1", 1);
        Posicao posicao6 = new Posicao("f3", 3);
        Posicao posicao7 = new Posicao("d8", 8);
        Posicao posicao8 = new Posicao("h4", 4);
        Posicao posicao9 = new Posicao("f7", 7);
        Posicao posicao10 = new Posicao("g5", 5);
        Posicao posicao11 = new Posicao("h5", 5);
        Posicao posicao12 = new Posicao("f8", 8);
        Posicao posicao13 = new Posicao("g8", 8);
        Posicao posicao14 = new Posicao("e1", 1);
        Posicao posicao15 = new Posicao("d2", 2);
        Posicao posicao16 = new Posicao("c3", 3);
        Posicao posicao17 = new Posicao("b4", 4);
        Posicao posicao18 = new Posicao("c6", 6);
        Posicao posicao19 = new Posicao("e8", 8);
        Posicao posicao20 = new Posicao("d7", 7);
        Posicao posicao21 = new Posicao("c4", 4);
        Posicao posicao22 = new Posicao("c5", 5);
        Posicao posicao23 = new Posicao("d4", 4);
        Posicao posicao24 = new Posicao("e6", 6);
        Posicao posicao25 = new Posicao("f6", 6);
        Posicao posicao26 = new Posicao("g6", 6);
        Posicao posicao27 = new Posicao("g7", 7);
        Posicao posicao28 = new Posicao("h6", 6);
        Posicao posicao29 = new Posicao("g3", 3);
        Posicao posicao30 = new Posicao("h3", 3);
        Posicao posicao31 = new Posicao("h8", 8);
        Posicao posicao32 = new Posicao("f2", 2);
        Posicao posicao33 = new Posicao("e3", 3);
        Posicao posicao34 = new Posicao("d6", 6);
        Posicao posicao35 = new Posicao("c7", 7);
        Posicao posicao36 = new Posicao("c8", 8);
        Posicao posicao37 = new Posicao("b8", 8);
        Posicao posicao38 = new Posicao("b7", 7);
        Posicao posicao39 = new Posicao("d1", 1);
        Posicao posicao40 = new Posicao("c1", 1);

        Peca peca1 = new Peca("Peão", posicao1);
        Peca peca2 = new Peca("Peão", posicao3);
        Peca peca3 = new Peca("Cavalo", posicao5);
        Peca peca4 = new Peca("Cavalo", posicao6);
        Peca peca5 = new Peca("Rainha", posicao7);
        Peca peca6 = new Peca("Bispo", posicao8);
        Peca peca7 = new Peca("Bispo", posicao9);
        Peca peca8 = new Peca("Torre", posicao10);
        Peca peca9 = new Peca("Rei", posicao11);
        Peca peca10 = new Peca("Torre", posicao12);
        Peca peca11 = new Peca("Rei", posicao13);
        Peca peca12 = new Peca("Rainha", posicao14);
        Peca peca13 = new Peca("Peão", posicao15);
        Peca peca14 = new Peca("Peão", posicao16);
        Peca peca15 = new Peca("Peão", posicao17);
        Peca peca16 = new Peca("Peão", posicao18);
        Peca peca17 = new Peca("Bispo", posicao19);
        Peca peca18 = new Peca("Peão", posicao20);
        Peca peca19 = new Peca("Cavalo", posicao21);
        Peca peca20 = new Peca("Cavalo", posicao22);
        Peca peca21 = new Peca("Bispo", posicao23);
        Peca peca22 = new Peca("Peão", posicao24);
        Peca peca23 = new Peca("Peão", posicao25);
        Peca peca24 = new Peca("Peão", posicao26);
        Peca peca25 = new Peca("Peão", posicao27);
        Peca peca26 = new Peca("Bispo", posicao28);
        Peca peca27 = new Peca("Cavalo", posicao29);
        Peca peca28 = new Peca("Cavalo", posicao30);
        Peca peca29 = new Peca("Rainha", posicao31);
        Peca peca30 = new Peca("Peão", posicao32);
        Peca peca31 = new Peca("Peão", posicao33);
        Peca peca32 = new Peca("Bispo", posicao34);
        Peca peca33 = new Peca("Peão", posicao35);
        Peca peca34 = new Peca("Torre", posicao36);
        Peca peca35 = new Peca("Torre", posicao37);
        Peca peca36 = new Peca("Rainha", posicao39);
        Peca peca37 = new Peca("Rei", posicao40);

        Jogador jogador1 = new Jogador("Adolf Anderssen", "Alemanha", "Mestre", 99);
        Jogador jogador2 = new Jogador("Lionel Kieseritzky", "França", "Mestre", 99);

        Lance lance1 = new Lance(posicao1, posicao2, peca1, jogador1);
        Lance lance2 = new Lance(posicao3, posicao4, peca2, jogador2);
        Lance lance3 = new Lance(posicao5, posicao6, peca3, jogador1);
        Lance lance4 = new Lance(posicao7, posicao8, peca4, jogador2);
        Lance lance5 = new Lance(posicao9, posicao10, peca5, jogador1);
        Lance lance6 = new Lance(posicao11, posicao12, peca6, jogador2);
        Lance lance7 = new Lance(posicao13, posicao14, peca7, jogador1);
        Lance lance8 = new Lance(posicao15, posicao16, peca8, jogador2);
        Lance lance9 = new Lance(posicao17, posicao18, peca9, jogador1);
        Lance lance10 = new Lance(posicao19, posicao20, peca10, jogador2);
        Lance lance11 = new Lance(posicao21, posicao22, peca11, jogador1);
        Lance lance12 = new Lance(posicao23, posicao24, peca12, jogador2);
        Lance lance13 = new Lance(posicao25, posicao26, peca13, jogador1);
        Lance lance14 = new Lance(posicao27, posicao28, peca14, jogador2);
        Lance lance15 = new Lance(posicao29, posicao30, peca15, jogador1);
        Lance lance16 = new Lance(posicao31, posicao32, peca16, jogador2);
        Lance lance17 = new Lance(posicao33, posicao34, peca17, jogador1);
        Lance lance18 = new Lance(posicao35, posicao36, peca18, jogador2);
        Lance lance19 = new Lance(posicao37, posicao38, peca19, jogador1);
        Lance lance20 = new Lance(posicao39, posicao40, peca20, jogador2);
        Lance lance21 = new Lance(posicao2, posicao7, peca1, jogador1);
        Lance lance22 = new Lance(posicao14, posicao15, peca14, jogador2);
        Lance lance23 = new Lance(posicao30, posicao31, peca28, jogador1);
        Lance lance24 = new Lance(posicao18, posicao23, peca16, jogador2);
        Lance lance25 = new Lance(posicao32, posicao27, peca32, jogador1);
        Lance lance26 = new Lance(posicao38, posicao33, peca19, jogador2);
        Lance lance27 = new Lance(posicao16, posicao17, peca16, jogador1);
        Lance lance28 = new Lance(posicao23, posicao18, peca23, jogador2);
        Lance lance29 = new Lance(posicao31, posicao26, peca28, jogador1);
        Lance lance30 = new Lance(posicao33, posicao28, peca29, jogador2);
        Lance lance31 = new Lance(posicao15, posicao22, peca14, jogador1);
        Lance lance32 = new Lance(posicao27, posicao20, peca32, jogador2);
        Lance lance33 = new Lance(posicao18, posicao25, peca16, jogador1);
        Lance lance34 = new Lance(posicao28, posicao21, peca28, jogador2);
        Lance lance35 = new Lance(posicao22, posicao29, peca14, jogador1);
        Lance lance36 = new Lance(posicao21, posicao36, peca23, jogador2);
        Lance lance37 = new Lance(posicao25, posicao34, peca16, jogador1);
        Lance lance38 = new Lance(posicao21, posicao14, peca23, jogador2);
        Lance lance39 = new Lance(posicao36, posicao35, peca34, jogador1);
        Lance lance40 = new Lance(posicao14, posicao13, peca23, jogador2);
        Lance lance41 = new Lance(posicao14, posicao13, peca22, jogador1);
        Lance lance42 = new Lance(posicao35, posicao27, peca34, jogador2);
        Lance lance43 = new Lance(posicao13, posicao12, peca22, jogador1);
        Lance lance44 = new Lance(posicao27, posicao26, peca33, jogador2);
        Lance lance45 = new Lance(posicao12, posicao11, peca22, jogador1);
        Lance lance46 = new Lance(posicao26, posicao25, peca33, jogador2);
        Lance lance47 = new Lance(posicao11, posicao10, peca22, jogador1);
        Lance lance48 = new Lance(posicao25, posicao24, peca33, jogador2);
        Lance lance49 = new Lance(posicao10, posicao5, peca22, jogador1);
        Lance lance50 = new Lance(posicao24, posicao19, peca33, jogador2);
        Lance lance51 = new Lance(posicao5, posicao4, peca22, jogador1);
        Lance lance52 = new Lance(posicao19, posicao14, peca33, jogador2);
        Lance lance53 = new Lance(posicao4, posicao3, peca22, jogador1);
        Lance lance54 = new Lance(posicao14, posicao13, peca33, jogador2);
        Lance lance55 = new Lance(posicao3, posicao2, peca22, jogador1);

        Partida partida = new Partida(new Lance[]{
                lance1, lance2, lance3, lance4, lance5, lance6, lance7, lance8, lance9, lance10,
                lance11, lance12, lance13, lance14, lance15, lance16, lance17, lance18, lance19, lance20,
                lance21, lance22, lance23, lance24, lance25, lance26, lance27, lance28, lance29, lance30,
                lance31, lance32, lance33, lance34, lance35, lance36, lance37, lance38, lance39, lance40,
                lance41, lance42, lance3, lance44, lance45, lance46, lance47, lance48, lance49, lance50,
                lance51, lance52, lance53, lance54, lance55
        });

        System.out.println("Partida Imortal: ");
        System.out.println(partida.toString());
    }
}
