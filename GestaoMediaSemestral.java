import java.util.Scanner;

public class GestaoMediaSemestral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		double prova = 0, projeto = 0, exercicios = 0, notaAluno = 0, mediaAluno = 0, mediaGeral = 0, maiorNota = 0,
				menorNota = 1000;
		int pesoProva = 5, pesoProjeto = 3, pesoExercicio = 2, sala, qtdAprovados = 0, qtdReprovados = 0, qtdAF = 0;

		for (sala = 0; sala < 3; sala++) {
			notaAluno = 0;
			do {
				System.out.println("Digite a nota da prova: ");
				prova = sn.nextDouble();
			} while (prova < 0 || prova > 34);
			{
				notaAluno = notaAluno + prova;
			}
			do {
				System.out.println("Digite a nota da projeto: ");
				projeto = sn.nextDouble();
			} while (projeto < 0 || projeto > 33);
			{
				notaAluno = notaAluno + projeto;
			}
			do {
				System.out.println("Digite a nota da exercicio: ");
				exercicios = sn.nextDouble();
			} while (exercicios < 0 || exercicios > 33);
			{
				notaAluno = notaAluno + exercicios;
			}

			mediaAluno = notaAluno / (pesoProva + pesoProjeto + pesoExercicio);
			mediaGeral = mediaGeral + notaAluno;
			System.out.println("Essa é a nota do aluno" + mediaAluno);

			// Verificação da se aluno foi aprovado, reprovado ou avaliação final
			if (mediaAluno >= 8) {
				System.out.println("Este aluno foi Aprovado!");
				qtdAprovados++;
			} else if (mediaAluno < 5) {
				System.out.println("Este aluno foi Reprovado!");
				qtdReprovados++;
			} else {
				System.out.println("Este aluno deverá fazer a Avaliação Final!");
				qtdAF++;
			}
			// Verificação maior nota da sala
			if (prova > projeto && prova > exercicios && prova > maiorNota) {
				maiorNota = prova;
			} else if (projeto > prova && projeto > exercicios && projeto > maiorNota) {
				maiorNota = projeto;
			} else if (exercicios > prova && exercicios > projeto && exercicios > maiorNota) {
				maiorNota = exercicios;
			}

			// Verificação menor nota da sala
			if (prova < projeto && prova < exercicios && prova < menorNota) {
				menorNota = prova;
			} else if (projeto < prova && projeto < exercicios && projeto < menorNota) {
				menorNota = projeto;
			} else if (exercicios < prova && exercicios < projeto && exercicios < menorNota) {
				menorNota = exercicios;
			}
		}
		// Cálculo média geral da sala
		mediaGeral = mediaGeral / sala;

		// Impressão de resultados
		System.out.println("A média geral da sala é: " + mediaGeral);
		System.out.println("A quantidade de alunos Aprovados foi: " + qtdAprovados);
		System.out.println("A quantidade de alunos Reprovados foi: " + qtdReprovados);
		System.out.println("A quantidade de alunos Na Avaliação Final foi: " + qtdAF);
		System.out.println("A maior nota foi: " + maiorNota);
		System.out.println("A menor nota foi: " + menorNota);
	}
}
