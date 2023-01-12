module com.hadouin.javafxmvctemplate {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.hadouin.javafxmvctemplate to javafx.fxml;
    exports com.hadouin.javafxmvctemplate;
}