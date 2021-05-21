public class Case {
	private Piece piece;
	
	public Piece getPiece() {
		return this.piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}
	
	public Case(Piece piece) {
		this.piece = piece;
	}
}