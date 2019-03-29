package Entities;

public class Aluno {

	public String name;
	public Double notaPrimeiroTrimestre;
	public Double notaSegundoTrimestre;
	public Double notaTerceiroTrimestre;
	
	public Double SomaNota() {
		return notaPrimeiroTrimestre + notaSegundoTrimestre + notaTerceiroTrimestre;
	}
	
	public Double MediaAluno() {
		if (SomaNota() < 60.00) {
			return 60.00 - SomaNota();
		}
		else {
			return 0.00;
		}
	}
	
}
