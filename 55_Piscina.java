import javax.swing.JOptionPane;
public class Piscina {
public static void main (String [] args) {
String recebe = "";
double comprimento,largura,profundidade,perimetro,valor;
double m = 45.00; 
try{

recebe = JOptionPane.showInputDialog("Informe o comprimento da piscina:");
comprimento = Double.parseDouble(recebe);

recebe = JOptionPane.showInputDialog("Informe a largura da piscina:");
largura = Double.parseDouble(recebe);

recebe = JOptionPane.showInputDialog("Informe a profundidade da piscina:");
profundidade = Double.parseDouble(recebe);

perimetro = (comprimento * largura * profundidade);
valor = (perimetro * m);

JOptionPane.showMessageDialog(null,"O valor total cobrado para a construção da piscina é: "
	+valor);

}
catch (NumberFormatException erro) {
JOptionPane.showMessageDialog(null,"Houve erro na conversao, digite apenas caracteres numericos."
	+erro.toString());
}
System.exit(0);
}
}