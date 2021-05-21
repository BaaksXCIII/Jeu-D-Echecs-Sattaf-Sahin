public class Echiquier {
	private Case[][] cases;
	
	public Echiquier() {
		cases = new Case[8][8];
		cases[0][0] = new Case(new Tour(true));      // Tour noir sur la case 8A
		cases[0][1] = new Case(new Cavalier(true));  // Cavalier noir sur la case 8B
      cases[0][2] = new Case(new Fou(true));       // Fou noir sur la case 8C
      cases[0][3] = new Case(new Reine(true));     // Reine noir sur la case 8D
      cases[0][4] = new Case(new Roi(true));       // Roi noir sur la case 8E
      cases[0][5] = new Case(new Fou(true));       // Fou noir sur la case 8F
      cases[0][6] = new Case(new Cavalier(true));  // Cavalier noir sur la case 8G
      cases[0][7] = new Case(new Tour(true));      // Tour noir sur la case 8H
		
      cases[1][0] = new Case(new Pion(true)); // Pion sur la case 7A
		cases[1][1] = new Case(new Pion(true)); // Pion sur la case 7B
      cases[1][2] = new Case(new Pion(true)); // Pion sur la case 7C
      cases[1][3] = new Case(new Pion(true)); // Pion sur la case 7D
      cases[1][4] = new Case(new Pion(true)); // Pion sur la case 7E
      cases[1][5] = new Case(new Pion(true)); // Pion sur la case 7F
      cases[1][6] = new Case(new Pion(true)); // Pion sur la case 7G
      cases[1][7] = new Case(new Pion(true)); // Pion sur la case 7H
      
      cases[2][0] = new Case(null); //Ligne 6 vide
      cases[2][1] = new Case(null); 
      cases[2][2] = new Case(null); 
      cases[2][3] = new Case(null); 
      cases[2][4] = new Case(null); 
      cases[2][5] = new Case(null); 
      cases[2][6] = new Case(null); 
      cases[2][7] = new Case(null); 
      
      cases[3][0] = new Case(null); //Ligne 5 vide
      cases[3][1] = new Case(null); 
      cases[3][2] = new Case(null); 
      cases[3][3] = new Case(null); 
      cases[3][4] = new Case(null); 
      cases[3][5] = new Case(null); 
      cases[3][6] = new Case(null); 
      cases[3][7] = new Case(null); 
      
      cases[4][0] = new Case(null); //Ligne 4 vide
      cases[4][1] = new Case(null); 
      cases[4][2] = new Case(null); 
      cases[4][3] = new Case(null); 
      cases[4][4] = new Case(null); 
      cases[4][5] = new Case(null); 
      cases[4][6] = new Case(null); 
      cases[4][7] = new Case(null); 
      
      cases[5][0] = new Case(null); //Ligne 3 vide
      cases[5][1] = new Case(null); 
      cases[5][2] = new Case(null); 
      cases[5][3] = new Case(null); 
      cases[5][4] = new Case(null); 
      cases[5][5] = new Case(null); 
      cases[5][6] = new Case(null); 
      cases[5][7] = new Case(null); 
      
      cases[6][0] = new Case(new Pion(false)); // Pion blanc sur la case 2A
		cases[6][1] = new Case(new Pion(false)); // Pion blanc sur la case 2B
      cases[6][2] = new Case(new Pion(false)); // Pion blanc sur la case 2C
      cases[6][3] = new Case(new Pion(false)); // Pion blanc sur la case 2D
      cases[6][4] = new Case(new Pion(false)); // Pion blanc sur la case 2E
      cases[6][5] = new Case(new Pion(false)); // Pion blanc sur la case 2F
      cases[6][6] = new Case(new Pion(false)); // Pion blanc sur la case 2G
      cases[6][7] = new Case(new Pion(false)); // Pion blanc sur la case 2H
      
      cases[7][0] = new Case(new Tour(false));     // Tour blanc sur la case 8A
		cases[7][1] = new Case(new Cavalier(false)); // Cavalier blanc sur la case 8B
      cases[7][2] = new Case(new Fou(false));      // Fou blanc sur la case 8C
      cases[7][3] = new Case(new Reine(false));    // Reine blanc sur la case 8D
      cases[7][4] = new Case(new Roi(false));      // Roi blanc sur la case 8D
      cases[7][5] = new Case(new Fou(false));      // Fou blanc sur la case 8C
      cases[7][6] = new Case(new Cavalier(false)); // Cavalier blanc sur la case 8B
      cases[7][7] = new Case(new Tour(false));     // Tour blanc sur la case 8A
      }
}  