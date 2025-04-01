package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		lista.add(u1);
		
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Duda"));
		lista.add(new Usuario("Duda"));
		
		System.out.println(lista.get(3)); // acessar pelo índice
		
		System.out.println(">>>> " + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Duda")));
		System.out.println(lista.remove(new Usuario("Duda")));
		System.out.println(lista.remove(new Usuario("Duda")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario u: lista) {
			System.out.println(u.nome);
		}
	}
}
