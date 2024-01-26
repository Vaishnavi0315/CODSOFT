module com.example.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.com.vsb.javafx to javafx.fxml;
    exports com.example.com.vsb.javafx;
}