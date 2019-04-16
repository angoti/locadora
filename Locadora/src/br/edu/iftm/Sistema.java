package br.edu.iftm;

public class Sistema {
	public static void main(String[] args) {
		Filme a = new Filme("batman", null);
		Filme b = new Filme("x-men", null);
		Filme c = new Filme("hulk", null);
		Filme d = new Filme("iron man", null);
		Cliente c1 = new Cliente("João", "1111");
		Cliente c2 = new Cliente("Maria", "2222");

		c1.emprestar(a);
		c1.emprestar(c);
		listaEmprestados(c1);

		c1.devolver(a);
		c1.devolver(c);

		listaEmprestados(c1);
	}

	private static void listaEmprestados(Cliente c1) {
		System.out.println("Filmes emprestados para João");
		for (Filme f : c1.getEmprestados()) {
			System.out.println(f.getNome());
		}
	}

}
