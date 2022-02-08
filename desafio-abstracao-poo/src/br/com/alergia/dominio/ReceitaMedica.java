package br.com.alergia.dominio;

import java.time.LocalDate;

public class ReceitaMedica {

	private Medico medico;
	private Paciente paciente;
	private LocalDate data = LocalDate.now();
	
	
	
	public ReceitaMedica(Medico medico, Paciente paciente, LocalDate data) {
		this.medico = medico;
		this.paciente = paciente;
		this.data = data;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Relatório Médico [" + medico.getAssinatura() + "\n\nPaciente = " + paciente.getPaciente().getNome() + " "
		+ paciente.getAlergias() + ", Atualização feita em = " + data + "]";
	}
	
	

}
