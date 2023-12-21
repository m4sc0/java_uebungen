package com.masco.fxfahrzeuge;

import com.masco.fxfahrzeuge.daten.Fahrzeug;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @javafx.fxml.FXML
    private ChoiceBox<Fahrzeug> chbFahrzeug;
    @javafx.fxml.FXML
    private Label lblOutput;
    @javafx.fxml.FXML
    private Button btnErstzulassung;
    @javafx.fxml.FXML
    private FahrzeugPanel fp1;
    @javafx.fxml.FXML
    private FahrzeugPanel fp2;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        chbFahrzeug.getItems().addAll(Fahrzeug.testDaten());
        chbFahrzeug.getSelectionModel().selectFirst();
        chbFahrzeug.setConverter(new FahrzeugConverter());

        fp1.setFahrzeug(Fahrzeug.testDaten().get(0));
        fp2.setFahrzeug(Fahrzeug.testDaten().get(Fahrzeug.testDaten().size()-1));
    }

    @javafx.fxml.FXML
    public void onErstzulassung(ActionEvent actionEvent) {
        lblOutput.setText(chbFahrzeug.getSelectionModel().getSelectedItem().getErstZulassung().toString());
    }
}