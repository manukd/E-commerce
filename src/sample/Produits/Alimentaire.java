package sample.Produits;

import java.util.Date;

public class Alimentaire extends Produit {

    private String Type;
    private Date datePeremption;
    private String provenance;

    public Alimentaire(int _id, String _nom, int _prix, String _marque) {
        super(_id, _nom, _prix, _marque);
    }
}
