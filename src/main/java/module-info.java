module com.example.word_4 {
    requires java.sql;
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.word_4 to javafx.fxml;
    exports com.example.word_4;
    exports controllers;
    opens controllers to javafx.fxml;
}