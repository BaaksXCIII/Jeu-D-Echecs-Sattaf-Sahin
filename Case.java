public class Case {
	private int ligne;
	private int colonne;
	private Piece piece;
	
	public Case(int ligne, int colonne, Piece piece) { //constructeur avec 3 paramètres : ligne, colonne, piece
		this.piece = piece;
		this.ligne = ligne;
		this.colonne = colonne;
	}
	
	public int getLigne() { //getter, permet d'obtenir la ligne
		return ligne;
	}

	public void setLigne(int ligne) { //setter, permet de modifier la ligne
		this.ligne = ligne; 
	}

	public int getColonne() { //getter, permet d'obtenir la colonne
		return colonne;
	}

	public void setColonne(int colonne) { //setter, permet de modifier la colonne
		this.colonne = colonne;
	}
	
	public Piece getPiece() { //getter, permet d'obtenir la piece
		return this.piece;
	}

	public void setPiece(Piece piece) { //setter, permet de modifier la piece
		this.piece = piece;
	}
	
	public boolean estVide() { //méthode pour vérifier si la case est vide
		return this.piece == null;
	}
}