public class Cavalier extends Piece {
	public Cavalier(boolean blanc) {
		super(blanc);
		if (blanc) {
			symbole = "\u2658"; //symbole du cavalier blanc
		} else {
			symbole = "\u265E"; //symbole du cavalier noir
		}
	}

	public boolean peutSeDeplacer(Case depart, Case arrivee, Echiquier echiquier) { //Méthode pour vérifier si le cavalier peut se déplacer

		if (!arrivee.estVide() && arrivee.getPiece().isBlanc() == this.isBlanc()) {
			return false;
		}

		// Deux variables calculent la valeur absolue de la différence entre la ligne/colonne de départ et celle d'arrivée 
		// si l'égalité du produit est égal à 2 alors on retourne vraie
		
		int diffLigne = Math.abs(depart.getLigne() - arrivee.getLigne());
		int diffColonne = Math.abs(depart.getColonne() - arrivee.getColonne());
		return diffLigne * diffColonne == 2;
	}

	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) { //Méthode de déplacement pour le cavalier
		super.deplacer(depart, arrivee, echiquier);
	}
}