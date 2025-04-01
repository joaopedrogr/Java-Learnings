package Exercises.Exercise3;

public class Zoologico {
	
	public static void main(String[] args) {
		Leao leao = new Leao("Leao", 200, "Rawr");
		Macaco macaco = new Macaco("Macaco", 100, "Uh-uh-uh");
		Lobo lobo = new Lobo("Leao", 80, "Auuuuuu");
		
		leao.som();
		macaco.som();
		lobo.som();
	}
}