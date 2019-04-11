package hust.soict.ictglobal.gui.javafx;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class TitledPaneDemo extends Application
{
	
	public static void main(String[] args) 
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception 
	{
		TitledPane titledPane = new TitledPane();
		
		titledPane.setText("Java");
		
		VBox contentBox = new VBox();
		contentBox.getChildren().add(new Label("Basic"));
		contentBox.getChildren().add(new Label("OOP"));
		contentBox.getChildren().add(new Label("Thread"));
		
		titledPane.setContent(contentBox);
		
		VBox root = new VBox();
		root.setPadding(new Insets(5));
		root.getChildren().add(titledPane);
		
		Scene scene = new Scene(root, 250, 200);
		 
		stage.setTitle("TitledPane (o7planning.org)");
		stage.setScene(scene);
		stage.show();
	}

}
