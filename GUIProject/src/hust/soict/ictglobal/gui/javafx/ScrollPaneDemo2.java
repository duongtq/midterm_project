package hust.soict.ictglobal.gui.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class ScrollPaneDemo2 extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		final FlowPane container= new FlowPane();
		
		Button btn1 = new Button("JavaScript");
		btn1.setPrefSize(350, 160);
		
		Button btn2 = new Button("CSS");
		btn2.setPrefSize(260, 220);
		
		ScrollPane scrollPane = new ScrollPane();
		
		container.getChildren().add(btn1);
		container.getChildren().add(btn2);
		
		scrollPane.setContent(container);
		
		scrollPane.setPannable(true);
		
		Scene scene = new Scene(scrollPane, 400, 250);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Scroll Demo With Pannable");
		primaryStage.show();
	}
	
	
}
