module de.edvschuleplattling.roth.fxvererbung {
    requires javafx.controls;
    requires javafx.fxml;


    opens de.edvschuleplattling.roth.fxvererbung to javafx.fxml;
    exports de.edvschuleplattling.roth.fxvererbung;
}