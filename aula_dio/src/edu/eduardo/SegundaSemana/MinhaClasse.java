package edu.eduardo.SegundaSemana;

public class MinhaClasse {
	public static void main(String[] args) {
		String primeiroNome = "Eduardo";
		String segundoNome = "viana";
		String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
		System.out.println(nomeCompleto);
	}	
	//Define uma função que recebe 2 parametros.
	public static String nomeCompleto (String primeiroNome, String segundoNome) {
		//o metodo concat faz uma conctenação.
		return "Resultado do metodo "+primeiroNome.concat(" ").concat(segundoNome);
	}
	
}
