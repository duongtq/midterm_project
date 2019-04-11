package hust.soict.ictglobal.gui.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		TextField tf = new TextField("Tran");
		tf.setMinWidth(120);
		
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(10));
		
		root.getChildren().add(tf);
		
		Scene newScene = new Scene(root, 600, 400);
		primaryStage.setScene(newScene);
		primaryStage.setTitle("TextField Demo");
		primaryStage.show();
	}
}
