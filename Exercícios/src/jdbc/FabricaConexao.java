package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	public static Connection getConexao() {
		
		try {
			Properties prop = getproperties();
			/*método estatico
			final String url = "jdbc:mysql://localhost:3306/curso_java?verifyServerCertificate=false&useSSl=true";
			final String usuario = "root";
			final String senha = "Saude@123";
			*/
			
			//metodo com properties
			final String url = prop.getProperty("banco.url");
			final String usuario = prop.getProperty("banco.usuario");
			final String senha = prop.getProperty("banco.senha");
					
			return DriverManager.getConnection(url, usuario, senha);
		} catch (SQLException | IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	//nunca mandar o propertie para o git, vc pode mandar um modelo, sem os
	//dados de usuario e senha, depois acertar no seu projeto
	private static Properties getproperties() throws IOException {
		Properties prop = new Properties();
		String caminho = "/conexao.properties"; //correto seria ser externo
		prop.load(FabricaConexao.class.getResourceAsStream(caminho));
		return prop;
	}

}
