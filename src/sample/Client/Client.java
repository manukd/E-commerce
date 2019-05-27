package sample.Client;

public class Client
{
    private int id;
    private String nom;
    private String prenom;
    private float argent;
    private Panier panier;

    public Client(int id, String nom, String prenom, float argent) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.argent = argent;
        this.panier = new Panier();
    }


}
