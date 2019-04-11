package hust.soict.ictglobal.gui.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AnchorPaneDemo extends Application
{
	public static void main(String args[])
	{
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception
	{
		AnchorPane root = new AnchorPane();
		
		Button btn1 = new Button("(B1) Top + Left + Right");
		Button btn2 = new Button("(B2) Top + Left + Right");
		Button btn3 = new Button("(B3) Top + Left + Right");
		Button btn4 = new Button("(B4) Top + Left + Right + Bottom");
		
		// (B1) Anchor to Top Left Right
		AnchorPane.setTopAnchor(btn1, 40.00);
		AnchorPane.setLeftAnchor(btn1, 50.00);
		AnchorPane.setRightAnchor(btn1, 60.00);
		
		// (B2) Anchor to Top Left Right
		AnchorPane.setTopAnchor(btn2, 80.00);
		AnchorPane.setLeftAnchor(btn2, 90.00);
		AnchorPane.setRightAnchor(btn2, 100.00);
		
		AnchorPane.setTopAnchor(btn3, 120.00);
		AnchorPane.setLeftAnchor(btn3, 150.00);
		AnchorPane.setRightAnchor(btn3, 180.00);
		
		AnchorPane.setTopAnchor(btn4, 200.00);
		AnchorPane.setLeftAnchor(btn4, 240.00);
		AnchorPane.setRightAnchor(btn4, 300.00);
		AnchorPane.setBottomAnchor(btn4, 320.00);
		
		root.getChildren().addAll(btn1, btn2, btn3, btn4);
		Scene scene = new Scene(root, 400, 400);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("AnchorPane Demo");
		primaryStage.show();
	}
}
