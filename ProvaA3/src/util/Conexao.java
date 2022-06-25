package util;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

	public static Connection conectarSQL() {

		Connection conn = null;

		try {
			File arquivo = new File("lojaDB/user.db");
			if (arquivo.exists()) {
				Class.forName("org.sqlite.JDBC");
				conn = DriverManager.getConnection("jdbc:sqlite:lojaDB/user.db");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return conn;

	}

}
