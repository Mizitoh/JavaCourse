package OO.Composicao;

import java.util.List;
import java.util.ArrayList;

public class Curso {
	
	final String nome;
	final List<Alunos> alunos = new ArrayList<>();
	
	public Curso(String nome) {
		this.nome = nome;
	}
	
	void adicionarAluno(Alunos aluno) {
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}

}
