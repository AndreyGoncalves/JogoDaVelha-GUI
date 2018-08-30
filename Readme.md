# Programação Orientada a Objetos - POO29004

## Engenharia de Telecomunicações

### Instituto Federal de Santa Catarina



#### Notas

> 1. Crie um arquivo `.gitignore` e faça *commit* do mesmo
> 1. Crie uma classe `Principal.java` dentro do pacote `poo` e faça *commit* com todos os arquivos do projeto
> 1. Faça comentários seguindo o formato do JavaDOC
> 1. Crie classes para teste de unidade (JUnit) e teste todos os métodos essenciais e faça um *commit* com os testes 
> 1. Tenha certeza que seu código passe por todos os testes e que possa ser executado sem problemas



## Jogo da velha



O jogo poderá ser jogado por 2 jogadores humanos ou por 1 jogador com 1 jogador lógico (computador). Ao iniciar o programa deve-se solicitar ao usuário qual modalidade ele gostaria (1 ou 2 jogadores humanos). O jogo deverá ter um placar e no final de cada partida deve-se incrementar a pontuação daquele jogador que ganhou e solicitar ao usuário se ele deseja iniciar uma nova partida ou se deseja finalizar o programa. O jogador que inicia uma partida deve ser alternado. Por exemplo, se jogador X iniciou a partida 1, então o jogador O deverá iniciar a partida 2.

![jogo da velha](jogo-da-velha.gif)



Projete de forma que cada ação de validação do jogo (i.e. `boolean ganhou()`, `boolean tabuleiroCheio()`) esteja um método separado e que possa ser testado automaticamente.



> **Desafio:** Faça uma inteligência para o jogador 'computador' de forma que ele sempre tente ganhar o jogo e não simplesmente jogue em uma casa qualquer.



### Material de apoio

Criando uma matriz de caracteres. [De acordo com a documentação oficial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html), em Java o tipo primitivo `char` armazena um único caracter 16-bit Unicode.  Se uma variável declarada como `char` não for inicializada explicitamente, essa fica com o valor padrão `\u0000`.

```java
// Definindo estaticamente valores ao criar matriz
char[][] tab = {{'X',' ',' '},{' ','X',' '},{' ',' ','X'}};

// Criando matriz de caracteres 
char[][] tab = new tab[3][3];
tab[0][0] = ' '; // atribuindo 'espaço' na linha 0 e coluna 0
```



[Caracteres em UTF-8](https://www.utf8-chartable.de/unicode-utf8-table.pl?start=9472&unicodeinhtml=dec) que podem ser usados para imprimir o Jogo da Velha.

```java
│ \u2502 
─ \u250 
┼ \u253c

System.out.println("   \u2502   \u2502   ");
System.out.println("\u2500\u2500\u2500\u253c\u2500\u2500\u2500\u253c\u2500\u2500\u2500");
System.out.println("   \u2502   \u2502   ");
System.out.println("\u2500\u2500\u2500\u253c\u2500\u2500\u2500\u253c\u2500\u2500\u2500");
System.out.println("   \u2502   \u2502   ");

```



É possível ler dois inteiros sem a necessidade de pressionar ENTER entre eles.

```java
Scanner teclado = new Scanner(System.in);
System.out.print("Entre com o número da linha e da coluna: ");
int linha = teclado.nextInt();
int coluna = teclado.nextInt();
System.out.println("l: " + linha + ", c: " + coluna);
```

```shell
Entre com o número da linha e da coluna: 1 2 ⏎
l: 1, c: 2
```



Uma forma de limpar a tela

```java
/**
 * Uma maneira de limpar o console em terminais Unix
 *
 * Esse código não funcionará, por exemplo, quando se executa o programa
 * dentro do IntelliJ ou mesmo no prompt do Windows
 */
public static void limparTelaTerminalVT100(){
	System.out.print("\033[H\033[2J");
	System.out.flush();
}
```

