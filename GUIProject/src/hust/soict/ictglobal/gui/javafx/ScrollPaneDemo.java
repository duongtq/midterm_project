package hust.soict.ictglobal.gui.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;
import javafx.stage.Stage;

public class ScrollPaneDemo extends Application
{
	public static void main(String args[])
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		ScrollPane pane = new ScrollPane();
		Button btn1 = new Button("JavaScript");
		btn1.setPrefSize(400, 200);
		
		pane.setContent(btn1);
		
		pane.setVbarPolicy(ScrollBarPolicy.ALWAYS);
		
		pane.setHbarPolicy(ScrollBarPolicy.AS_NEEDED);
		
		Scene scene = new Scene(pane, 400, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Scroll Pane Demo");
		primaryStage.show();
	}
	
}
