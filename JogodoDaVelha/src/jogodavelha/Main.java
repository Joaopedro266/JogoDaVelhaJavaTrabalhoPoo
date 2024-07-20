package jogodavelha;

public class Main {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("João", 'X');
        Jogador jogador2 = new Jogador("Iuri", 'O');

        Jogo jogo = new Jogo(jogador1, jogador2);
        jogo.jogar();
    }
}