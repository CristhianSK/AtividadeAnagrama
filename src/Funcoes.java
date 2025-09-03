import java.util.Arrays;

public class Funcoes {

    public Funcoes() {

    }

    public boolean saoAnagramas(String texto1, String texto2) {
        String s1 = texto1.replaceAll("\\s+", "").toLowerCase();
        String s2 = texto2.replaceAll("\\s+", "").toLowerCase();

        if (s1.length() != s2.length()) {
            return false;
        }

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public String cifraDeCesar(String texto, int deslocamento) {
        return "";
    }

    public String encontrarMaiorPalavra(String frase) {
        return "";
    }
}