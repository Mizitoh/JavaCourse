package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {
	
public static void main(String[] args) throws SQLException {
		
		//precisa instalar o driver do mysql
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSl=true";
		final String usuario = "root";
		final String senha = "Saude@123";
		
		//vamos sempre importar as interfaces de java.sql
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		Statement stmt = conexao.createStatement();
		stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java"); //todas as strings sql serão em caixa alta só pra diferencias
		
		conexao.close();
	}

}
