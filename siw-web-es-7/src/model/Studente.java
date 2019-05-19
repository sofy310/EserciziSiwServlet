package model;

public class Studente {
	
	private String nome;
	
	private String cognome;
	
	private String matricola;
	
	public Studente() {
		
	}
	
    public Studente(String nome, String cognome, String matricola) {
    	this.nome = nome;
    	this.cognome = cognome;
    	this.matricola = matricola;
    }

    public String getNome() {
    	return this.nome;
    }
    
    public String getCognome() {
    	return this.cognome;
    }
    
    public String getMatricola() {
    	return this.matricola;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }
    
    public void setCognome(String cognome) {
    	this.cognome = cognome;
    }
    
    public void setMatricola(String matricola) {
    	this.matricola = matricola;
    }
}
