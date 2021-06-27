package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class DesafioUpdate {
	
	public static void main(String[] args) throws SQLException {
		
		Connection conexao = FabricaConexao.getConexao();
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o codigo");
		int codigo = entrada.nextInt();
		
		String sql = "select * from pessoas where codigo = ?";
		String update = "update pessoas set nome = ? where codigo = ?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		ResultSet resultado = stmt.executeQuery();
		
		if(resultado.next()) {
			Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2)); 
			// os numeros dos gets são as colunas do banco
			System.out.println("o nome do codigo digitado é: " + p.getNome());
			entrada.nextLine();
			System.out.println("\n informe o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close(); //fechamos o statement passado e reutilizamos a variavel
			
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("pessoa alterada com sucesso");
		} else {
			System.out.println("pessoa não encontrada");
		}
		
		
		entrada.close();
		conexao.close();
		stmt.close();
	}

}
