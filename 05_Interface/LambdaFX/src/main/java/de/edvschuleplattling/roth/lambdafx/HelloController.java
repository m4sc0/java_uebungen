package de.edvschuleplattling.roth.lambdafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button btnPressMe;
    @FXML
    private TextField txtPress;
    @FXML
    private Button btnPressMeToo;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        PressMeHandler pmh = new PressMeHandler();
        System.out.println("i1");
        btnPressMe.setOnAction(pmh);
        System.out.println("i2");
        btnPressMeToo.setOnAction(pmh);
        System.out.println("i3");
    }

    class PressMeHandler implements EventHandler<ActionEvent>{

        int zaehler = 0;
        @Override
        public void handle(ActionEvent actionEvent) {
            System.out.println("h1");
            zaehler++;
            txtPress.setText(zaehler + " mal gedrückt");
            System.out.println("h2");
        }
    }



}