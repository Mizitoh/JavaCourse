package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
		public static void main(String[] args) throws SQLException{
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Informe o nome: ");
			String nome = entrada.nextLine();
			
			/*
			String sql = "INSERT INTO pessoas (nome)"
					+ "VALUES ('" + nome + "');";
			não vamos fazer assim para evitar um ataque sql onde o usuario
			poderia digitar um codigo sql e ferrar com a tabela
			
			*/
			
			String sql = "INSERT INTO pessoas (nome)"
					+ "VALUES (?);"; // passaremos o nome como parametro usando preparestatement em vez do statement
			
			Connection conexao = FabricaConexao.getConexao();
			
			//esse metodo trata a entrada como string e nao como codigo sql
			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, nome); //string para dados varchar, 
									//demais os sets devem ser do tipo referente ex
									// id tem que ser int
			
			stmt.execute();
			
			entrada.close();
		}
}
