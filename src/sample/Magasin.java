package sample;

import sample.Client.Client;
import sample.Gestion.BddClient;
import sample.Gestion.BddProduit;
import sample.Produits.Produit;

import java.util.ArrayList;

public class Magasin
{
    private String nom;
    private BddProduit produits;
    private BddClient clients;

    public Magasin(String nom) {
        this.nom = nom;
        this.produits = new BddProduit();
        this.clients = new BddClient();
    }

    public void ajouterProduit(Produit _produit)
    {
        this.produits.ajouterProduit(_produit);
    }

    public void ajouterProduit()
    {

    }

    public void ajouterClient(Client _client)
    {
        this.clients.ajouterClient(_client);
    }

    public void ajouterClient()
    {

    }
    
}
