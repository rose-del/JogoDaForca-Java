import java.util.Scanner;

public class JogoForca {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String[] palavras = {"liberdade", "java", "computador", "cachorro", "amor"};
            String palavraAleatoria = palavras[(int) (Math.random() * palavras.length)];
            Forca game = new Forca(palavraAleatoria, 6);
            Jogador p1 = new Jogador("Rose", 0, 0);

            System.out.println("Bem-vindo ao Jogo da Forca, " + p1.getNome());
            while(!game.acabou()) {
                game.exibirProgresso();
                System.out.print("Digite uma letra: ");
                char letra = input.next().charAt(0);
                game.tentativaLetra(letra);
            }

            if (game.venceu()) {
                p1.setNivel();
                p1.setPontos();
                System.out.println("Parabéns! Você adivinhou a palavra: " + game.getPalavra());
                System.out.println("Nível: " + p1.getNivel());
                System.out.println("Pontos: " + p1.getPontos());
            } else {
                System.out.println("Você perdeu! A palavra era: " + game.getPalavra());
            }
        }

    }
}
