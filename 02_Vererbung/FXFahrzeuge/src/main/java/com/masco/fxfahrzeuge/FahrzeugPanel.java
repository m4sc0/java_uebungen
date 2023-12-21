package com.masco.fxfahrzeuge;

import com.masco.fxfahrzeuge.daten.Fahrzeug;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;

import java.io.IOException;

public class FahrzeugPanel extends Pane {
    @javafx.fxml.FXML
    private Label lblNr;
    @javafx.fxml.FXML
    private Label lblKz;
    @javafx.fxml.FXML
    private Label lblErstzulassung;
    @javafx.fxml.FXML
    private Label lblToString;

    public FahrzeugPanel() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fahrzeugPanel.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException e) {
            throw new RuntimeException("Couldn't load provided resources.");
        }
    }

    public void setFahrzeug(Fahrzeug f) {
        lblNr.setText("" + f.getNr());
        lblKz.setText("" + f.getKz());
        lblErstzulassung.setText("" + f.getErstZulassung().toString());
        lblToString.setText(f.toString());
    }
}
