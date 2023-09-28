//definição do pacote
package entities;

import java.util.UUID;

//declaração da classe
public class Cliente {

	// declaração dos atributos

	private UUID id;
	private String nome;
	private String Email;
	private String Cpf;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getCpf() {
		return Cpf;
	}

	public void setCpf(String cpf) {
		Cpf = cpf;
	}

}
