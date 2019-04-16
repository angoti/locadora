package br.edu.iftm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
	private String nome, CPF;
	private List<Filme> emprestados;

	public Cliente(String nome, String cPF) {
		super();
		this.nome = nome;
		CPF = cPF;
		emprestados = new ArrayList<Filme>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCPF() {
		return CPF;
	}

	public List<Filme> getEmprestados() {
		return Collections.unmodifiableList(emprestados);
	}

	public void devolver(Filme filme) {
		boolean confirma = emprestados.remove(filme);
		if(confirma) {
			System.out.println("Filme devolvido com sucesso");
			filme.setEmprestado(null);
		}
		else
			System.out.println("Filme não encontrado na lista");
	}
	
	public void emprestar(Filme filme) {
		emprestados.add(filme);
		filme.setEmprestado(this);
	}
}
