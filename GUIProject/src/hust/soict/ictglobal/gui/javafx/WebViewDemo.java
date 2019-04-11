package hust.soict.ictglobal.gui.javafx;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class WebViewDemo extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage)
	{
		Button buttonURL = new Button("Load Page https://eclipse.org");
		Button buttonHtmlString = new Button("Load HTML String");
		
		WebView browser = new WebView();
		WebEngine engine = browser.getEngine();
		
		buttonURL.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent event)
					{
						String url = "https://eclipse.org";
						engine.load(url);
					}
			
				});
		
		buttonHtmlString.setOnAction(new EventHandler<ActionEvent>()
				{
					@Override
					public void handle(ActionEvent event)
					{
						String html =  "<html><h1>Hello</h1><h2>Hello</h2></html>";
						engine.loadContent(html);
					}
				});
		
		VBox root = new VBox();	
		root.setPadding(new Insets(10, 10, 10, 10));
		root.setSpacing(20);
		root.getChildren().addAll(buttonURL, buttonHtmlString, browser);
		
		Scene scene = new Scene(root, 400, 400);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Noob");
		primaryStage.show();
	}
}
