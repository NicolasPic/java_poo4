package b_poo4;

import java.util.Scanner;

import entidades.Conta;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Conta conta ;
		
		System.out.println("Digite o numero da conta:");
		int numero = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Digite o nome do titular:");
		String nome = sc.nextLine();
		
		System.out.println("É o primeiro deposito da conta:(s/n)");
		String sim = sc.nextLine();	
		
		double valor;
		
		if(sim.equals("s")) {
			System.out.println("Digite o valor que deseja depositar:");
			valor=sc.nextDouble();
			conta = new Conta(numero,nome,valor);
		}else {
			conta = new Conta(numero,nome);
		}
		
		
		System.out.println("Dados da conta:");
		System.out.println(conta);
		
		System.out.println("Digite o valor do deposito:");
		valor=sc.nextDouble();
		conta.depositar(valor);
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		System.out.println("Digite o valor do retirada:");
		valor=sc.nextDouble();
		conta.retirar(valor);
		System.out.println("Dados atualizados:");
		System.out.println(conta);
		
		
		sc.close();
	}

}
