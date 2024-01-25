module de.edvschuleplattling.roth.lambdafx {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens de.edvschuleplattling.roth.lambdafx to javafx.fxml;
    exports de.edvschuleplattling.roth.lambdafx;
}