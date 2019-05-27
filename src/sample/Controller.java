package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import sample.Gestion.BddProduit;
import sample.Produits.Produit;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    private BddProduit bddProduit;

    public Controller(BddProduit _bddProduit)
    {
        this.bddProduit = new BddProduit(_bddProduit);
    }
    @FXML
    VBox produits = new VBox();
    @FXML
    ListView<String> listeProduits = new ListView<>();
    @FXML
    TableColumn table1 = new TableColumn();
    @FXML
    Button boutonAdd = new Button();
    @FXML
    ListView<String> listePanier = new ListView<>();
    @FXML
    Label prixPanier = new Label();
    float prix = 0;
    @Override
    public void initialize(URL location, ResourceBundle resources) {

        ObservableList<String> produits = FXCollections.observableArrayList(this.bddProduit.getProduitsString());
        this.listeProduits.setItems(produits);
        this.boutonAdd.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                float += bddProduit.getProduitSpec(listeProduits.getSelectionModel().getSelectedItem()).getPrix();
                listePanier.getItems().add(listeProduits.getSelectionModel().getSelectedItem());
                prixPanier.setText();
            }
        });
    }
}
