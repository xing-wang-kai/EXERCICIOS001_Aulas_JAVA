package br.com.aulas.alura;

public class TestaCursos {
	public static void main(String[] args)
	{
		Cursos curso1 = new Cursos("Aulas de ARRAYLIST", "Kai Wang");
		
		System.out.println(curso1.getAulas());
		
		curso1.adicionar(new Aulas("Curso avançado de ArrayList", 34));
		
		System.out.println(curso1.getAulas());
	}
}
