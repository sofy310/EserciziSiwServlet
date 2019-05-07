package controller;

public class Studente {

	private String matricola;
	private String nome;
	
	
	
	/*getter e setter*/
	public String getMatricola() {
		return matricola;
	}

	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	/*costruttore*/
	public Studente() {
		
	}
	
	public Studente(String matricola, String nome) {
		this.matricola = matricola;
		this.nome = nome;
	}
	
	
}
