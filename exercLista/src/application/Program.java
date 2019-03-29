package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);
		List<Funcionarios> list = new ArrayList<>();

		System.out.println("Entre com a qtde funcionaros:");
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n; i++) {

			System.out.println();
			System.out.println("Funcionario #" + i + ": ");
			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Salario: ");	
			double salario=sc.nextDouble();
			list.add(new Funcionarios(id, nome, salario));
		}
			System.out.println();
			System.out.print("entre  com id do funcionario que sera incrementado o salario: ");
			int idIcrem = sc.nextInt();
			Funcionarios func = list.stream().filter(x -> x.getId() == idIcrem).findFirst().orElse(null);
			if (func == null) {
				System.out.println("Este id nâo existe!");
			}
			else {
				System.out.print("Entre com percentual: ");
				double percentagem = sc.nextDouble();
				func.incrementaSalario(percentagem);
			}

			// PART 3 - LISTING funcLOYEES:

			System.out.println();
			System.out.println("Lista os funcionarios:");
			for (Funcionarios obj : list) {
				System.out.println(obj);
			}

			sc.close(); 


		}

	}


