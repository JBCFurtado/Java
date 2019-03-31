public class Palavra{
public static void main(String[] args) {

        String palavra = "JAVA";

        StringBuilder impressao = new StringBuilder();
        for (int y = 0; y < palavra.length(); y++) {
            impressao.append(palavra.charAt(y));
            System.out.println(impressao.toString());
        }

        for (int x = impressao.length(); x >= 0; x--) {
            for (int z = 0; z < x - 1; z++) {
                System.out.print(impressao.charAt(z));
            }
            System.out.println("");
        }
    }
}