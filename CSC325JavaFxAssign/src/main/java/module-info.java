module org.example.csc325javafxassign {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc325javafxassign to javafx.fxml;
    exports org.example.csc325javafxassign;
}