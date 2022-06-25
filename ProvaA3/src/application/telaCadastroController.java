package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import model.User;
import util.Conexao;
import util.Mensagens;

public class telaCadastroController {
	@FXML
	TextField txtLogin;
	@FXML
	TextField txtSenha;
	@FXML
	TextField txtSenhaConf;
	@FXML
	TextField txtEmail;
	@FXML
	TextField txtCadastroRF;
	@FXML
	CheckBox verifLoja;
	@FXML
	Button botaoCadastro;

	private User userSelecionada = null;

	@FXML
	private void cadastraUser() {
		User u = lerTela();
		String sql = "insert into user(nome, senha, email) values (?,?,?)";

		try {
			Connection conn = Conexao.conectarSQL();
			PreparedStatement ps = conn.prepareStatement(sql);

			ps.setString(1, u.getNome());

			if (txtSenha.getText() == null ? txtSenhaConf.getText() != null
					: !txtSenha.getText().equals(txtSenhaConf.getText())) {
				Mensagens.msgErro("Senha Incorreta", "As duas senhas não conferem.");

				return;

			} else {

				ps.setString(2, u.getSenha());
			}
			ps.setString(3, u.getEmail());

			ps.executeUpdate();
			conn.close();

		} catch (Exception e) {
//			Mensagens.msgErro("Usuário já existente.", "Este nome de usuário já está cadastrado em nosso sistema.");
			System.out.println("Qualquer Erro");
			e.printStackTrace();
		}

	}

	private User lerTela() {
		User u = new User();
		if (userSelecionada != null) {
			u.setId(userSelecionada.getId());
		}
		u.setNome(txtLogin.getText());
		u.setSenha(txtSenha.getText());
		u.setEmail(txtEmail.getText());

		return u;

	}

}
