package comMetodosNaLinguagemDeProgramacaoJava;

public class Ex05 {
    public static void main(String[] args) {
        String texto = "The Last of Us o melhor jogo ja feito na hist�ria";

        int quantidadeVogais = contarVogais(texto);

        System.out.println("O n�mero de vogais no texto �: " + quantidadeVogais);
    }

    public static int contarVogais(String texto) {
        if (texto == null || texto.isEmpty()) {
            throw new IllegalArgumentException("A string n�o pode ser nula ou vazia.");
        }

        int countVogais = 0;
        String vogais = "aeiouAEIOU����������������������������������";

        for (int i = 0; i < texto.length(); i++) {
            char caractere = texto.charAt(i);
            if (vogais.indexOf(caractere) != -1) {
                countVogais++;
            }
        }

        return countVogais;
    }
}
