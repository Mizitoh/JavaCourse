package OO.Composicao;

import java.util.ArrayList;
import java.util.List;

public class Alunos {
	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	// dessa forma o conteudo pode ser variavel, mas a lista n�o
	// ela vai sempre apontar para o mesmo esndere�o de memoria
		
	
	public Alunos(String nome) {
		this.nome = nome;
	}



	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString() {
		return nome;
	}
}
