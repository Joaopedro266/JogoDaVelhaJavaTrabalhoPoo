package jogodavelha;

public class Tabuleiro {
    public char[][] tabuleiro;

    public void IniciaTabuleiro() {
        tabuleiro = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = '□';
            }
        }
    }

    public char[][] getTabuleiro() {
        return tabuleiro;
    }

    public void ImprimirTabuleiro() {
        char[] linhas = {'A','B','C'};
        System.out.println("   1  2  3");
        for (int i = 0; i < 3; i++) {
            System.out.print(linhas[i]);
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + tabuleiro[i][j]);
            }
            System.out.println();
        }
    }

}