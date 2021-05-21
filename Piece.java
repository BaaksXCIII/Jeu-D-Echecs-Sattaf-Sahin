public abstract class Piece {
	
	private boolean blanc = false;
	protected String symbole;
	
	public Piece(boolean blanc) {
		this.setBlanc(blanc);
	}
	
	public boolean isBlanc() {
		return blanc;
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
}