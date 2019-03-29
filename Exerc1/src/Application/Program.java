package Application;

import java.util.Locale;
import java.util.Scanner;

import Exerc1.Rectangle;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new java.util.Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Enter rectangle data: ");
		System.out.print("Width: ");
		rectangle.Width = sc.nextDouble();
		System.out.print("Hegth: ");
		rectangle.Heigth = sc.nextDouble();
		
		System.out.println();
		System.out.println("Area : " +String.format("%.2f",rectangle.Area()));
		
		System.out.println();
		System.out.println("Area : " +String.format("%.2f",rectangle.Perimeter()));
		
		System.out.println();
		System.out.println("Area : " +String.format("%.2f",rectangle.Diagonal()));
		
		
		
		
	}

}
