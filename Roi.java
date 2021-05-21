public class Roi extends Piece {
	
	public Roi(boolean blanc) {
		super(blanc);
		if (blanc == false) {
			this.symbole = "RB";
		}
		else {
			this.symbole = "RN";
		}
	}
	
}