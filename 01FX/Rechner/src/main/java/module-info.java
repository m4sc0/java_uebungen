module com.masco.rechner {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.masco.rechner to javafx.fxml;
    exports com.masco.rechner;
}