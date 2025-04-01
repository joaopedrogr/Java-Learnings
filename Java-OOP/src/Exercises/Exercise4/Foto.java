package Exercises.Exercise4;

public class Foto extends Midia {
	String extensao;
	boolean mostrar = false;

	void mostrar() {
		if (mostrar == false) {
			mostrar = true;
			System.out.println("Mostrando a foto!");
		} else {
			System.out.println("A foto já está aparecendo!");
		}
	}

}