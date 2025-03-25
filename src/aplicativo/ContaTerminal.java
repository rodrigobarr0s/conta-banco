package aplicativo;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite o numero da conta: ");
		int numero = scanner.nextInt();

		System.out.print("Digite o numero da agencia: ");
		String agencia = scanner.next();
		scanner.nextLine();

		System.out.print("Digite o nome do cliente: ");
		String nomeCliente = scanner.nextLine();

		System.out.print("Digite o saldo: ");
		double saldo = scanner.nextDouble();
		System.out.println();

		System.out.printf(
				"Olá %s, \n"
				+ "obrigado por criar uma conta em nosso banco, \n" 
				+ "sua agência é %s, \n"
				+ "conta %d e seu saldo %.2f já está disponível para saque.",
				nomeCliente, agencia, numero, saldo);

		scanner.close();
	}
}
