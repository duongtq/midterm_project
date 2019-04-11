package hust.soict.ictglobal.gui.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class TextFieldDemo2 extends Application
{

	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage mainStage) throws Exception {
		TextField textField = new TextField("Predator");
		textField.setMinWidth(200);
		
		// Clear
		Button clearButton = new Button("Clear");
		clearButton.setFocusTraversable(false);
		clearButton.setOnAction(new EventHandler<ActionEvent>()
		{
			@Override
			public void handle(ActionEvent event)
			{
				textField.clear();
			}
		});
		
		// Copy
		Button copyButton = new Button("Copy");
		copyButton.setFocusTraversable(false);
		copyButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event)
			{
				textField.copy();
			}
		});
		
		// Paste
		Button pasteButton = new Button("Paste");
		pasteButton.setFocusTraversable(false);
		pasteButton.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				textField.paste();
			}
		});
		
		// Cut
		Button cutButton = new Button("Cut");
		cutButton.setFocusTraversable(false);
		cutButton.setOnAction(new EventHandler<ActionEvent>()
		{
			public void handle(ActionEvent event)
			{
				textField.cut();
			}
		});
		
		// FlowPane
		FlowPane root = new FlowPane();
		root.setPadding(new Insets(15));
		
		root.setHgap(5);
		root.setVgap(5);
		
		root.getChildren().addAll(textField, clearButton, copyButton, cutButton, pasteButton);
		
		Scene scene = new Scene(root, 400, 280);
		
		mainStage.setScene(scene);
		mainStage.setTitle("TextField Demo 2");
		mainStage.show();
		
		// 
	}
}
