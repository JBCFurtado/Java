import javax.swing.JOptionPane;
public class SalarioHoraTrabalhada {
    public static void main(String[] args) {
        try {

            double quant_horas = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas : "));
            double salario_horas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario por hora trabalhada : "));
            int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de dependentes : "));

            JOptionPane.showMessageDialog(null, "Vamos calcular o sue salario mensal");
            double SB = 0;
            double INSS = 0;
            double IR = 0;
            double SL = 0;
            SB = (quant_horas * salario_horas) + (50 * dependentes);

            if (SB <= 1000) {
                INSS = (SB * 8.5) / 100;
            } else if (SB > 1000) {
                INSS = (SB * 9) / 100;
            }
            if (SB > 500 && SB <= 1000) {
                IR = (SB * 5) / 100;
            } else if (SB > 1000) {
                IR = (SB * 7) / 100;
            }
            SL = (SB - INSS - IR);

            JOptionPane.showMessageDialog(null, "O salario bruto: " + SB + "\n o desconto do INSS: " + INSS + "\n o imposto de renda: " + IR + "\n o salario liquido é: " + SL);
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversao, digite apenas caracteres numericos" + erro.toString());
        }
    }
}



















