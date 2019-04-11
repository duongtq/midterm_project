package hust.soict.ictglobal.gui.javafx;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AccordionDemo extends Application
{	
	public static void main(String[] args)
	{
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Accordion accordion = new Accordion();
		
		TitledPane firstTitledPane = new TitledPane();
		firstTitledPane.setText("Java");
		VBox content1 = new VBox();
		content1.getChildren().add(new Label("Java Swing Tutorial"));
		content1.getChildren().add(new Label("JavaFx Tutorial"));
		content1.getChildren().add(new Label("Java IO Tutorial"));
		firstTitledPane.setContent(content1);
		
		
		TitledPane secondeTitledPane = new TitledPane();
		secondeTitledPane.setText("JavaScript");
		VBox content2 = new VBox();
		content2.getChildren().add(new Label("JavaScript Basic"));
		content2.getChildren().add(new Label("JavaScript ES6"));
		content2.getChildren().add(new Label("jQuery"));
		secondeTitledPane.setContent(content2);
		
		accordion.getPanes().addAll(firstTitledPane, secondeTitledPane);
		
		Scene scene = new Scene(accordion, 500, 500);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Accordion Demo");
		primaryStage.show();	
	}
}
