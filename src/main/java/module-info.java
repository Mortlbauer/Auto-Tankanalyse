module com.example.tankanalyse {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tankanalyse to javafx.fxml;
    exports com.example.tankanalyse;
}