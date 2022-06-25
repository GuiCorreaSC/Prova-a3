package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class PrincipalController {
	@FXML
	private BorderPane bp;
	@FXML
	private AnchorPane ap;

	@FXML
	private void telaInicial(ActionEvent event) {
		bp.setCenter(bp);

	}

	@FXML
	private void mudarCadastro(ActionEvent event) {
		loadPage("telaCadastro");

	}

	@FXML
	private void mudarLogin(ActionEvent event) {
		loadPage("telaLogin");

	}



	private void loadPage(String page) {
		Parent root = null;
		try {
			root = FXMLLoader.load(getClass().getResource(page + ".fxml"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		bp.setCenter(root);
	}

}
