import javax.swing.JOptionPane;
public class QuatroIdadesMaiorMenor {
public static void main (String [] args) {
int maior = 0, menor = 0;
try{
int idade1 = Integer.parseInt(JOptionPane.showInputDialog("informe uma idade: "));
int idade2 = Integer.parseInt(JOptionPane.showInputDialog("informe uma idade: "));
int idade3 = Integer.parseInt(JOptionPane.showInputDialog("informe uma idade: "));
int idade4 = Integer.parseInt(JOptionPane.showInputDialog("informe uma idade: "));
if (idade1 > idade2 && idade1 > idade3 && idade1 > idade4){
maior = idade1;
}else {
menor = idade1;
}
if(idade2 > idade1 && idade2 > idade3 && idade2 > idade4){
maior = idade2;
}else {
menor = idade2;
}
if(idade3 > idade1 && idade3 > idade2 && idade3 > idade4){
maior = idade3;
}else {
menor = idade3;
}
if(idade4 > idade1 && idade4 > idade2 && idade4 > idade3){
maior = idade3;
}else{
menor = idade4;
}
JOptionPane.showMessageDialog(null,"idades fornecidas:\n" +idade1+ "," +idade2+ "," +idade3+ "," +idade4+ "\n a maior idade: " 
	+maior+ "\n menor idade: " +menor);
}
catch (NumberFormatException erro) {
JOptionPane.showMessageDialog(null,"Houve erro na conversao, digite apenas caracteres numericos"+erro.toString());
}
System.exit(0);
}
}