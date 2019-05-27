package sample.Gestion;

import sample.Client.Client;

import java.util.ArrayList;

public class BddClient
{
    private ArrayList<Client> clients;

    public BddClient() {
        this.clients = new ArrayList<>();
    }

    public void ajouterClient(Client _client)
    {
        this.clients.add(_client);
    }

    public void ajouterClient(int _id, String _nom, String _prenom, float _argent)
    {
        Client c = new Client(_id,_nom,_prenom,_argent);
        this.clients.add(c);
    }
}
