package hust.soict.ictglobal.gui.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class LineDemo extends Application
{
	@Override
	public void start(Stage stage) throws Exception
	{
		Line oxLine1 = new Line(300, 100, 400, 0);
		
		// stroke width
		oxLine1.setStrokeWidth(5);
		oxLine1.setFill(Color.BLUE);
		
		Line oyLine1 = new Line(30, 0, 0, 100);
		oyLine1.setStrokeWidth(5);
		oyLine1.setFill(Color.RED);
		
		AnchorPane root = new AnchorPane();
		root.setPadding(new Insets(15));
		root.getChildren().addAll(oxLine1, oyLine1);
		
		Scene scene = new Scene(root, 500, 500);
		
		stage.setScene(scene);
		stage.setTitle("Line Demo");
		stage.show();
		
	}
	
	public static void main(String[] args) {
		Application.launch(args);

	}

}
