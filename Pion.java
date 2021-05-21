public class Pion extends Piece {
	public Pion(boolean blanc) {
		super(blanc);
		if(blanc == false) {
			symbole = "PB";
		}
		else {
			symbole = "PN";
		}
	}
}