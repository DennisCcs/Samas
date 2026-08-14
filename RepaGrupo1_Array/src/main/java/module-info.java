module pe.edu.upeu.repagrupo1_array {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens pe.edu.upeu.repagrupo1_array to javafx.fxml;
    exports pe.edu.upeu.repagrupo1_array;
}