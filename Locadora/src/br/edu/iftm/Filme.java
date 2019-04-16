package br.edu.iftm;

public class Filme {
	private String nome;
	private Cliente emprestado;

	public Filme(String nome, Cliente emprestado) {
		super();
		this.nome = nome;
		this.emprestado = emprestado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente getEmprestado() {
		return emprestado;
	}

	public void setEmprestado(Cliente emprestado) {
		this.emprestado = emprestado;
	}
}
