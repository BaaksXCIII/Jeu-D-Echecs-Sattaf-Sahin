import java.util.Scanner;

public class Partie {

	private static final Joueur.couleur blanc = null;
	private static final Joueur.couleur noire = null; 
	private static final Echiquier liste = null;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Choisissez un nom");
		String valeur = scanner.nextLine();

		new Joueur(valeur, blanc); // attribution a un joueur la couleur blanche
		System.out.println("Le joueur : " + valeur + " va jouer avec les pions Blancs");
		Scanner sc = new Scanner(System.in);
		System.out.println("Choisissez un nom");
		String valeurs = sc.nextLine();

		new Joueur(valeurs, noire); // attribution a un joueur la couleur noire
		System.out.println("Le joueur : " + valeurs + " va jouer avec les pions Noirs"); 

		Echiquier echiquier = new Echiquier(); //Objet echiquier
		echiquier.afficher(); //affiche le premier echiquier
		Scanner myObj = new Scanner(System.in); 
        
		//au bout de 50 coups si aucun des deux joueurs n'a pu gagner la victoire il y a match nul

		while (true) {
			int MaxCoups = 50;
			for ( int i = 0;i < MaxCoups; i++) {

				/*
				 * Initialisation des joueurs, un pour jouer avec les pièces blanches et l'autres les pièces noires 
				 */
				
				if (i % 2 == 0)
					System.out.println("Tours des Blancs alias : " + valeur + ", Tour n°" + i);

				else
					System.out.println("Tours des Noirs alias : " + valeurs + ", Tour n°" + i);

				/*
				 * Entrer la colonne + ligne pour le depart
				 */

				System.out.println("Entrez la Position : Colonne (A à H) + Ligne (1 à 8) : ");
				String mvt = myObj.nextLine();
				mvt = mvt.toLowerCase();
				int colonneDepart = mvt.charAt(0) - 'a';
				int ligneDepart = (mvt.charAt(1) - '1');

				/*
				 * Entrer la colonne + ligne pour destination 
				 */
				
				System.out.println("Entrez la Destination : Colonne (A à H) + Ligne (1 à 8) : ");
				mvt = myObj.nextLine();
				mvt = mvt.toLowerCase();
				int colonneArrivee = mvt.charAt(0) - 'a';
				int ligneArrivee = (mvt.charAt(1) - '1');
				
				Case caseDepart = echiquier.getCase(ligneDepart, colonneDepart);

				/*
				 * Historique des derniers mouvements par chacun des joueurs
				 */

				if (i % 2 == 0)
					System.out.println(valeur + " a effectué " + "( " + colonneDepart + ligneDepart + " ) vers ( "
							+ colonneArrivee + ligneArrivee + " )");
				else
					System.out.println(valeurs + " a effectué " + "( " + colonneDepart + ligneDepart + " ) vers ( "
							+ colonneArrivee + ligneArrivee + " )");

				/*
				 * Vérification : Si la case de départ est null, message d'erreur...
				 */

				if (caseDepart == null) {
					System.out.println("La case de départ n'est pas correct, veuillez rejouer");
					i=i-1;

				}
				Case caseArrivee = echiquier.getCase(ligneArrivee, colonneArrivee);

				/*
				 * Vérification : Si la case d'arrivée est null, message d'erreur...
				 */

				if (caseArrivee == null) {
					System.out.println("La case d'arrivée n'est pas correct, veuillez rejouer");
					i=i-1;
				}

				/*
				 * Vérification : Si la case d'arrivée est aussi la case de départ, message d'erreur...
				 */

				if (caseArrivee == caseDepart) {
					System.out.println("La case de départ et d'arrivé sont les mêmes, veuillez rejouer");
					i=i-1;
				}

				/*
				 * Vérification : Si le coup est valable, on déplace la pièce et on affiche le
				 * plateau pour mettre à jour l'affichage précèdent ...
				 */

				Piece piece = caseDepart.getPiece();
				if (piece != null && piece.peutSeDeplacer(caseDepart, caseArrivee, echiquier)) {
					piece.deplacer(caseDepart, caseArrivee, echiquier);
				}
				echiquier.afficher();
			}
		}
	}
}
