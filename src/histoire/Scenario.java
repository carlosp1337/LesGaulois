package histoire;


import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix",5,10);
		druide.parler("Je vais aller pr�parer une petite potion...");
		druide.preparePotion();
		Gaulois obelix = new Gaulois("Ob�lix", 25);
		druide.booster(obelix);
		obelix.parler("Par B�l�nos, ce n'est pas juste !");
		Gaulois asterix = new Gaulois("Ast�rix", 8);
		asterix.boirePotion(6);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 29);
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
