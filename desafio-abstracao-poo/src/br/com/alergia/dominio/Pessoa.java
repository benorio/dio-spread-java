package br.com.alergia.dominio;

public class Pessoa {

	private String nome;
	private String email;
	private String documento;
	private TipoDocumento tipo;

	public Pessoa(String nome, String email, TipoDocumento tipo ,String documento) {
		this.nome = nome;
		this.email = email;
		this.tipo = tipo;
		this.documento = documento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public TipoDocumento getTipo() {
		return tipo;
	}

	public void setTipo(TipoDocumento tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "[nome = " + nome + ", email = " + email + ", documento = " + documento + ", tipo = " + tipo + "]";
	}
	
	

}
