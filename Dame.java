public class Dame extends Piece {

	public Dame(boolean blanc) {
		super(blanc);
		if (blanc) {
			symbole = "\u2655"; //symbole de la dame blanche 
		} else {
			symbole = "\u265B"; //symbole de la dame noire
		}
	}

	public boolean peutSeDeplacer(Case depart, Case arrivee, Echiquier echiquier) {
		if (!arrivee.estVide()) {
			if (arrivee.getPiece().isBlanc() == isBlanc()) {
				System.out.println("meme couleur");
				return false;
			}
		}

		
		//On fusionne les mouvements de la tour et du fou
		 

		if (arrivee.getColonne() != depart.getColonne() && arrivee.getLigne() != depart.getLigne()
				&& arrivee.getLigne() - arrivee.getColonne() != depart.getLigne() - depart.getColonne()
				&& arrivee.getLigne() + arrivee.getColonne() != depart.getLigne() + depart.getColonne()) {
			System.out.println("Erreur : coup non valable pour la dame");
			return false;
		}

		//si la verification du dessus est passée, alors on verifie si la case d'arrivée et de départ ne contienne pas de pièce

		if (arrivee.getColonne() == depart.getColonne()) {
			if (arrivee.getLigne() > depart.getLigne()) {
				for (int ligne = depart.getLigne() + 1; ligne < arrivee.getLigne(); ligne++) {
					Case c = echiquier.getCase(ligne, arrivee.getColonne());
					if (c == null || !c.estVide()) {
						System.out.println("Erreur 1");
						return false;
					}
				}
			} else {
				for (int ligne = depart.getLigne() - 1; ligne > arrivee.getLigne(); ligne--) {
					Case c = echiquier.getCase(ligne, arrivee.getColonne());
					if (c == null || !c.estVide()) {
						System.out.println("Erreur 2");
						return false;
					}
				}
			}
		}
		if (arrivee.getLigne() == depart.getLigne()) {
			if (arrivee.getColonne() > depart.getColonne()) {
				for (int colonne = depart.getColonne() + 1; colonne < arrivee.getColonne(); colonne++) {
					Case c = echiquier.getCase(arrivee.getLigne(), colonne);
					if (c == null || !c.estVide()) {
						System.out.println("Erreur 3");
						return false;
					}
				}
			} else {
				for (int colonne = depart.getColonne() - 1; colonne > arrivee.getColonne(); colonne--) {
					Case c = echiquier.getCase(arrivee.getLigne(), colonne);
					if (c == null || !c.estVide()) {
						System.out.println("Erreur 4");
						return false;
					}
				}
			}
		}
		if (arrivee.getLigne() - arrivee.getColonne() == depart.getLigne() - depart.getColonne()) {
			if (arrivee.getLigne() > depart.getLigne()) {
				for (int ligne = depart.getLigne() + 1; ligne < arrivee.getLigne(); ligne++) {
					Case c = echiquier.getCase(ligne, ligne - depart.getLigne() + depart.getColonne());
					if (c == null || !c.estVide()) {
						System.out.println("Erreur 5");
						return false;
					}
				}
			} else {
				for (int ligne = depart.getLigne() - 1; ligne > arrivee.getLigne(); ligne--) {
					Case c = echiquier.getCase(ligne, ligne - depart.getLigne() + depart.getColonne());
					if (c == null || !c.estVide()) {
						System.out.println("Erreur 6");
						return false;
					}
				}
			}
		}
		if (arrivee.getLigne() + arrivee.getColonne() == depart.getLigne() + depart.getColonne()) {
			if (arrivee.getLigne() > depart.getLigne()) {
				for (int ligne = depart.getLigne() + 1; ligne < arrivee.getLigne(); ligne++) {
					Case c = echiquier.getCase(ligne, depart.getLigne() + depart.getColonne() - ligne);
					if (c == null || !c.estVide()) {
						System.out.println("Erreur 7");
						return false;
					}
				}
			} else {
				for (int ligne = depart.getLigne() - 1; ligne > arrivee.getLigne(); ligne--) {
					Case c = echiquier.getCase(ligne, depart.getLigne() + depart.getColonne() - ligne);
					if (c == null || !c.estVide()) {
						System.out.println("Erreur 8");
						return false;
					}
				}
			}
		}
		return true;
	}

	public void deplacer(Case depart, Case arrivee, Echiquier plateau) { //Méthode qui permet à la dame de se déplacer
		super.deplacer(depart, arrivee, plateau);
	}
}
