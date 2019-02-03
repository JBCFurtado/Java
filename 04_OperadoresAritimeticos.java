/*
*INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
*Campus Altamira
*Tecnologia em Análise e Desenvolvimento de Sistemas
*Programação Orientada a Objetos
*/
package operadoresaritimeticos;

/**
 * Operadores Primitivos
 * @author Jobs
 */
public class OperadoresAritimeticos {
    // Declaração e inicialização de variáveis
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10; int y = 3;
        //Várias operações com as variáveis
        System.out.println("X = "+ x);
        System.out.println("Y = "+ y);
        System.out.println("X = "+(-x));
        System.out.println("X = "+(x/y));
        System.out.println("Resto de X por Y = "+ (x%y));//Resulta 1
        System.out.println("X = "+ (int)(x/y));//Resulta 3
        System.out.println("X = "+ (++x));//Resulta 11
    }
    
}
