package hust.soict.ictglobal.gui.javafx;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.MotionBlur;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class GroupEffectDemo extends Application
{
	public static void main(String[] args)
	{
		Application.launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception
	{
		Group root = new Group();
		
		Rectangle rect = new Rectangle();
		rect.setX(10);
		rect.setY(30);
		rect.setWidth(160);
		rect.setHeight(80);
		rect.setFill(Color.BLUE);
		
		Text txt = new Text();
		txt.setText("Motion Blur!");
		txt.setFill(Color.RED);
		txt.setFont(Font.font(null, FontWeight.BOLD, 36));
		txt.setX(25);
		txt.setY(150);
		
		Button myButton = new Button("Click me");
		
		root.setCache(true);
		
		// make effect
		MotionBlur motionBlur = new MotionBlur();
		
		// set effect for Group
		root.setEffect(motionBlur);
		// translate X 50px
		root.setTranslateX(50);
		
		// Add all components to Group
		root.getChildren().addAll(rect, txt, myButton);
		
		Scene scene = new Scene(root, 500, 500);
		stage.setScene(scene);
		stage.setTitle("Group Effect Demo");
		stage.show();
	}

}
