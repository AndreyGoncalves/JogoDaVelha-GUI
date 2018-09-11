package POO;

import java.util.Scanner;

public class Tabuleiro {
    private char[][] jogo = new char[3][3];
    private int placarJogador1;
    private int placarJogador2;

    public Tabuleiro() {
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) this.jogo[i][j]=' ';
    }

    public boolean verificaJogada(Jogador jogador){
        if(this.jogo[jogador.getLinha()][jogador.getColuna()]==0){
            return true;
        }else return false;
    }

    public boolean verificaVitoria(Jogador jogador){
        if (jogador.getCaractere()==this.jogo[0][0] && jogador.getCaractere()==this.jogo[0][1] && jogador.getCaractere()==this.jogo[0][2]){
            return true;
        }else if (jogador.getCaractere()==this.jogo[1][0] && jogador.getCaractere()==this.jogo[1][1] && jogador.getCaractere()==this.jogo[1][2]){
            return true;
        }else if (jogador.getCaractere()==this.jogo[2][0] && jogador.getCaractere()==this.jogo[2][1] && jogador.getCaractere()==this.jogo[2][2]){
            return true;
        }else if (jogador.getCaractere()==this.jogo[0][0] && jogador.getCaractere()==this.jogo[1][0] && jogador.getCaractere()==this.jogo[2][0]){
            return true;
        }else if (jogador.getCaractere()==this.jogo[0][1] && jogador.getCaractere()==this.jogo[1][1] && jogador.getCaractere()==this.jogo[2][1]){
            return true;
        }else if (jogador.getCaractere()==this.jogo[0][2] && jogador.getCaractere()==this.jogo[1][2] && jogador.getCaractere()==this.jogo[2][2]){
            return true;
        }else if (jogador.getCaractere()==this.jogo[0][0] && jogador.getCaractere()==this.jogo[1][1] && jogador.getCaractere()==this.jogo[2][2]){
            return true;
        }else if (jogador.getCaractere()==this.jogo[0][2] && jogador.getCaractere()==this.jogo[1][1] && jogador.getCaractere()==this.jogo[2][0]){
            return true;
        }else return false;
    }

    public void atualizaTabuleiro(Jogador jogador){
            this.jogo[jogador.getLinha()][jogador.getColuna()] = jogador.getCaractere();
    }

    public void mostraTabuleiro(Jogador jogador1, Jogador jogador2){
        System.out.println("        JOGO DA VELHA!       \n");
        System.out.printf(" %s (%c)  -  %s (%c)\n",jogador1.getNome(),jogador1.getCaractere(),jogador2.getNome(),jogador2.getCaractere());
        System.out.println("     |     |     ");
        System.out.printf("  %c  |  %c  |  %c  \n",this.jogo[0][0],this.jogo[0][1],this.jogo[0][2]);
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.printf("  %c  |  %c  |  %c  \n",this.jogo[1][0],this.jogo[1][1],this.jogo[1][2]);
        System.out.println("_____|_____|_____");
        System.out.println("     |     |     ");
        System.out.printf("  %c  |  %c  |  %c  \n",this.jogo[2][0],this.jogo[2][1],this.jogo[2][2]);
        System.out.println("     |     |     ");

    }

    public void jogar(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo da velha!! ");
        System.out.print("Entre com o nome e caractere 'X' ou 'O' do jogador 1: ");
        String nome1 = teclado.next();
        String carac1 = teclado.next();
        System.out.print("Entre com o nome e caractere 'X' ou 'O' do jogador 2: ");
        String nome2 = teclado.next();
        String carac2 = teclado.next();

        Jogador player1 = new Jogador(nome1, carac1.charAt(0));
        Jogador player2 = new Jogador(nome2, carac2.charAt(0));

        mostraTabuleiro(player1, player2);
        int i=0;
        while (i<9) {
            i++;
            int  linha, coluna;
            if((i%2)==0){
                System.out.printf("%s, entre com o número da linha e da coluna: \n", player1.getNome());
                player1.setLinha(linha = teclado.nextInt());
                player1.setColuna(coluna = teclado.nextInt());
                if (!verificaJogada(player1)) {
                    atualizaTabuleiro(player1);
                    if (verificaVitoria(player1)){
                        System.out.printf("%s, Você venceu!!: \n", player1.getNome());
                        mostraTabuleiro(player1, player2);
                        break;
                    }
                }
            }else{
                System.out.printf("%s, entre com o número da linha e da coluna: \n", player2.getNome());
                player2.setLinha(linha = teclado.nextInt());
                player2.setColuna(coluna = teclado.nextInt());
                if (!verificaJogada(player2)) {
                    atualizaTabuleiro(player2);
                    if (verificaVitoria(player2)){
                        System.out.printf("%s, Você venceu!!: \n", player2.getNome());
                        mostraTabuleiro(player1, player2);
                        break;
                    }
                }
            }
            mostraTabuleiro(player1, player2);
        }
    }

    public char[][] getTabuleiro() {
        return jogo;
    }

    public int getPlacarJogador1() {
        return placarJogador1;
    }

    public void setPlacarJogador1(int placarJogador1) {
        this.placarJogador1 = placarJogador1;
    }

    public int getPlacarJogador2() {
        return placarJogador2;
    }

    public void setPlacarJogador2(int placarJogador2) {
        this.placarJogador2 = placarJogador2;
    }



}
