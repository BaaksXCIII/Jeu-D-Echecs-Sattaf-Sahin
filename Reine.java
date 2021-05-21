public class Reine extends Piece {
	
	public Reine(boolean blanc) {
		super(blanc);
		if(blanc == false) {
			symbole = "DB";
		}
		else {
			symbole = "DN";
		}
	}
}