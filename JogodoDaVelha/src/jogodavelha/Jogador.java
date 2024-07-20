package jogodavelha;

public class Jogador {
    private String nome;
    private char tipo;
    private int pontuacao;

    public Jogador(String nome, char tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.pontuacao = 0;
    }

    public String getNome() {
        return nome;
    }

    public char getTipo() {
        return tipo;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void incrementarPontuacao() {
        pontuacao++;
    }
}