package POO;

public class Jogador {
    private String nome;
    private int linha;
    private int coluna;
    private char caractere;

    public Jogador(String nome, char caractere) {
        this.nome = nome;
        this.linha = 0;
        this.coluna = 0;
        this.caractere = caractere;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getCaractere() {
        return caractere;
    }

    public void setCaractere(char caractere) {
        this.caractere = caractere;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}
