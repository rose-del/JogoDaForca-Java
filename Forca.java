import java.util.ArrayList;

public class Forca {
    private String palavra;
    private ArrayList<Character> tentativas;
    private int errosMaximosPermitidos;
    private int erros;

    public Forca(String palavra, int errosMaximosPermitidos){
        this.palavra = palavra.toLowerCase();
        this.tentativas = new ArrayList<>();
        this.errosMaximosPermitidos = errosMaximosPermitidos;
        this.erros = 0;
    }

    public boolean venceu() {
        for(char letra : palavra.toCharArray()){
            if(!tentativas.contains(letra)){
                return false;
            }
        }
        return true;
    }

    public void tentativaLetra(char letra) {
        letra = Character.toLowerCase(letra);
        if(tentativas.contains(letra)){
            System.out.println("Você já tentou essa letra!");
            return;
        }else{
            tentativas.add(letra);
            if(palavra.indexOf(letra) == -1) {
                erros++;
                System.out.println("Letra errada, você tem " + (errosMaximosPermitidos - erros) + " tentativas restantes.");
            }else{
                System.out.println("Boa! A letra " + letra + " está na palavra.");
            }
        }
    }

    public void exibirProgresso() {
        for (char letra : palavra.toCharArray()) {
            if (tentativas.contains(letra)) {
                System.out.print(letra + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();
    }

    public String getPalavra(){
        return palavra;
    }

    public boolean acabou() {
        return erros >= errosMaximosPermitidos || venceu();
    }
}
