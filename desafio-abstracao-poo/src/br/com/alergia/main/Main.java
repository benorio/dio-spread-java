package br.com.alergia.main;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.alergia.dominio.Medicamento;
import br.com.alergia.dominio.Medico;
import br.com.alergia.dominio.Paciente;
import br.com.alergia.dominio.Pessoa;
import br.com.alergia.dominio.ReceitaMedica;
import br.com.alergia.dominio.TipoDocumento;

public class Main {

	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		Pessoa pessoa = new Pessoa("Jose", "email@gmail.com", TipoDocumento.CPF, "333.444.555-63");
		Pessoa pessoa2 = new Pessoa("Dra Maria", "email@gmail.com", TipoDocumento.CNPJ, "27.543.0001/15");

		Medicamento analgesicos = new Medicamento();
		analgesicos.setCategoria("Analgésicos");
		analgesicos.getSubstancias().add("Dipirona");
		analgesicos.getSubstancias().add("Paracetamol");

		Medicamento antiInflamatorio = new Medicamento();
		antiInflamatorio.setCategoria("Anti-inflamatório");
		antiInflamatorio.getSubstancias().add("Meloxican");

		Medicamento antiBiotico = new Medicamento();
		antiBiotico.setCategoria("Antibiótico");
		antiBiotico.getSubstancias().add("Bezentacil");

		List<Medicamento> alergias = new ArrayList<Medicamento>();
		alergias.add(analgesicos);
		alergias.add(antiInflamatorio);
		alergias.add(antiBiotico);

		Paciente paciente = new Paciente(pessoa, alergias);
		Medico medico = new Medico(pessoa2, "2717", "Alergista");
		
		ReceitaMedica receita = new ReceitaMedica(medico, paciente, data);

		System.out.println(receita);
	}

}
