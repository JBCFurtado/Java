/**
 *INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 *Campus Altamira
 *Tecnologia em Análise e Desenvolvimento de Sistemas
 *Programação Orientada a Objetos
 *Professor Paulo César
 */
package operadoresaritimeticos;

/**
 * Exemplos de Operadores Aritméticos
 * @author Jobs
 */

public class OperadoresAritimeticos {
    /**
     * @param args 
     * Os argumentos (args) da linha de comando
     */
    public static void main(String[] args) {
        int x = 10; int y = 3; // Declaração e inicialização de variáveis.
        //Várias operações com as variáveis
        //Toda lógica de aplicação de código aqui
        System.out.println("X = "+ x);                                
        System.out.println("Y = "+ y);
        System.out.println("X = "+(-x));
        System.out.println("X = "+(x/y));
        System.out.println("Resto de X por Y = "+ (x%y));//Resulta 1
        System.out.println("X = "+ (int)(x/y));//Resulta 3
        System.out.println("X = "+ (++x));//Resulta 11                
    }  
}
