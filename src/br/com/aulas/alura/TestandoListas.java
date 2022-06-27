package br.com.aulas.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	/**
	 * @Curso Java Collections: Dominando Listas, Sets e Mapas
	 * @Descricao 

    Vá além das principais classes e métodos das Collections
    Aplique boas práticas de OO nos relacionamentos
    Não tenha mais medo dos antigos Iterators
    Set ou List, qual utilizar?
    Equals ou hashCode de uma vez por todas


	 * @param args
	 * @auhor KAI WANG
	 * @version 1.0
	 */
	public static void main(String[] args)
	{
		System.out.println("------------------------------------");
		System.out.println("----AULA 8 : JAVA COLLECTIONS ------");
		System.out.println();
		
		String aula1 = "Conhecendo mais sobre listas";
		String aula2 = "Modelando a Class Aulas";
		String aula3 = "Trabalhando com cursos e Sets";
		String aula4 = "Tipos de uso de Listas";
		String aula5 = "Como trabalhar com Arrays em JAVA";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		aulas.add(aula5);
		
		System.out.println("ARRAY: " + aulas);
		
		for(String aula: aulas) {
			System.out.println("Aula: " + aula.toUpperCase());
		}
		System.out.println();
		
		aulas.forEach((String aula) -> {
			System.out.println("Aula: " + aula.toLowerCase() );
		});
		
		Collections.sort(aulas);
		
		System.out.println("Ordenado: " + aulas);
		
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println("-----------------FIM ---------------");
		System.out.println("------------------------------------");
	}
}
