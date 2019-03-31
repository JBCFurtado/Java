import java.io.InputStream;
public class EntradaComInputStream {
	public static void main(String args[]){
		String s = "";
		float nota1 = 0, nota2 = 0, trabalho = 0, media = 0;
		DataInputStream dado;
		try {
			System.out.println("Entre com a nota 1");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			nota1 = Float.parseFloat(s);
			
			System.out.println("Entre com anota 2");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			nota2 = Float.parseFloat(s);
			
			System.out.println("Entre com a nota trabalho");
			dado = new DataInputStream(System.in);
			s = dado.readLine();
			trabalho = Float.parseFloat(s);

			media = (nota1 + nota2 + trabalho) / 3;
			System.out.println("Média: " + media);
		}
		catch (IOException erro) {
			System.out.println("Houve um erro na entrada de dados" + erro.toString());
		}
		catch (NumberFormatException erro) {
			System.out.println("Houve um erro na conversão, digite apenas caracteres numéricos" + erro.toString());
		}
	}
}







