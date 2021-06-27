package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

	public static void main(String[] args) throws SQLException {

		Connection conexao = FabricaConexao.getConexao();
		String sql = "SELECT * FROM pessoas WHERE nome LIKE ?;";
		
		System.out.println("digite um filtro de pesquisa:");
		Scanner entrada = new Scanner(System.in);
		
		String filtro = entrada.nextLine();

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%" + filtro + "%"); //1 refere ao primeiro parametro que vamos passar
		ResultSet resultado = stmt.executeQuery();
		
		List<Pessoa> pessoas = new ArrayList<>();
		
		
		while(resultado.next()) {
			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			pessoas.add(new Pessoa(codigo, nome));
		}
		
		for(Pessoa p : pessoas) {
			System.out.println(p.getCodigo() + " -> "+ p.getNome());
		}
		
		//resultset é mais um metdodo do java.sql
		//é o que tenho que aprender e aperfeiçoar no C#
		
		entrada.close();
		stmt.close();
		conexao.close();
	}
}
