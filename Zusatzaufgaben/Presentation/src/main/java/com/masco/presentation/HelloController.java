package com.masco.presentation;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Spinner;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;


import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public Spinner<Integer> redValue, blueValue, greenValue;

    @FXML
    public Rectangle clrOutput;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        redValue.getValueFactory().setValue(1);
        blueValue.getValueFactory().setValue(1);
        greenValue.getValueFactory().setValue(1);

        redValue.valueProperty().addListener((obs, oldValue, newValue) -> updateColors());
        blueValue.valueProperty().addListener((obs, oldValue, newValue) -> updateColors());
        greenValue.valueProperty().addListener((obs, oldValue, newValue) -> updateColors());

        updateColors();
    }

    public void updateColors() {
        String red = toHex(redValue.getValue());
        String blue = toHex(blueValue.getValue());
        String green = toHex(greenValue.getValue());
        clrOutput.setFill(Color.web("#" + red + green + blue));
    }

    public void updateValues(ActionEvent actionEvent) {
        String red = toHex(redValue.getValue());
        String blue = toHex(blueValue.getValue());
        String green = toHex(greenValue.getValue());
        clrOutput.setFill(Color.web("#" + red + green + blue));
    }

    public String toHex(int value) {
        return String.format("%02X", value);
    }
}