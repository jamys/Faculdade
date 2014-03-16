import java.util.Scanner;

public class Cadastro {
	static String[] Nome = new String[10];
	static String[] Sexo = new String[Nome.length];
	static String[] Curso = new String[Nome.length];
	static float[] Nota1 = new float[Nome.length];
	static float[] Nota2 = new float[Nome.length];

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Metodos objMetodos = new Metodos();
		int op = 0;
		while (op != 3) {
			System.out.println("");
			System.out.println("");
			System.out.println("1 - Cadastrar uma aluno");
			System.out.println("2 - Outros");
			System.out.println("3 - Sair");
			op = scan.nextInt();
			switch (op) {
			case 1:
				CadastroAlunos();
				break;

			case 2:
				System.out.println("1 - Medias por aluno");
				System.out.println("2 - Maior media");
				System.out.println("3 - Media por curso");
				System.out.println("4 - Percentual de alunos por sexo");
				System.out.println("5 - voltar ao menu anterior");
				int op3 = scan.nextInt();
				switch (op3) {
				case 1:
					objMetodos.ImprimirMediasPorAluno();
					break;
				case 2:
					objMetodos.CalculaMaiorMedia();
					break;
				case 3:
					objMetodos.MediasPorCurso();
					break;
				case 4:
					objMetodos.CalculoSexos();
					break;
				case 5:
					break;
				default:
					System.out.println("Opção invalida");
					break;
				}
				break;

			case 3:
				break;

			default:
				System.out.println("Opção invalida");
				break;
			}
		}
	}

	public static void CadastroAlunos() {
		Scanner scan = new Scanner(System.in);
		Metodos objMetodos = new Metodos();
		int op = 0;
		String nome;
		String sexo;
		String curso = null;
		float n1;
		float n2;
		while (op != 2) {
			System.out.println("Deseja Cadastrar um aluno?");
			System.out.println("1 - Sim");
			System.out.println("2 - n�o");
			op = scan.nextInt();
			switch (op) {
			case 1:
				System.out.println("Selecione o curso:");
				System.out.println("1 - Administração");
				System.out.println("2 - Sistemas de informação");
				int opMenu = scan.nextInt();
				if (opMenu > 2 || opMenu < 1)
					System.out.println("Opção invalida");
				if (opMenu == 1)
					curso = "ADM";
				if (opMenu == 2)
					curso = "SI";
				System.out.println("Digite um nome: ");
				nome = scan.next();
				if (!objMetodos.VerificaNome(nome, Nome)) {
					System.out.println("Digite o sexo do aluno (M ou F)");
					sexo = scan.next();
					System.out.println("Digite a nota 1: ");
					n1 = scan.nextFloat();
					System.out.println("Digite a nota 2: ");
					n2 = scan.nextFloat();
					objMetodos.inserirAluno(curso, nome, sexo, n1, n2);
				} else {
					System.out.println("Esse nome ja existe");
				}

				break;

			default:
				break;
			}
		}
	}

}