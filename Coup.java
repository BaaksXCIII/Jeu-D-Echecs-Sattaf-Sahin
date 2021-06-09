public class Coup {
	private Case depart;
	private Case arrivee;

	public Case getDepart() { // constructeur pour obetenir la case de départ
		return depart;
	}

	public void setDepart(Case depart) { // constructeur pour modifier la case de départ
		this.depart = depart;
	}

	public Case getArrivee() { // constructeur pour obetenir la case d'arrivée
		return arrivee;
	}

	public void setArrivee(Case arrivee) { // constructeur pour modifier la case d'arrivée
		this.arrivee = arrivee;
	}

    public static boolean isEmpty() { // Pour vérifier si c'est vide
		return false;
    }

}
