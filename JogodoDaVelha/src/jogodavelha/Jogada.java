package jogodavelha;

import entradadados.Console;

public class Jogada {
    private Console console;

    public Jogada() {
        console = new Console();
    }

    public void solicitarJogada(char[][] tabuleiro, Jogador jogador) {
        int linha = 0;
        int coluna = 0;
        System.out.println("Vez do jogador : " + jogador.getNome());
        System.out.print("Digite a casa  = ");
        String casa = console.ReceberEntrada().toUpperCase();
        char simbolo = jogador.getTipo();

        switch (casa.charAt(0)) {
            case 'A':
                linha = 0;
                break;
            case 'B':
                linha = 1;
                break;
            case 'C':
                linha = 2;
                break;
            default:
                System.out.println("Linha invalida tente novamente.");
                return;
        }

        switch (casa.charAt(1)) {
            case '1':
                coluna = 0;
                break;
            case '2':
                coluna = 1;
                break;
            case '3':
                coluna = 2;
                break;
            default:
                System.out.println("Coluna invalida tente novamente.");
                return;
        }

        if (tabuleiro[linha][coluna] == '□') {
            tabuleiro[linha][coluna] = simbolo;
        } else {
            System.out.println("Posicao invalida ou ja ocupada tente novamente.");
        }
    }
}