package sample.Produits;

public class Produit
{
    private int id;
    private String nom;
    private int prix;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    private String marque;

    public Produit(int _id, String _nom, int _prix, String _marque) {
        this.id = _id;
        this.nom = _nom;
        this.prix = _prix;
        this.marque = _marque;
    }

    @Override
    public String toString() {
        return (this.prix + "€ - " + this.nom);
    }
}
