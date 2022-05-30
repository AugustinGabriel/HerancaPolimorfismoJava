package lab365;

import lab365.modelos.Aquatica;
import lab365.modelos.Arbusto;
import lab365.modelos.Planta;

public class HerancaPolimorfismoMain {

	public static void main(String[] args) {

		Arbusto arbusto = new Arbusto("Pingo de ouro");
		System.out.println(arbusto);		
		plantarCultivar(arbusto);
		
		Aquatica aquatica = new Aquatica("Vitória-régia", "Grande");
		System.out.println(aquatica);
		plantarCultivar(aquatica);

	}

	private static void plantarCultivar(Planta planta) {
		planta.plantar();
		planta.cultivar();
	}

}
