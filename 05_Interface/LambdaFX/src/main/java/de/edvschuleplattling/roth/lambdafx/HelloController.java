package de.edvschuleplattling.roth.lambdafx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Button btnPressMe;
    @FXML
    private TextField txtPress;
    @FXML
    private Button btnPressMeToo;
    @FXML
    private FlowPane flowPane;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        PressMeHandler pmh = new PressMeHandler();
        System.out.println("i1");
        btnPressMe.setOnAction(actionEvent -> txtPress.setText(" mal gedrueckt"));
        System.out.println("i2");
        btnPressMeToo.setOnAction(pmh);
        System.out.println("i3");

        for (int i = 0; i < 10; i++) {
            Button btn = new Button(i + "");
            btn.setOnAction(actionEvent -> txtPress.setText(btn.getText()));
            flowPane.getChildren().add(btn);
        }
    }

    class PressMeHandler implements EventHandler<ActionEvent> {

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