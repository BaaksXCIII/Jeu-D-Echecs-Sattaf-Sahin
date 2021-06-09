public class Tour extends Piece {
	private boolean premierCoup;

	public Tour(boolean blanc) {
		super(blanc);
		if (blanc) {
			symbole = "\u2656"; //symbole de la tour blanche
		} else {
			symbole = "\u265C"; //symbole de la tour noire
		}
	}

	public boolean isPremierCoup() {
		return premierCoup;
	}

	public void setPremierCoup(boolean premierCoup) { 
		this.premierCoup = premierCoup;
	}

	public boolean peutSeDeplacer(Case depart, Case arrivee, Echiquier echiquier) { // Méthode qui permet de voir si la tour peut se déplacer
		if (!arrivee.estVide()) {
			if (arrivee.getPiece().isBlanc() == isBlanc()) {
				System.out.println("meme couleur ");
				return false;
			}
		}

		// Si la case d'arrivée n'est pas sur la même ligne ou colonne que
		// la case de départ on retourne false

		if (arrivee.getColonne() != depart.getColonne() && arrivee.getLigne() != depart.getLigne()) {
			return false;
		}

		//Déplacement vertical on vérifie si la tour va vers le bas ou vers le haut
		//Déplacement horizontal on vérifie si la tour va vers la gauche ou la droite

		if (arrivee.getColonne() == depart.getColonne()) {
			if (arrivee.getLigne() > depart.getLigne()) {
				for (int ligne = depart.getLigne() + 1; ligne < arrivee.getLigne(); ligne++) {
					Case c = echiquier.getCase(ligne, arrivee.getColonne());
					if (c == null || !c.estVide()) {
						return false;
					}
				}
			} else {
				for (int ligne = depart.getLigne() - 1; ligne > arrivee.getLigne(); ligne--) {
					Case c = echiquier.getCase(ligne, arrivee.getColonne());
					if (c == null || !c.estVide()) {
						return false;
					}
				}
			}
		} else {
			if (arrivee.getColonne() > depart.getColonne()) {
				for (int colonne = depart.getColonne() + 1; colonne < arrivee.getColonne(); colonne++) {
					Case c = echiquier.getCase(arrivee.getLigne(), colonne);
					if (c == null || !c.estVide()) {
						return false;
					}
				}
			} else {
				for (int colonne = depart.getColonne() - 1; colonne > arrivee.getColonne(); colonne--) {
					Case c = echiquier.getCase(arrivee.getLigne(), colonne);
					if (c == null || !c.estVide()) {
						return false;
					}
				}
			}
		}
		return true;
	}

	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) { //Méthode de déplacement pour la tour
		super.deplacer(depart, arrivee, echiquier);
		if (premierCoup)
			premierCoup = false;
	}
}