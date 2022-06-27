package br.com.aulas.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestaAulas {
	public static void main(String[] args)
	{
		Aulas aula1 = new Aulas("Básico Sobre ArrayList", 20);
		Aulas aula2 = new Aulas("Intermediário sobre ArrayList", 13);
		Aulas aula3 = new Aulas("Avançado sobre ArrayList", 40);
		Aulas aula4 = new Aulas("Introdução aos Collections", 24);
		Aulas aula5 = new Aulas("Revisitando ArrayList", 30);
		Aulas aula6 = new Aulas("Metodos Poderosos com ArrayList", 25);
		
		ArrayList<Aulas> ArrayAulas = new ArrayList<>();
		ArrayAulas.add(aula1);
		ArrayAulas.add(aula2);
		ArrayAulas.add(aula3);
		ArrayAulas.add(aula4);
		ArrayAulas.add(aula5);
		ArrayAulas.add(aula6);
		
		System.out.println(ArrayAulas);
		
		System.out.println("-----------------------------");
		
		ArrayAulas.forEach(aula->{
			System.out.println("-------------AULA------------");
			System.out.println("TITULO: " + aula.getTitulo());
			System.out.println("TEMPO: " + aula.getTempo());
			System.out.println("-----------------------------");
		});
		System.out.println("-----------------------------");
		System.out.println("--------ORDENAR LIST---------");
		System.out.println("-----------------------------");
		
		Collections.sort(ArrayAulas);
		System.out.println(ArrayAulas);
		
		System.out.println("-----------------------------");
		System.out.println("------------FINAL------------");
		System.out.println("-----------------------------");
	}
}
