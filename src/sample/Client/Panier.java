package sample.Client;

import sample.Produits.Produit;

import java.util.ArrayList;

public class Panier
{
    private ArrayList<Produit> produits;
    private float montant;

    public Panier() {
        this.produits = new ArrayList<>();
    }

    public void AjouterProduit(Produit _produit)
    {
        this.produits.add(_produit);
    }

    public void SupprimerProduit(Produit _produit)
    {
        this.produits.remove(_produit);
    }

    public int Payer()
    {
        int res = 0;
        for(Produit m : this.produits)
        {
            res += m.getPrix();
        }
        return res;
    }
}
