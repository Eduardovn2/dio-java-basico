package edu.eduardo.PrimeiraSemana;

public class BoletimEstudantil {
	//Documentação organizada.
	public static void main(String[] args) {
		int mediaFinal = 3;
		if (mediaFinal<6)
			System.out.print("Reprovado");
		else if(mediaFinal == 6)
			System.out.print("Recuperação");
		else
			System.out.print("Aprovado");
	}
}
 	