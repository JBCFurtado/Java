import java.util.Scanner;

public class MiniCalculadora {
    public static void main(String[] args) {
        float numero1, numero2;
        char operacao;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("\nA = SOMA \nB = SUBTRAÇÃO \nC = MULTIPLICAÇÃO \nD = DIVISÃO\n");
        System.out.print("\nEscolha a Operação: ");
        operacao = entrada.nextLine().charAt(0);
        
        System.out.print("Entre com o primeiro número: ");
        numero1 = entrada.nextFloat();
        System.out.print("Entre com o segundo número: ");
        numero2 = entrada.nextFloat();
        System.out.println();
        
        switch( operacao )
        {
            case 'A':
                System.out.printf("%.2f + %.2f = %.2f\n", numero1, numero2, numero1 + numero2);
                break;        
                
            case 'B':
                System.out.printf("%.2f - %.2f = %.2f\n", numero1, numero2, numero1 - numero2);
                break;
                
            case 'C':
                System.out.printf("%.2f * %.2f = %.2f\n", numero1, numero2, numero1 * numero2);
                break;
                
            case 'D':
                System.out.printf("%.2f / %.2f = %.2f\n", numero1, numero2, numero1 / numero2);
                break;
            
            default:
                System.out.printf("Você digitou uma operação inválida.");        
            
        }
    }
}