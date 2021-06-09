public abstract class Piece {
	
	 //Une pièce a une couleur et son symbole en fonction de sa couleur 
	
	protected boolean blanc;
	protected String symbole;
	
	 //Constructeur de la pièce
	
	public Piece(boolean blanc) {
		this.blanc = blanc;
	}

	//Getters et setters
	
	public boolean isBlanc() {
		return this.blanc;
	}

	public void setBlanc(boolean blanc) {
		this.blanc = blanc;
	}

	public void setSymbole(String symbole) {
		this.symbole = symbole;
	}
	
	public String getSymbole() {
		return this.symbole;
	}
	
	public void deplacer(Case depart, Case arrivee, Echiquier echiquier) {
		if(depart.getPiece() != this) {
			return;
		}
		arrivee.setPiece(this);
		depart.setPiece(null);
	}
	
	public abstract boolean peutSeDeplacer(Case depart, Case arrivee, Echiquier echiquier);
}
