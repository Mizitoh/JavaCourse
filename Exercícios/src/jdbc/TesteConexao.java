package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	
	public static void main(String[] args) throws SQLException {
		
		//precisa instalar o driver do mysql
		final String url = "jdbc:mysql://localhost:3306/bancoteste?verifyServerCertificate=false&useSSl=true";
		final String usuario = "root";
		final String senha = "Saude@123";
		
		//vamos sempre importar as interfaces de java.sql
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetuada com sucesso!");
		conexao.close();
	}

}
