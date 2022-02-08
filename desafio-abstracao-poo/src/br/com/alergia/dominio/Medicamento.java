package br.com.alergia.dominio;

import java.util.ArrayList;
import java.util.List;

public class Medicamento {

	private String categoria;
	private List<String> substancias = new ArrayList<String>();

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public List<String> getSubstancias() {
		return substancias;
	}

	public void setSubstancias(List<String> substancias) {
		this.substancias = substancias;
	}

	@Override
	public String toString() {
		return " Medicamentos: [Categoria = " + categoria + ", Substancias = " + substancias + "]\n";
	}

}
