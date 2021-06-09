public class Roi extends Piece {
	private boolean premierCoup;

	public Roi(boolean blanc) {
		super(blanc);
		if (blanc) {
			symbole = "\u2654"; //symbole du Roi blanc
		} else {
			symbole = "\u265A"; //symbole du Roi noir
		}
	}

	public boolean peutSeDeplacer(Case depart, Case arrivee, Echiquier echiquier) {
		if (!arrivee.estVide()) {
			if (arrivee.getPiece().isBlanc() == isBlanc()) {
				System.out.println("Vous ne pouvez pas manger vos pièces");
				return false;
			}
		}

		/*
		 * Si la colonne d'arrivée et la colonne de départ sont les mêmes, on vérifie si le coup
		 * joué est un déplacement d'une case vers le haut ou vers le bas
		 */

		if (arrivee.getColonne() == depart.getColonne()) { 
			if (arrivee.getLigne() != depart.getLigne() + 1 && arrivee.getLigne() != depart.getLigne() - 1) {
				System.out.println("Erreur n°1");
				return false;
			}
		}

		/*
		 * Si la ligne d'arrivée la ligne de départ sont les mêmes, on vérifie si le coup joué
		 * est un déplacement d'une case vers la gauche ou vers la droite
		 */

		if (arrivee.getLigne() == depart.getLigne()) {
			if (arrivee.getColonne() != depart.getColonne() + 1 && arrivee.getColonne() != depart.getColonne() - 1) {
				System.out.println("Erreur n°2");
				return false;
			}
		}

		/*
		 * on compare la ligne d'arrivée et la ligne de départ pour vérifier si on monte ou descend d'une case en
		 * si on monte ou descend d'une case en diagonale que si la condition est vraie
		 */

		if (arrivee.getLigne() - arrivee.getColonne() == depart.getLigne() - depart.getColonne()) {
			if (arrivee.getLigne() != depart.getLigne() + 1 && arrivee.getLigne() != depart.getLigne() - 1) {
				System.out.println("Erreur n°3");
				return false;
			}
		}

		/*
		 * on compare la ligne d'arrivée et la ligne de départ pour vérifier 
		 * si on monte ou descend d'une case en diagonale que si la condition est vraie
		 */

		if (arrivee.getLigne() + arrivee.getColonne() == depart.getLigne() + depart.getColonne()) {
			if (arrivee.getLigne() != depart.getLigne() + 1 && arrivee.getLigne() != depart.getLigne() - 1) {
				System.out.println("Erreur n°4");
				return false;
			}
		}

		return true;
	}

	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) { //Méthode super de la classe Piece.java, pour avoir la méthode de déplacement
		super.deplacer(depart, arrivee, echiquier);						   
	}

	public boolean isPremierCoup() { // Méthode pour definir le premier coup
		return premierCoup;
	}

	public void setPremierCoup(boolean premierCoup) { // Setter premierCoup
		this.premierCoup = premierCoup;
	}
}