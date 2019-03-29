package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.ContaBancaria;

public class Program {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);

		ContaBancaria conta ;
		
		System.out.println("Entre com o numero da conta: ");
		int number = sc.nextInt();
				
		System.out.println("Entre com o nome do titular: ");
		sc.nextLine();
		String name=sc.nextLine();
		

		System.out.println("Entre com um deposito inicial (y/n)? ");
		char confirma = sc.next().charAt(0);
		
		if (confirma =='y') {
			System.out.println("Entre com o valor inicial: ");
			double valorinicial=sc.nextDouble();
			conta = new ContaBancaria(number, name,valorinicial);
		} 
		else {
			conta = new ContaBancaria(number, name);
		}
		

		System.out.println();
		System.out.println("Dados daconta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Entre com um deposito ");
		double valorDeposito=sc.nextDouble();
		conta.depositaConta(valorDeposito);
		System.out.println("Dados daconta:");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("Entre com um saque ");
		double valoSaque=sc.nextDouble();
		conta.saqueConta(valoSaque);
		System.out.println("Dados daconta:");
		System.out.println(conta);
	}

}
