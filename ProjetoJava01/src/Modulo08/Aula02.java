package Modulo08;

public class Aula02 {

	public static void main(String[] args) {

		int nota1 = 10;
		int nota2 = 60;
		int nota3 = 70;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		String saidaResultado;
		
		saidaResultado = media >= 70 ? "Aluno aprovado!" : "Aluno reprovado!";
		System.out.println(saidaResultado);
		
	}
	
}
