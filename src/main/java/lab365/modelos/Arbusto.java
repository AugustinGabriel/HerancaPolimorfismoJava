package lab365.modelos;

public class Arbusto extends Planta {

	public Arbusto(String nome) {
		super(nome, "Arbusto", "Médio");
	}

	@Override
	public void cultivar() {
		super.cultivar();
		modelar();
	}

	public void modelar() {
		System.out.print(getNome() + ": Modelando...");
		System.out.println("................");
		System.out.println(getNome() + ": Modelado!\n");
	}

}
