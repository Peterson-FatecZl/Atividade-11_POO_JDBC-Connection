package persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao {

	private Connection c;

	public GenericDao() {
		super();
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost"; // IP da máquina do servidor
		String dbName = "first_example"; // Nome do DataBase
		String user = "geral"; // Nome do Usuario MySQL
		String senha = "123456789"; // Senha do usuario MySQL
		

//		*****************************************
//		Time Zone Necessário para Funcionamento da conexão com o MySQL
		String systemTimeZone = java.time.ZoneId.systemDefault().getId();
		System.out.println(systemTimeZone);
//		*****************************************

		Class.forName("com.mysql.cj.jdbc.Driver"); // Referência da classe da lib de conexão
		// Configuração da String de Conexão com MySQL
		c = DriverManager.getConnection(
			    String.format("jdbc:mysql://%s:3306/%s?serverTimezone=America/Sao_Paulo", hostName, dbName), user, senha
			);

		return c;
	}

}
