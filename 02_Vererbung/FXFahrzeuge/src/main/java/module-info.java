module com.masco.fxfahrzeuge {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.masco.fxfahrzeuge to javafx.fxml;
    exports com.masco.fxfahrzeuge;
}