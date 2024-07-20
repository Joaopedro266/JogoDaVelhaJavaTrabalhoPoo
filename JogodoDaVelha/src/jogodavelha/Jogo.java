package jogodavelha;

import java.util.Random;

public class Jogo {
    private Tabuleiro tabuleiro;
    private Jogada jogada;
    private Jogador jogador1;
    private Jogador jogador2;
    private Jogador jogadorAtual;
    private Random random;

    public Jogo(Jogador jogador1, Jogador jogador2) {
        tabuleiro = new Tabuleiro();
        tabuleiro.IniciaTabuleiro();
        jogada = new Jogada();
        this.jogador1 = jogador1;
        this.jogador2 = jogador2;
        random = new Random();
        int escolha = random.nextInt(2);
        if(escolha==1) {
            jogadorAtual = jogador1;
        }
        else{
            jogadorAtual = jogador2;
        }
    }

    public void jogar() {
        while (true) {
            tabuleiro.ImprimirTabuleiro();
            jogada.solicitarJogada(tabuleiro.getTabuleiro(), jogadorAtual);

            if (verificarVitoria(tabuleiro.getTabuleiro())) {
                tabuleiro.ImprimirTabuleiro();
                System.out.println("Jogador " + jogadorAtual.getNome() + " venceu!");
                jogadorAtual.incrementarPontuacao();
                break;
            }

            if (verificarEmpate(tabuleiro.getTabuleiro())) {
                tabuleiro.ImprimirTabuleiro();
                System.out.println("Empate!");
                break;
            }

            alternarJogador();
        }
    }

    private boolean verificarVitoria(char[][] tabuleiro) {
        char tipo = jogadorAtual.getTipo();
        // Verificar linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tipo && tabuleiro[i][1] == tipo && tabuleiro[i][2] == tipo) {
                return true;
            }
        }
        // Verificar colunas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == tipo && tabuleiro[1][i] == tipo && tabuleiro[2][i] == tipo) {
                return true;
            }
        }
        // Verificar diagonais
        if (tabuleiro[0][0] == tipo && tabuleiro[1][1] == tipo && tabuleiro[2][2] == tipo) {
            return true;
        }
        if (tabuleiro[0][2] == tipo && tabuleiro[1][1] == tipo && tabuleiro[2][0] == tipo) {
            return true;
        }
        return false;
    }

    private boolean verificarEmpate(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '□') {
                    return false;
                }
            }
        }
        return true;
    }

    private void alternarJogador() {
        if(jogadorAtual== jogador1){
            jogadorAtual=jogador2;
        }
        else{
            jogadorAtual=jogador1;
        }
    }
}