package lab365.modelos;

public class Aquatica extends Planta {

	public Aquatica(String nome, String porte) {
		super(nome, "Aquática", porte);
	}

	@Override
	public void plantar() {
		System.out.println(getNome() + " solta sobre a água!");
		setPlantado(true);
	}

	@Override
	public void cultivar() {
		tomarSol();
	}

}
