import javax.swing.JOptionPane;

public class CaixaDagua {
    public static void main(String[] args) {
        double lados = 4, volume = 0;
        try{
             double valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor dos lados do cubo : "));
             
             volume = lados * valor;
              JOptionPane.showMessageDialog(null, "O volume d'agua é : "+Math.floor(volume));
    }catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null, "Houve erro na conversao, digite apenas caracteres numéricos" + erro.toString());

        }
    }
}








































