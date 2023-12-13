module com.example.petadoption {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires javax.mail;
    requires java.activation;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.desktop;


    opens com.example.petadoption to javafx.fxml;
    exports com.example.petadoption;
}