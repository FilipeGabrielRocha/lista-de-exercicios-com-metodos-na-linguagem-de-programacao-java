package comMetodosNaLinguagemDeProgramacaoJava;

public class Ex09 {
	  public static void main(String[] args) {
	        String palavra = "reviver";

	        if (ehPalindromo(palavra)) {
	            System.out.printf("%s � um pal�ndromo.", palavra);
	        } else {
	            System.out.printf("%s n�o � um pal�ndromo.", palavra);
	        }
	    }

	    public static boolean ehPalindromo(String str) {
	        if (str == null || str.trim().isEmpty()) {
	            throw new IllegalArgumentException("A string n�o pode ser vazia ou nula.");
	        }

	        str = str.toLowerCase();

	        int i = 0;
	        int j = str.length() - 1;

	        while (i < j) {
	            if (str.charAt(i) != str.charAt(j)) {
	                return false;
	            }
	            i++;
	            j--;
	        }

	        return true; 
	    }
}
