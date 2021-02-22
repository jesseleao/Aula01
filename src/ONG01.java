import java.util.Scanner;

public class ONG01 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		double dolar, real;
		
		System.out.println("Digite o valor em $(dolares) que deseja doar");
		dolar = leitor.nextDouble();
		real = dolar * 5.45;
		System.out.println("O valor doado em R$(reais) foi de R$" + real);
		leitor.close();
	}

}