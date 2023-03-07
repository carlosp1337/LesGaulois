package histoire;


import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Druide druide = new Druide("Panoramix",5,10);
		druide.parler("Je vais aller préparer une petite potion...");
		druide.preparePotion();
		Gaulois asterix = new Gaulois("Astérix", 8);
		asterix.parler("Bonjour");
		Romain minus = new Romain("Minus", 6);
		minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
	}

}
