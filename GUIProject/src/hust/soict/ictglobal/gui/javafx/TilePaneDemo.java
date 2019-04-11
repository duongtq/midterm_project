package hust.soict.ictglobal.gui.javafx;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class TilePaneDemo extends Application
{
	public static void main(String[] args)
	{
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception
	{
		TilePane root = new TilePane();
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setHgap(20);
		root.setVgap(30);
		
		Button button1 = new Button("Java");
		root.getChildren().add(button1);
		
		Button button2 = new Button("C/C++");
		root.getChildren().add(button2);
		
		Button button3 = new Button("C#");
		root.getChildren().add(button3);
		
		Button button4 = new Button("Python");
		root.getChildren().add(button4);
		
		Button button5 = new Button("JavaScript");
		root.getChildren().add(button5);
		
		Scene scene = new Scene(root, 400, 500);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Doi Tao");
		primaryStage.show();
	}
}
