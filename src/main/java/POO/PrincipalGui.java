package POO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrincipalGui {
    private JPanel panel1;
    private JPanel PanelTABULEIRO;
    private JPanel Panel01;
    private JPanel Panel02;
    private JPanel Panel10;
    private JPanel Panel11;
    private JPanel Panel12;
    private JPanel Panel20;
    private JPanel Panel21;
    private JPanel Panel22;
    private JPanel Panel00;
    private JLabel Label02;
    private JLabel Label22;
    private JLabel Label12;
    private JLabel Label01;
    private JLabel Label11;
    private JLabel Label10;
    private JLabel Label21;
    private JLabel Label20;
    private JLabel Label00;
    private JButton novoJogoButton;
    private JButton sairDoJogoButton;
    private JPanel vit1;
    private JPanel vit2;
    private JLabel teste1;
    private JLabel teste;
    private JLabel teste2;
    private JLabel davez;

    int pontuacao1 = 0;
    int pontuacao2 = 0;
    int empates=0;
    private boolean jogador1ativo = true;
    private boolean jogador2ativo = false;


    public static void main(String[] args) {
        JFrame frame = new JFrame("PrincipalGui");
        frame.setContentPane(new PrincipalGui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public void JogadorVencedor(String jogador) {
        /*----------------------VERIFICA LINHAS-------------------------------------------------*/
        if (Label00.getText().equals(jogador) && Label01.getText().equals(jogador) && Label02.getText().equals(jogador)) {
            if (Label00.getText().equals("X")) {
                Ganhador("Jogador 1");
            } else Ganhador("Jogador 2");

        }
        if (Label10.getText().equals(jogador) && Label11.getText().equals(jogador) && Label12.getText().equals(jogador)) {
            if (Label10.getText().equals("X")) {
                Ganhador("Jogador 1");
            } else Ganhador("Jogador 2");

        }

        if (Label20.getText().equals(jogador) && Label21.getText().equals(jogador) && Label22.getText().equals(jogador)) {
            if (Label20.getText().equals("X")) {
                Ganhador("Jogador 1");
            } else Ganhador("Jogador 2");

        }

        /*---------------------VERIFICA COLUNAS-----------------------------*/
        if (Label00.getText().equals(jogador) && Label10.getText().equals(jogador) && Label20.getText().equals(jogador)) {
            if (Label00.getText().equals("X")) {
                Ganhador("Jogador 1");
            } else Ganhador("Jogador 2");

        }
        if (Label01.getText().equals(jogador) && Label11.getText().equals(jogador) && Label21.getText().equals(jogador)) {
            if (Label01.getText().equals("X")) {
                Ganhador("Jogador 1");
            } else Ganhador("Jogador 2");

        }

        if (Label02.getText().equals(jogador) && Label12.getText().equals(jogador) && Label22.getText().equals(jogador)) {
            if (Label02.getText().equals("X")) {
                Ganhador("Jogador 1");
            } else Ganhador("Jogador 2");

        }

        /*---------------------VERIFICA DIAGONAIS -----------------------------*/
        if (Label00.getText().equals(jogador) && Label11.getText().equals(jogador) && Label22.getText().equals(jogador)) {
            if (Label00.getText().equals("X")) {
                Ganhador("Jogador 1");
            } else Ganhador("Jogador 2");

        }
        if (Label20.getText().equals(jogador) && Label02.getText().equals(jogador) && Label11.getText().equals(jogador)) {
            if (Label20.getText().equals("X")) {
                Ganhador("Jogador 1");
            } else Ganhador("Jogador 2");

        }
        /*---------------------VERIFICA EMPATES -----------------------------*/
        if (!Label00.getText().equals("") && !Label01.getText().equals("") && !Label02.getText().equals("") && !Label10.getText().equals("") && !Label11.getText().equals("") && !Label12.getText().equals("") && !Label20.getText().equals("") && !Label21.getText().equals("") && !Label22.getText().equals("")) {
            Ganhador("Empate");

        }
    }

    public void Ganhador(String UsuarioVencedor){
        if(UsuarioVencedor.equals("Jogador 1")){
            JOptionPane.showMessageDialog(null, "Parabéns jogador 1, você venceu!");
            pontuacao1++;
            teste.setText("" + pontuacao1);
            LimpaTabuleiro();
            Label00.setForeground(new Color(0,0,0));
            Label01.setForeground(new Color(0,0,0));
            Label02.setForeground(new Color(0,0,0));
            Label10.setForeground(new Color(0,0,0));
            Label11.setForeground(new Color(0,0,0));
            Label12.setForeground(new Color(0,0,0));
            Label20.setForeground(new Color(0,0,0));
            Label21.setForeground(new Color(0,0,0));
            Label22.setForeground(new Color(0,0,0));



        }
        if(UsuarioVencedor.equals("Jogador 2")){
            JOptionPane.showMessageDialog(null, "Parabéns jogador 2, você venceu!");
            pontuacao2++;
            teste1.setText("" + pontuacao2);
            LimpaTabuleiro();
            Label00.setForeground(new Color(0,0,0));
            Label01.setForeground(new Color(0,0,0));
            Label02.setForeground(new Color(0,0,0));
            Label10.setForeground(new Color(0,0,0));
            Label11.setForeground(new Color(0,0,0));
            Label12.setForeground(new Color(0,0,0));
            Label20.setForeground(new Color(0,0,0));
            Label21.setForeground(new Color(0,0,0));
            Label22.setForeground(new Color(0,0,0));
        }
        if(UsuarioVencedor.equals("Empate")){
            JOptionPane.showMessageDialog(null, "A partida empatou!");
            empates++;
            teste2.setText(""+empates);
            LimpaTabuleiro();
            Label00.setForeground(new Color(0,0,0));
            Label01.setForeground(new Color(0,0,0));
            Label02.setForeground(new Color(0,0,0));
            Label10.setForeground(new Color(0,0,0));
            Label11.setForeground(new Color(0,0,0));
            Label12.setForeground(new Color(0,0,0));
            Label20.setForeground(new Color(0,0,0));
            Label21.setForeground(new Color(0,0,0));
            Label22.setForeground(new Color(0,0,0));
        }
    }
    public void ZeraPontuacao(){
        pontuacao2 = 0;
        pontuacao1 = 0;
        empates = 0;
        teste.setText("0");
        teste1.setText("0");
        teste2.setText("0");
    }
    public void LimpaTabuleiro(){
        Label00.setText("");
        Label01.setText("");
        Label02.setText("");
        Label10.setText("");
        Label11.setText("");
        Label12.setText("");
        Label20.setText("");
        Label21.setText("");
        Label22.setText("");

        jogador1ativo = true;
        jogador2ativo = false;

    }

    public void trocajogador(){
        if(jogador1ativo == true){
            davez.setText("Jogador 2");
            jogador1ativo = false;
            jogador2ativo = true;
        }else{
            davez.setText("Jogador 1");
            jogador1ativo = true;
            jogador2ativo = false;
        }
       JogadorVencedor("X");
       JogadorVencedor("O");

    }


    public PrincipalGui() {

        Panel00.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label00.getText().equals("")) {
                        Label00.setForeground(new Color(255, 0, 0));
                        Label00.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label00.getText().equals("")) {
                        Label00.setForeground(new Color(0,0,255));
                        Label00.setText("O");
                        trocajogador();
                    }
                }
            }
        });


        Label01.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label01.getText().equals("")) {
                        Label01.setForeground(new Color(255, 0, 0));
                        Label01.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label01.getText().equals("")) {
                        Label01.setForeground(new Color(0,0,255));
                        Label01.setText("O");
                        trocajogador();
                    }
                }
            }
        });
        Label02.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label02.getText().equals("")) {
                        Label02.setForeground(new Color(255, 0, 0));
                        Label02.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label02.getText().equals("")) {
                        Label02.setForeground(new Color(0,0,255));
                        Label02.setText("O");
                        trocajogador();
                    }
                }
            }
        });

        Label10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label10.getText().equals("")) {
                        Label10.setForeground(new Color(255, 0, 0));
                        Label10.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label10.getText().equals("")) {
                        Label10.setForeground(new Color(0,0,255));
                        Label10.setText("O");
                        trocajogador();
                    }
                }
            }
        });
        Label11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label11.getText().equals("")) {
                        Label11.setForeground(new Color(255, 0, 0));
                        Label11.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label11.getText().equals("")) {
                        Label11.setForeground(new Color(0,0,255));
                        Label11.setText("O");
                        trocajogador();
                    }
                }
            }
        });
        Label12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label12.getText().equals("")) {
                        Label12.setForeground(new Color(255, 0, 0));
                        Label12.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label12.getText().equals("")) {
                        Label12.setForeground(new Color(0,0,255));
                        Label12.setText("O");
                        trocajogador();
                    }
                }
            }
        });
        Label20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label20.getText().equals("")) {
                        Label20.setForeground(new Color(255, 0, 0));
                        Label20.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label20.getText().equals("")) {
                        Label20.setForeground(new Color(0,0,255));
                        Label20.setText("O");
                        trocajogador();
                    }
                }
            }
        });
        Label21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label21.getText().equals("")) {
                        Label21.setForeground(new Color(255, 0, 0));
                        Label21.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label21.getText().equals("")) {
                        Label21.setForeground(new Color(0,0,255));
                        Label21.setText("O");
                        trocajogador();
                    }
                }
            }
        });

        Label22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (jogador1ativo == true) {
                    if (Label22.getText().equals("")) {
                        Label22.setForeground(new Color(255, 0, 0));
                        Label22.setText("X");
                        trocajogador();
                    }
                } else {
                    if (Label22.getText().equals("")) {
                        Label22.setForeground(new Color(0,0,255));
                        Label22.setText("O");
                        trocajogador();
                    }
                }
            }
        });

        /* -------- botão novo jogo-----------*/
        novoJogoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                LimpaTabuleiro();
                ZeraPontuacao();
                davez.setText("Jogador 1");
                jogador1ativo = true;
                jogador2ativo = false;
            }
        });
        /**------------- botão sair do jovo ----------*/
        sairDoJogoButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                System.exit(0);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
