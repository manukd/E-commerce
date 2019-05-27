package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import sample.Gestion.BddProduit;
import sample.Produits.Alimentaire;
import sample.Produits.Fourniture;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        // Déclaration des éléments initiaux
        Magasin magasin = new Magasin("Super U");
        BddProduit produits = new BddProduit();
        produits.ajouterProduit(new Alimentaire(1,"Jambon",5,"herta"));
        produits.ajouterProduit(new Alimentaire(2,"Fromage",3,"president"));
        produits.ajouterProduit(new Alimentaire(3,"Gnochi",4,"Lustucru"));
        produits.ajouterProduit(new Alimentaire(4,"Pizza",9,"Del Arte"));
        produits.ajouterProduit(new Alimentaire(5,"Carotte",2,"Bonduelle"));
        produits.ajouterProduit(new Fourniture(6,"Chausson",10,"Zalando"));
        produits.ajouterProduit(new Fourniture(7,"Regle",3,"Maped"));
        produits.ajouterProduit(new Fourniture(8,"Crayon",1,"Maped"));
        produits.ajouterProduit(new Fourniture(9,"Poubelle",15,"Brabantia"));
        produits.ajouterProduit(new Fourniture(10,"Parasol",50,"Alice's Garden"));


        // Envoie des données à la partie graphique
        FXMLLoader loader = new FXMLLoader(getClass().getResource("sample.fxml"));
        //Parent root = loader.load(getClass().getResource("sample.fxml"));

        Controller controller = new Controller(produits);
        loader.setController(controller);

        GridPane gridPane = loader.load();
        Scene scene = new Scene(gridPane, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
