package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			BorderPane root = (BorderPane) FXMLLoader.load(getClass().getResource("Principal.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Loja de Jogos");
			primaryStage.getIcons().add(new Image("Images/logo.png"));
			primaryStage.setMaximized(true);
			primaryStage.show();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void Outfit() {

//		Outfit = Font
	}

	public static void main(String[] args) {
		launch(args);
	}
}
