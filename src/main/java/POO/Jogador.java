package POO;
/**
 * @author Andrey e Ricardo
 * */
/**
 * Classe jogador
 * */
public class Jogador {
    //Variável string para nome do jogador
    private String nome;
    //Variável int pra identificação da linha que o jogador irá jogar
    private int linha;
    //Variável int pra identificação da coluna que o jogador irá jogar
    private int coluna;
    //Variável char para escolher o caracter que quer marcar na posição desejada, normalmente é usado "X" ou "O"
    private char caractere;

    /**
     * Método construtor do jogador
     * @param nome é o nome do jogador passado por parâmetro na hora que o construtor for invocado
     * @param caractere é o caracter que o jogador quer utilizar para marcar a posição jogada.
     * */
    public Jogador(String nome, char caractere) {
        this.nome = nome;
        this.linha = 0;
        this.coluna = 0;
        this.caractere = caractere;
    }
    /**
     * Método para obter nome do Jogador
     * @return retorna nome do jogador
     * */
    public String getNome() {
        return nome;
    }

    /**
     * Método para definir nome do Jogador
     * @param nome é o nome do jogador
     * */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Método para obter o caracter do jogador
     * @return retorna o caracter do jogador
     * */
    public char getCaractere() {
        return caractere;
    }

    /**
     * Método para definir caracter do Jogador
     * @param caractere parametro para definir o caracter.
     * */
    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    /**
     * Método para obter a linha
     * @return retorna linha
     * */
    public int getLinha() {
        return linha;
    }

    /**
     * Método para definir a linha
     * @param linha variavel inteira para escolher a linha
     * */
    public void setLinha(int linha) {
        this.linha = linha;
    }
    /**
     * Método para obter coluna
     * @return retorna coluna
     * */
    public int getColuna() {
        return coluna;
    }
    /**
     * Método para definir a coluna
     * @param coluna variavel inteira para escolher a coluna
     * */
    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}
