import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		int valor1, valor2, soma, subtracao, multiplicacao;
		double divisao;
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Esse programa vai somar, subtrair, multiplicar, e dividir os valores que você digitar!");
		System.out.println("Digite o primeiro valor que deseja somar");
		valor1 = leitor.nextInt();
		System.out.println("Digite o segundo valor que deseja somar");
		valor2 = leitor.nextInt();
		soma = valor1 + valor2;
		System.out.println("A soma dos dois valores foi de: " + soma);
		subtracao = valor1 - valor2;
		System.out.println("A subtracao dos dois valores foi de: " + subtracao);
		multiplicacao = valor1 * valor2;
		System.out.println("A multiplicação dos dois valores foi de: " + multiplicacao);
		divisao = valor1 / valor2;
		System.out.println("A divisão dos dois valores foi de: " + divisao);
		leitor.close();
	}

}