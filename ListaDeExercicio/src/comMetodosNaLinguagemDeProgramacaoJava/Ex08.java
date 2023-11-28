package comMetodosNaLinguagemDeProgramacaoJava;

public class Ex08 {
    public static void main(String[] args) {
        int[][] matriz = {
            {6, 1, 9},
            {3, 4, 5},
            {1, 3, 2}
        };

        int maiorElemento = encontrarMaiorElemento(matriz);

        System.out.printf("O maior elemento na matriz é: %s", maiorElemento);
    }

    public static int encontrarMaiorElemento(int[][] matriz) {
        if (matriz == null || matriz.length == 0 || matriz[0].length == 0) {
            throw new IllegalArgumentException("A matriz não pode ser vazia ou nula.");
        }

        int maiorElemento = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
        }

        return maiorElemento;
    }
}
