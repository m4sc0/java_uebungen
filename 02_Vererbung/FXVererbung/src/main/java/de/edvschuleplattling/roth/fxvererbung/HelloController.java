package de.edvschuleplattling.roth.fxvererbung;

import de.edvschuleplattling.roth.fxvererbung.daten.Adresse;
import de.edvschuleplattling.roth.fxvererbung.daten.Auftrag;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ChoiceBox<Auftrag> cbLang;
    @FXML
    private ChoiceBox<Auftrag> cbKurz;
    @FXML
    private TextField txtAuswahl;
    @FXML
    private Pane panVermischtes;
    @FXML
    private TextField txtFeld1;
    @FXML
    private TextArea txtFeld2;

    private TextInputControl[] mussfelder;
    private Node[] verschwinden;

    private Adresse a1 = new Adresse("Lena-Christ-Str.", "10", "94447", "Plattling");
    private Adresse a2 = new Adresse("Sonnengarten", "3", "84335", "Mitterskirchen");
    @FXML
    private Button buttonAusgefuellt;
    @FXML
    private Button btnAlle;
    @FXML
    private AnchorPane apKino;
    @FXML
    private CheckBox chbUeberlaenge;
    @FXML
    private CheckBox chbSpaet;
    @FXML
    private TextField txtTitel;
    @FXML
    private Label lblTitel;
    @FXML
    private Label lblRegisseur;
    @FXML
    private TextField txtRegisseur;
    @FXML
    private Button btnVerschwinde;
    @FXML
    private AdressePane panAdresse1;
    @FXML
    private AdressePane panAdresse2;
    @FXML
    private Button btnAdresseSwitch;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mussfelder = new TextInputControl[] {txtFeld1, txtFeld2, txtTitel, txtRegisseur};
        verschwinden = new Node[] {txtTitel, txtRegisseur, chbUeberlaenge, chbSpaet, lblTitel, lblRegisseur};

        cbKurz.getItems().addAll(Auftrag.testDaten());
        cbKurz.getSelectionModel().selectFirst();
        cbLang.getItems().addAll(Auftrag.testDaten());
        cbLang.getSelectionModel().selectFirst();

        cbKurz.setConverter(new AuftragConverterKurz());
        cbLang.setConverter(new AuftragConverterLang());

        panAdresse1.setAdresse(a1);
        panAdresse2.setAdresse(a2);
    }

    @Deprecated
    public void onAuswahl(ActionEvent actionEvent) {
        Auftrag auftrag = cbKurz.getSelectionModel().getSelectedItem();
        txtAuswahl.setText(auftrag.getNr() + " vom " + auftrag.getDatum().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)));
        System.out.println();
    }

    @FXML
    public void onAusgefuellt(ActionEvent actionEvent) {
        for (TextInputControl ti : mussfelder) {
            if (ti.getText().equals("")) {
                ti.setPromptText("Mussfeld");
                ti.requestFocus();
            } else {
                ti.setPromptText("");
            }
        }
    }

    @FXML
    public void onVerschwinde(ActionEvent actionEvent) {
//        for (Node child : apKino.getChildren()) {
//            child.setVisible(!child.isVisible());
//        }

        for (Node child : apKino.getChildren()) {
            if (child instanceof Label lbl) {
                lbl.setVisible(!lbl.isVisible());
            }
            if (child.equals(chbUeberlaenge)) {
                child.setVisible(!child.isVisible());
            }
        }
    }

    @FXML
    public void onAlle(ActionEvent actionEvent) {
        List<Node> children = panVermischtes.getChildren();
        for (Node child : children) {
            double rotate = child.getRotate();
            rotate += 20;
            child.setRotate(rotate);
            if (child instanceof TextInputControl ti) {
                ti.setText("AAAAAAHHHHHHHHHHH");
                if (rotate == 0 || rotate % 360 == 0) {
                    ti.setText("is oke");
                }
            }
        }
    }

    @FXML
    public void onAdressSwitch(ActionEvent actionEvent) {
        Adresse pa1 = panAdresse1.getAdresse();
        Adresse pa2 = panAdresse2.getAdresse();

        panAdresse1.setAdresse(pa2);
        panAdresse2.setAdresse(pa1);
    }
}