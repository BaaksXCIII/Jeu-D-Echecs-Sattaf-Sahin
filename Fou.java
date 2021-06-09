public class Fou extends Piece {
	public Fou(boolean blanc) {
		super(blanc);
		if (blanc) {
			symbole = "\u2657"; //symbole du Fou blanc
		} else {
			symbole = "\u265D"; //symbole du Fou noir
		}
	}

	public boolean peutSeDeplacer(Case depart, Case arrivee, Echiquier echiquier) { //Méthode pour verifier si le fou peut se déplacer
		if (!arrivee.estVide()) {
			if (arrivee.getPiece().isBlanc() == isBlanc()) {
				System.out.println("Vous ne pouvez pas manger vos alliés");
				return false;
			}
		}

		//Si la case d'arrivée n'est pas sur la diagonale de la case de départ alors on retourne faux
		
		if (arrivee.getLigne() - arrivee.getColonne() != depart.getLigne() - depart.getColonne()
				&& arrivee.getLigne() + arrivee.getColonne() != depart.getLigne() + depart.getColonne())
			return false;

		/*
		 * On vérifie les deux conditions ci-dessous pour valider le déplacement d'un fou
		 * Condition n°1 : arriveeLigne - arriveeColonne = departLigne - departColonne
		 * Condition n°2 : arriveeLigne + arriveeColonne = departLigne + departColonne
		 */

		if (arrivee.getLigne() - arrivee.getColonne() == depart.getLigne() - depart.getColonne()) {
			if (arrivee.getLigne() > depart.getLigne()) {
				for (int ligne = depart.getLigne() + 1; ligne < arrivee.getLigne(); ligne++) {
					Case c = echiquier.getCase(ligne, ligne - depart.getLigne() + depart.getColonne());
					if (c == null || !c.estVide()) {
						return false;
					}
				}
			} else {
				for (int ligne = depart.getLigne() - 1; ligne > arrivee.getLigne(); ligne--) {
					Case c = echiquier.getCase(ligne, ligne - depart.getLigne() + depart.getColonne());
					if (c == null || !c.estVide()) {
						return false;
					}
				}
			}
		} else {
			if (arrivee.getLigne() > depart.getLigne()) {
				for (int ligne = depart.getLigne() + 1; ligne < arrivee.getLigne(); ligne++) {
					Case c = echiquier.getCase(ligne, depart.getLigne() + depart.getColonne() - ligne);
					if (c == null || !c.estVide()) {
						return false;
					}
				}
			} else {
				for (int ligne = depart.getLigne() - 1; ligne > arrivee.getLigne(); ligne--) {
					Case c = echiquier.getCase(ligne, depart.getLigne() + depart.getColonne() - ligne);
					if (c == null || !c.estVide()) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) { //Méthode de déplacement pour le fou
		super.deplacer(depart, arrivee, echiquier);
	}
}