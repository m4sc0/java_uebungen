package de.edvschuleplattling.roth.fxvererbung;

import de.edvschuleplattling.roth.fxvererbung.daten.Adresse;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.Pane;
import javafx.scene.control.TextField;

import java.io.IOException;

public class AdressePane extends Pane {
    @javafx.fxml.FXML
    private TextField txtStrasse;
    @javafx.fxml.FXML
    private TextField txtHausnr;
    @javafx.fxml.FXML
    private TextField txtPlz;
    @javafx.fxml.FXML
    private TextField txtStadt;

    public AdressePane() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("adresse.fxml"));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setAdresse(Adresse a) {
        txtStrasse.setText(a.getStrasse());
        txtHausnr.setText(a.getHausNr());
        txtPlz.setText(a.getPlz());
        txtStadt.setText(a.getStadt());
    }

    public Adresse getAdresse() {
        if (txtStrasse.getText().equals("")) throw new IllegalArgumentException();
        if (txtHausnr.getText().equals("")) throw new IllegalArgumentException();
        if (txtPlz.getText().equals("")) throw new IllegalArgumentException();
        if (txtStadt.getText().equals("")) throw new IllegalArgumentException();
        return new Adresse(txtStrasse.getText(), txtHausnr.getText(), txtPlz.getText(), txtStadt.getText());
    }

    public String getXyz() {
        return txtStrasse.getText();
    }

    public void setXyz(String xyz) {
        txtStrasse.setText(xyz);
    }
}
