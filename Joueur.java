public class Joueur {
    protected String name;
    protected couleur color;
    
    public enum couleur { //On définit couleur comme étant une liste de 2 variable blanc et noir
        blanc, Noire
    }

    public Joueur() { //constructeur vide Joueur
    }

    public Joueur(String name, couleur color) { //constructeur avec deux paramètres : name et color
        this.name = name;
        this.color = color;
    }

    public Joueur(String name) { //constructeur avec un paramètre name
        this.name = name;
    }

    public String getNom() { //Permet d'obtenir le nom
        return this.name;
    }

    public couleur getCouleur() { //Permet d'obtenir la couleur
        return color;
    }

    public void setNom(String nom) { //Permet de modifier le nom
        name = nom;
    }
}