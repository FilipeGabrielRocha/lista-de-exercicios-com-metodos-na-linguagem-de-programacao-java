package comMetodosNaLinguagemDeProgramacaoJava;

import java.util.Arrays;

public class Ex10 {
    public static void main(String[] args) {
        int[] numeros = {6, 3, 1, 9, 2};

        ordenarCrescente(numeros);

        System.out.printf("Array ordenado em ordem crescente: %s", Arrays.toString(numeros));
    }

    public static void ordenarCrescente(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("O array não pode ser vazio ou nulo.");
        }

        Arrays.sort(array);
    }
}
