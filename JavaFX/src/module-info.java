module JavaFX {
	requires javafx.controls;
	requires javafx.fxml;
	requires org.controlsfx.controls;
	
	opens Basic;
	opens Layout;
	opens fxml;
	opens Calculator;
}