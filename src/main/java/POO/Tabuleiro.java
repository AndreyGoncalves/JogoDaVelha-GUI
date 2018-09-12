package POO;
import java.util.Scanner;

/**
 * @author Andrey e Ricardo
 * */
/**
 * Classe Tabuleiro
 * */


public class Tabuleiro {
    //Cria uma tabela 3X3
    private char[][] jogo = new char[3][3];
    //Placar do jogador 1
    private int placarJogador1;
    //Placar do jogador 2
    private int placarJogador2;

    /**
     * Método construtor do tabuleiro, define em "branco" todas posições da tabela 3x3*/
    public Tabuleiro() {
        for (int i = 0; i < 3; i++) for (int j = 0; j < 3; j++) this.jogo[i][j]=' ';
    }
    /**
     * Método que verifica se a jogada é válida (se a posição está "vazia(valor 0)")
     * @param jogador objeto da classe Jogador, utilizado para conferir se a jogada é válida
     * @return verdadeiro se a posição da jogada for válida e falso se essa posição já está marcada por algum jogador
     * */
    public boolean verificaJogada(Jogador jogador){
        if(this.jogo[jogador.getLinha()][jogador.getColuna()]==0){
            return true;
        }else return false;
    }
    /**
     * Método que verifica se algum jogador ganhou, esse método verifica linhas, colunas e diagonais
     * @param jogador objeto da classe Jogador passado por parametro
     * @return verdadeiro se algum jogador ganhou
     * */
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
    /**
     * Método que atualiza a jogada no tabuleiro
     * */
    public void atualizaTabuleiro(Jogador jogador){
            this.jogo[jogador.getLinha()][jogador.getColuna()] = jogador.getCaractere();
    }
    /**
     * Método que imprime o tabuleiro com as jogadas do jogador1 e jogador2
     * @param jogador1 objeto da classe Jogador
     * @param jogador2 objeto da classe Jogador
     * */
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
    /**
     * Método para iniciar o jogo
     * */
    public void jogar(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Bem vindo ao jogo da velha!! ");
        System.out.print("Entre com o nome e caractere 'X' ou 'O' do jogador 1: ");

        //string nome1 armazena o nome do jogador 1
        String nome1 = teclado.next();

        // variável char carac1 é armazena o caracter escolhido pelo usuário
        String carac1 = teclado.next();
        System.out.print("Entre com o nome e caractere 'X' ou 'O' do jogador 2: ");

        //string nome2 armazena o nome do jogador 2
        String nome2 = teclado.next();

        // variável char carac2 é armazena o caracter escolhido pelo usuário 2
        String carac2 = teclado.next();

        //cria dois objetos da classe jogador, passando nome e o caracter desejado pelo parametro.
        Jogador player1 = new Jogador(nome1, carac1.charAt(0));
        Jogador player2 = new Jogador(nome2, carac2.charAt(0));

        //executa método mostraTabuleiro
        mostraTabuleiro(player1, player2);
        int i=0;
        //rotina para escolher a posição do tabuleiro que deseja jogar
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
    /**
     * Metodo que obtem o Tabuleiro
     * @return jogo, retorna o nome do Tabuleiro criado
     * */
    public char[][] getTabuleiro() {
        return jogo;
    }
    /**
     * Metodo que obtem a pontuação do jogador 1
     * @return placarJogador1, retorna a pontuação do jogador 1
     * */
    public int getPlacarJogador1() {
        return placarJogador1;
    }
    /**
     * Método para definir a pontuação do jogador1
     * @param placarJogador1 inteiro com a pontuação do jogador 1
     * */
    public void setPlacarJogador1(int placarJogador1) {
        this.placarJogador1 = placarJogador1;
    }
    /**
     * Metodo que obtem a pontuação do jogador 2
     * @return placarJogador2, retorna a pontuação do jogador 2
     * */
    public int getPlacarJogador2() {
        return placarJogador2;
    }
    /**
     * Metodo que define o placar do jogador2
     * @param placarJogador2 inteiro com a pontuação do jogador 2
     * */
    public void setPlacarJogador2(int placarJogador2) {
        this.placarJogador2 = placarJogador2;
    }
}