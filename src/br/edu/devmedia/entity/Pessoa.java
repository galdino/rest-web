/**
 * 
 */
package br.edu.devmedia.entity;

import java.util.List;
import java.util.Map;

/**
 * @author fernando.fgsf
 *
 */
public class Pessoa {
	
	private String nome;
	
	private List<Pessoa> filhos;
	
	private Map<String, Pessoa> irmaos;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Pessoa> getFilhos() {
		return filhos;
	}

	public void setFilhos(List<Pessoa> filhos) {
		this.filhos = filhos;
	}

	public Map<String, Pessoa> getIrmaos() {
		return irmaos;
	}

	public void setIrmaos(Map<String, Pessoa> irmaos) {
		this.irmaos = irmaos;
	}

}
