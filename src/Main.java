//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Funcoes funcao = new Funcoes();

        System.out.println(funcao.saoAnagramas("amor", "roma"));
        System.out.println(funcao.saoAnagramas("A gentleman", "elegant man"));
        System.out.println(funcao.saoAnagramas("gato", "cabra"));
        System.out.println(funcao.saoAnagramas("ab", "ca"));
        System.out.println(funcao.saoAnagramas("a", "romaaa"));

    }
}