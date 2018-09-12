package POO;
import java.util.Scanner;


/**
 * @author Andrey e Ricardo
 * */
/**
 * Classe Principal responsável por iniciar o jogo.
 * */
public class Principal {

    public static void main(String[] args) {
        //Cria novo tabuleiro
        Tabuleiro tabuleiro = new Tabuleiro();
        //inicia o método jogar da classe Tabuleiro
        tabuleiro.jogar();
    }
}
