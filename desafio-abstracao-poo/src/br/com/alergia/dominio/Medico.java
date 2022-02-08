package br.com.alergia.dominio;

public class Medico {

	private Pessoa medico;
	private String crm;
	private String especialidade;

	public Medico(Pessoa medico, String crm, String especialidade) {
		this.medico = medico;
		this.crm = crm;
		this.especialidade = especialidade;
	}

	public Pessoa getMedico() {
		return medico;
	}

	public void setMedico(Pessoa medico) {
		this.medico = medico;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getAssinatura() {
		return medico.getNome() + " - Especialidade: " + getEspecialidade() + " - CRM: " + getCrm();
	}

	@Override
	public String toString() {
		return "Medico [Medico = " + medico.getNome() + ", Email: " + medico.getEmail() + ", Tipo do documento: "
				+ medico.getTipo() + ", Nº Documento: " + medico.getDocumento() + ", CRM = " + crm + ", especialidade = "
				+ especialidade + "]";
	}

}
