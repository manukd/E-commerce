package sample.Gestion;

import sample.Produits.Produit;

import java.util.ArrayList;

public class BddProduit
{
    public ArrayList<Produit> getProduits() {
        return produits;
    }

    public ArrayList<String> getProduitsString() {
        ArrayList<String> list = new ArrayList<>();
        for (Produit prod:this.produits)
        {
            list.add(prod.toString());
        }
        return list;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }

    private ArrayList<Produit> produits;
    public BddProduit()
    {
        this.produits = new ArrayList<>();
    }
    public BddProduit(BddProduit _bddProduit)
    {
        this.produits = _bddProduit.getProduits();
    }

    public void ajouterProduit(Produit _produit)
    {
        this.produits.add(_produit);
    }

    public void ajouterProduit( int _id, String _nom, int _prix, String _marque)
    {
        Produit p = new Produit(_id,_nom,_prix,_marque);
        this.produits.add(p);
    }

    public Produit getProduitSpec(String _prod)
    {
        for (int i = 0 ; i < this.produits.size() ; i++)
        {
            //this.produits.get(i).toString() == _prod.is;
        }
    }
}
