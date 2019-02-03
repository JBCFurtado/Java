/*
*INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
*Campus Altamira
*Tecnologia em Análise e Desenvolvimento de Sistemas
*Programação Orientada a Objetos
*/
package conversaodetipos;

/**
 * Exemplo de Conversão de Tipos
 * @author Jobs
 */
public class ConversaoDeTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double nota1, nota2, trabalho, media;
        nota1 = Double.parseDouble(args[0]);
        nota2 = Double.parseDouble(args[1]);
        trabalho = Double.parseDouble(args[2]);
        media = (nota1 + nota2 + trabalho)/3;
        System.out.println("Média= "+ media);
    }
    
}
