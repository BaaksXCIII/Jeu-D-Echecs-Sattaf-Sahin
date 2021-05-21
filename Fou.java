public class Fou extends Piece {
	public Fou(boolean blanc) {
		super(blanc);
		if(blanc == false) {
			symbole = "FB";
		}
		else {
			symbole = "FN";
		}
	}
}