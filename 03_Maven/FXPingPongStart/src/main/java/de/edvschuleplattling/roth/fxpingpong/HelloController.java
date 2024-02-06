package de.edvschuleplattling.roth.fxpingpong;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField txtLinks;
    @FXML
    private Button btnRechts;
    @FXML
    private Button btnLinks;
    @FXML
    private TextField txtRechts;
    @FXML
    private ListView<String> lstHistorie;
    @FXML
    private ChoiceBox<String> cbHistorie;

    @FXML
    public void onRechtsClick(ActionEvent actionEvent) {
        tausche(txtLinks,txtRechts);

    }

    @FXML
    public void onLinksClick(ActionEvent actionEvent) {
        tausche(txtRechts,txtLinks);

    }

    private void tausche(TextField txtQuelle,TextField txtZiel){
        String text = txtQuelle.getText();
        txtZiel.setText(text);
        txtQuelle.setText("");
        String ausgabe = text;
        if(txtQuelle == txtLinks){
            ausgabe += " -->";
        }
        else {
            ausgabe += " <--";
        }
        lstHistorie.getItems().add(ausgabe);

    }


    @Deprecated
    public void onListeLoeschen(ActionEvent actionEvent) {
        lstHistorie.getItems().clear();
    }

    @Deprecated
    public void onEintragLoeschen(ActionEvent actionEvent) {
        int selectedIndex = lstHistorie.getSelectionModel().getSelectedIndex();
        if(selectedIndex >= 0) {
            lstHistorie.getItems().remove(selectedIndex);

        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lstHistorie.getItems().add("Erster Eintrag");
        ObservableList<String> items = lstHistorie.getItems();
        cbHistorie.setItems(items);
        cbHistorie.getSelectionModel().select(0);
    }
}