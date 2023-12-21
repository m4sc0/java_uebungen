package de.edvschuleplattling.roth.fxvererbung;

import javafx.scene.control.TextField;

public class MyTextField extends TextField {
    public MyTextField() {
        super();
        this.setText("ABC");
        this.setStyle("-fx-background-color: #2d2d2d;");
        this.setStyle("-fx-text-fill: white;");
    }
}
