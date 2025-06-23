module com.tcd.quizzappv1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.tcd.quizzappv1 to javafx.fxml;
    exports com.tcd.quizzappv1;
}
