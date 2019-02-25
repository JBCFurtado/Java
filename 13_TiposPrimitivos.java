/**
 *INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ
 *Campus Altamira
 *Tecnologia em Análise e Desenvolvimento de Sistemas
 *Programação Orientada a Objetos
 *Professor Paulo César
 */
package tiposprimitivos;

/**
 * Tipos Primitivos
 * @author Jobs
 */
public class TiposPrimitivos {

    /**
     * @param args 
     *Os argumentos (args) da linha de comando
     */
    
    public static void main(String[] args) {
        //Toda lógica de aplicação de código aqui
        char sexo = 'f';
        byte idade = 89;
        short codigo = 256;
        float nota = 9.4f;
        int alunos = 100, classes = 10;
        long habitantes = 9050100;
        double dolar = 2.62;
        boolean alternativa = false;
        System.out.println("\n Sexo: " + sexo + "Idade: " + idade + "Código: " + codigo);
        System.out.println("\n Nota: " + nota + "Alunos: " + alunos + "Classes: " + classes);
        System.out.println("\n Habitantes: " + habitantes + "Dólar: " + dolar + "Alternativa: " + alternativa);
    }  
}
