package br.com.aulas.alura;

public class Aulas implements Comparable<Aulas> {
	private static int refId;
	private int id;
	private String titulo;
	private int tempo;
	
	public Aulas(String titulo, int tempo)
	{
		this.titulo = titulo;
		this.tempo = tempo;
		this.id = refId;
		refId++;
	}
	public String getTitulo() {
		return this.titulo;
	}
	public int getTempo() {
		return this.tempo;
	}
	@Override
	public String toString() {
		return "[ID: " + this.id + " AULA: " + this.titulo + "TEMPO: " + this.tempo + " minutos ]";
	}
	@Override
	public int compareTo(Aulas outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
}
