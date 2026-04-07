import java.util.Scanner;

/**
 * classe qui cree des lampes et une telecommande associee.
 */

public class Main {

	public static void main(String args[]) {
		// la telecommande vide
		Telecommande t = new Telecommande();

		// ajoute des objets
		// utilisation de refactor (extract method)
		// pour rendre le code plus clair
		ajouter4Peripheriques(t);

		// test d'activation
		System.out.println(t);

		// gestion du menu
	}


	/**
	 * creation des objets et ajout dans la telecommande
	 * 
	 * @param t
	 *            telecommande dans lequelle on ajoute 4 lampes
	 */
	private static void ajouter4Peripheriques(Telecommande t) {
		Lampe l1 = new Lampe("Lampe1");
		t.ajouterPeripherique(l1);

		Lampe l2 = new Lampe("Lampe2");
		t.ajouterPeripherique(l2);

		Hifi h1 = new Hifi();
		t.ajouterPeripherique(h1);

		Hifi h2 = new Hifi();
		t.ajouterPeripherique(h2);
	}

}
