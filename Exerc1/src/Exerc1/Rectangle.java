package Exerc1;

public class Rectangle {

	public Double Width;
	public Double Heigth;
	public Double RaizDiagonal;
		
	public Double Area() {
		return Width * Heigth;
	}
	
	public Double Perimeter() {
		return (Width + Heigth)*2;
	}
	
	public Double Diagonal() {
		Width=Math.pow(Width, 2);
		Heigth= Math.pow(Heigth,2);
		RaizDiagonal =Math.sqrt(Width + Heigth);
		return RaizDiagonal;
	}
	
}
