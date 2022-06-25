package model;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import javafx.beans.property.StringProperty;

public class User {
	
	private IntegerProperty id = new SimpleIntegerProperty(0);
	private StringProperty nome = new SimpleStringProperty("");
	private StringProperty senha = new SimpleStringProperty("");
	private StringProperty email = new SimpleStringProperty("");

	
	
	@Override
	public String toString() {
		return "User [id=" + id + ", nome=" + nome + ", senha=" + senha + ", email=" + email + "]";
	}

	public final IntegerProperty idProperty() {
		return this.id;
	}
	
	public final int getId() {
		return this.idProperty().get();
	}
	
	public final void setId(final int id) {
		this.idProperty().set(id);
	}
	
	public final StringProperty nomeProperty() {
		return this.nome;
	}
	
	public final String getNome() {
		return this.nomeProperty().get();
	}
	
	public final void setNome(final String nome) {
		this.nomeProperty().set(nome);
	}
	
	public final StringProperty senhaProperty() {
		return this.senha;
	}
	
	public final String getSenha() {
		return this.senhaProperty().get();
	}
	
	public final void setSenha(final String senha) {
		this.senhaProperty().set(senha);
	}


	public final StringProperty emailProperty() {
		return this.email;
	}
	

	public final String getEmail() {
		return this.emailProperty().get();
	}
	

	public final void setEmail(final String email) {
		this.emailProperty().set(email);
	}
	
	
	
	


	
	
	
	
	
	
	
	
	

}
