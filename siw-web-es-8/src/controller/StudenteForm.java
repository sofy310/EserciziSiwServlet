package controller;

public class StudenteForm {
	
	private String nome;
	private String cognome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	public StudenteForm(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
}
