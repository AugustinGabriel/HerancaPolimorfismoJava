package lab365.modelos;

public abstract class Planta {

	private String nome;
	private String tipo;
	private String porte;
	private boolean plantado = false;

	/* Construtor */
	public Planta(String nome, String tipo, String porte) {
		this.nome = nome;
		this.tipo = tipo;
		this.porte = porte;
	}

	/* Métodos comuns */
	public void plantar() {
		if (plantado) {
			System.out.println(nome + ": Plantio já realizado anteriormente!\n");
			return;
		}
		System.out.print(nome + ": Plantando...");
		plantado = true;
		System.out.println("................");
		System.out.println(nome + ": Plantio realizado!\n");
	}
	public void cultivar() {
		if (!verificaPlantio())
			return;
		regar();
		podar();
		adubar();
		tomarSol();
	}
	protected void regar() {
		if (!verificaPlantio())
			return;
		System.out.print(nome + ": Regando");
		System.out.println(".....................");
		System.out.println(nome + ": Regada\n");
	}
	protected void podar() {
		if (!verificaPlantio())
			return;
		System.out.print(nome + ": Realizando a poda");
		System.out.println("...........");
		System.out.println(nome + ": Poda realizada\n");
	}
	protected void adubar() {
		if (!verificaPlantio())
			return;
		System.out.print(nome + ": Adubando " + nome);
		System.out.println("......");
		System.out.println(nome + ": Adubada\n");
	}
	protected void tomarSol() {
		if (!verificaPlantio())
			return;
		System.out.print(nome + ": Tomando sol");
		System.out.println(".................");
		System.out.println(nome + ": Retirada do sol\n");
	}
	private boolean verificaPlantio() {
		boolean plantado = isPlantado();
		if (!plantado) {
			System.out.println(nome + ": Plantio não realizado! Plante antes de cultivar!\n");
		}
		return plantado;
	}

	/* Getters e Setters */
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPorte() {
		return porte;
	}
	public void setPorte(String porte) {
		this.porte = porte;
	}
	public boolean isPlantado() {
		return plantado;
	}
	protected void setPlantado(boolean plantado) {
		this.plantado = plantado;
	}

	@Override
	public String toString() {
		return "\n# " + nome + "\n# Planta do tipo " + tipo + "\n# Porte " + porte;
	}

}
