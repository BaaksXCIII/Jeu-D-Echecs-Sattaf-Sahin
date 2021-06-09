public class Pion extends Piece {
	/*
	 * On doit pouvoir savoir si c'est le premier coup du pion ou non
	 */
	private boolean premierCoup;

	/*
	 * Constructeur
	 */

	public Pion(boolean blanc) {
		super(blanc);
		if (blanc) {
			symbole = "\u2659"; //symbole Pion blanc
		} else {
			symbole = "\u265F"; //symbole Pion noir
		}
		premierCoup = true;
	}

	/*
	 * Une méthode pour vérifier si un pion peut se déplacer
	 */

	public boolean peutSeDeplacer(Case depart, Case arrivee, Echiquier echiquier) {
		int deplacementLignePossible;
		if (!arrivee.estVide()) {
			if (arrivee.getPiece().isBlanc() == isBlanc()) {
				return false;
			}
			if (blanc) {
				deplacementLignePossible = 1; 
			} else {
				deplacementLignePossible = -1;
			}
			return (arrivee.getColonne() == depart.getColonne() + 1 || arrivee.getColonne() == depart.getColonne() - 1)
					&& arrivee.getLigne() == depart.getLigne() + deplacementLignePossible; // Le pion mange une pièce adverse en diagonnale
		}

		 //On vérifie si la case d'arrivée et la case de départ ont la même colonne

		if (depart.getColonne() != arrivee.getColonne())
			return false;

		/*
		 * sur un premier coup d'un pion il a la possibilité d'avancer de 1 ou 2 case vers l'avant, 
		 * par la suite il ne peut que se déplacer que d'une case vers l'avant
		 */

		if (blanc) {
			if (premierCoup) {
				deplacementLignePossible = 2;
				if (arrivee.getLigne() == depart.getLigne() + deplacementLignePossible) {
					Case caseIntermediaire = echiquier.getCase(arrivee.getLigne() - 1, arrivee.getColonne());
					if (caseIntermediaire == null || !caseIntermediaire.estVide()) {
						return false;
					}
					return true;
				}
			} else {
				deplacementLignePossible = 1;
			}
			return arrivee.getLigne() > depart.getLigne()
					&& arrivee.getLigne() <= depart.getLigne() + deplacementLignePossible;
		} else {
			if (premierCoup) {
				deplacementLignePossible = -2;
				if (arrivee.getLigne() == depart.getLigne() + deplacementLignePossible) {
					Case caseIntermediaire = echiquier.getCase(arrivee.getLigne() + 1, arrivee.getColonne());
					if (caseIntermediaire == null || !caseIntermediaire.estVide()) {
						return false;
					}
					return true;
				}
			} else {
				deplacementLignePossible = -1;
			}
			return arrivee.getLigne() < depart.getLigne()
					&& arrivee.getLigne() >= depart.getLigne() + deplacementLignePossible;
		}
	}

	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) { // Méthode déplacer de pion
		super.deplacer(depart, arrivee, echiquier);
		if (premierCoup)
			premierCoup = false;
	}
}