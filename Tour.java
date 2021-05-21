public class Tour extends Piece {
	public Tour(boolean blanc) {
		super(blanc);
		if(blanc == false) {
			symbole = "TB";
		}
		else {
			symbole = "TN";
		}
	}
}