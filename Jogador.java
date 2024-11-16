public class Jogador {
    private String nome;
    private int nivel;
    private int pontos;

    public Jogador(String nome, int nivel, int pontos){
        this.nome = nome;
        this.nivel = nivel;
        this.pontos = pontos;
    }

    public void setNivel() {
        nivel += 1;
    }

    public void setPontos() {
        pontos += 10;
    }

    public String getNome() {
        return nome;
    }

    public int getNivel() {
        return nivel;
    }

    public int getPontos() {
        return pontos;
    }
}