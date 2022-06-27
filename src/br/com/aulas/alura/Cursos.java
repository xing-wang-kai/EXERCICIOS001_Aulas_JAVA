package br.com.aulas.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cursos {
	private String nome;
	private String docente;
	private List<Aulas> aulas = new ArrayList<>();
	
	public Cursos(String nome, String docente)
	{
		this.nome = nome;
		this.docente = docente;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	public String getDocente() {
		return this.docente;
	}
	public List<Aulas> getAulas() {
		return Collections.unmodifiableList(aulas);
	}
	public void adicionar(Aulas Aula)
	{
		this.aulas.add(Aula);
	}
}
