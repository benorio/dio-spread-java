package br.com.alergia.dominio;

import java.util.ArrayList;
import java.util.List;

public class Paciente {

	private Pessoa paciente;
	private List<Medicamento> alergias = new ArrayList<Medicamento>();
	
	

	public Paciente(Pessoa paciente, List<Medicamento> alergias) {
		this.paciente = paciente;
		this.alergias = alergias;
	}

	public Pessoa getPaciente() {
		return paciente;
	}

	public void setPaciente(Pessoa paciente) {
		this.paciente = paciente;
	}

	public List<Medicamento> getAlergias() {
		return alergias;
	}

	public void setAlergias(List<Medicamento> alergias) {
		this.alergias = alergias;
	}

	@Override
	public String toString() {
		return "Paciente [paciente= " + paciente + ", alergias = " + alergias + "]";
	}
	
	
	
}
