module com.masco.presentation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.masco.presentation to javafx.fxml;
    exports com.masco.presentation;
}