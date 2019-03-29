package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;



public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);
		Product product = new Product();
		System.out.println("Enter product data: ");
		System.out.print("name: ");
		product.name = sc.nextLine();
		System.out.print("price: ");
		product.price = sc.nextDouble();
		System.out.print("quantity: ");
		product.quantity = sc.nextInt();		
		
		System.out.println();
		System.out.println("Product data: " + product);
		
		System.out.println();
		System.out.println("Enter the number add product add in stock: ");
		int quantity=sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number product to be remove in stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		sc.close();
		

	}

}
