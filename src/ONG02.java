import java.util.Scanner;


public class ONG02 {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		int km1, km2, litros, kmRodados, mediaLitros;
		
		System.out.println("Ao sair, quantos quilometros rodados aparecem no leitor?");
		km1 = leitor.nextInt();
		System.out.println("Ao chegar no posto de combustivel, quantos quilometros rodados aparecem no leitor?");
		km2 = leitor.nextInt();
		System.out.println("E quantos litros foram abastecidos?");
		litros = leitor.nextInt();
		kmRodados = km2 - km1;
		mediaLitros = kmRodados / litros;
		System.out.println("A Média de quilometros por litro rodado foi de " + mediaLitros + "L");
	}

}