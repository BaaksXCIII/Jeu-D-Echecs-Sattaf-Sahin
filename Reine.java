public class Reine extends Piece {
	
	public Reine(boolean blanc) {
		super(blanc);
		if(blanc == false) {
			symbole = "RB";
		}
		else {
			symbole = "RN";
		}
	}
}