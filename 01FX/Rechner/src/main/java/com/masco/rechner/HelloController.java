package com.masco.rechner;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private TextField txtZahl1;
    @FXML
    private TextField txtZahl2;
    @FXML
    private TextField txtOutput;
    @FXML
    private Button btnMin;
    @FXML
    private Button btnPL;
    @FXML
    private Button btnMal;
    @FXML
    private Button btnPoten;
    @FXML
    private Button btnDivi;
    @FXML
    private TextField txtErg;

    @FXML
    private ListView<String> lstHistorie;
    @FXML
    private ChoiceBox cbHistorie;

    @FXML
    private void addToList(String zeichen, double ergebnis) {
        String res = txtZahl1.getText() + "" + zeichen + "" + txtZahl2.getText() + "=" + ergebnis;
        lstHistorie.getItems().add(res);
    }

    @FXML
    private int parseText2Int(TextField textField) {
        String input = textField.getText();
        return Integer.parseInt(input);
    }
    @FXML
    private double parseText2Double(TextField test1){
        String input = test1.getText();
        return Double.parseDouble(input);
    }
    @FXML
    public void onButtonPlus(ActionEvent actionEvent){
        double erg = parseText2Double(txtZahl1) + parseText2Double(txtZahl2);
        txtErg.setText(Double.toString(erg));
        addToList("+", erg);
    }

    @FXML
    public void onButtonMin(ActionEvent actionEvent) {
        double erg = parseText2Double(txtZahl1) - parseText2Double(txtZahl2);
        txtErg.setText(Double.toString(erg));
        addToList("-", erg);
    }

    @FXML
    public void onButtonMal(ActionEvent actionEvent) {
        double erg = parseText2Double(txtZahl1) * parseText2Double(txtZahl2);
        txtErg.setText(Double.toString(erg));
        addToList("*", erg);
    }

    @FXML
    public void onButtonGeteilt(ActionEvent actionEvent) {
        double erg = parseText2Double(txtZahl1) / parseText2Double(txtZahl2);
        txtErg.setText(Double.toString(erg));
        addToList("/", erg);
    }

    @FXML
    public void onButtonPoten(ActionEvent actionEvent){
        double erg = Math.pow(parseText2Double(txtZahl1), parseText2Double(txtZahl2));
        txtErg.setText(Double.toString(erg));
        addToList("^", erg);
    }

    public void onButtonModulo(ActionEvent actionEvent) {
        try {
            double zahl1 = parseText2Double(txtZahl1);
            double zahl2 = parseText2Double(txtZahl2);

            if (zahl2 != 0) {
                double ergebnis = zahl1 % zahl2;
                txtErg.setText(Double.toString(ergebnis));
                addToList("%", ergebnis);
            } else {
                txtErg.setText("Division durch Null nicht erlaubt");
            }
        } catch (NumberFormatException e) {
            txtErg.setText("Ungültige Eingabe");
        }
    }
    @FXML
    public void onButtonGgt(ActionEvent actionEvent) {
        int zahl1 = parseText2Int(txtZahl1);
        int zahl2 = parseText2Int(txtZahl2);

        int ggt = berechneGgt(zahl1, zahl2);
        txtErg.setText(Integer.toString(ggt));
        addToList(" GGT ", ggt);
    }

    @FXML
    private int berechneGgt(int zahl1, int zahl2) {
        while (zahl2 != 0) {
            int temp = zahl2;
            zahl2 = zahl1 % zahl2;
            zahl1 = temp;
        }
        return zahl1;
    }
    @FXML
    public void handle(ActionEvent event){
        if(event.getSource() == btnPL){
            onButtonPlus(event);
        }
    }

    public void onListClear(ActionEvent actionEvent) {
        lstHistorie.getItems().clear();
    }

    public void onDeleteEntry(ActionEvent actionEvent) {
        int selectIndex = lstHistorie.getSelectionModel().getSelectedIndex();
        if (selectIndex == -1) return;
        lstHistorie.getItems().remove(selectIndex);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lstHistorie.getItems().add("Erster Eintrag");
        ObservableList<String> items = lstHistorie.getItems();
        cbHistorie.setItems(items);
        cbHistorie.getSelectionModel().select(0);


    }

    public void onCopyToField(ActionEvent actionEvent) {
        int selectIndex = lstHistorie.getSelectionModel().getSelectedIndex();
        if (selectIndex == -1) return;
        txtOutput.setText(lstHistorie.getItems().get(selectIndex));
    }
}
