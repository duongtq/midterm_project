package hust.soict.ictglobal.gui.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MenuDemo extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// create MenuBar
		MenuBar menuBar = new MenuBar();
		
		// create menus
		Menu fileMenu = new Menu("File");
		Menu editMenu = new Menu("Edit");
		Menu helpMenu = new Menu("Help");
		
		// create menu item
		MenuItem newItem = new MenuItem("New");
		MenuItem openItem = new MenuItem("Open");
		MenuItem exitItem = new MenuItem("Exit");
		
		MenuItem copyItem = new MenuItem("Copy");
		MenuItem pasteItem = new MenuItem("Paste");
		
		// add menu items to menus
		fileMenu.getItems().addAll(newItem, openItem, exitItem);
		editMenu.getItems().addAll(copyItem, pasteItem);
		
		// add menus to MenuBar
		menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu);
		
		BorderPane root = new BorderPane();
		root.setTop(menuBar);
		Scene scene = new Scene(root, 400, 280);
		
		primaryStage.setScene(scene);
		primaryStage.setTitle("Nooooob");
		primaryStage.show();
	}

	public static void main(String[] args)
	{
		Application.launch(args);
	}
}
