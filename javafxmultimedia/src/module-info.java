module javafxmultimedia {
	requires javafx.controls;
	requires javafx.graphics;
	requires javafx.media;
	
	opens javafxmultimedia to javafx.graphics, javafx.fxml;
}
