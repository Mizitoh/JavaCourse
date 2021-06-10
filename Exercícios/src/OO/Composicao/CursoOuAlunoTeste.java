package OO.Composicao;


public class CursoOuAlunoTeste {
	public static void main(String[] args) {
		
		Alunos aluno1 = new Alunos("João");
		Alunos aluno2 = new Alunos("Maria");
		Alunos aluno3 = new Alunos("Pedro");
		
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web Completo");
		Curso curso3 = new Curso("Web 2023");
		
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Alunos aluno: curso3.alunos) {
			System.out.println(curso3.nome);
			System.out.println(aluno.nome);
			System.out.println();
		}
		
		for(Curso cursos : aluno2.cursos) {
			System.out.println(aluno2.nome);
			System.out.println(cursos.nome);
		}
		
		System.out.println();
		System.out.println(aluno1.cursos.get(0).alunos);
		// pegou aluno, curso do aluno e depois todos os alunos do curso
		// curso 0 é o primeiro curso adicionado
		
		
		
	}

}
