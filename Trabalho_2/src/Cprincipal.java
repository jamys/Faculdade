import java.util.Scanner;

public class Cprincipal {
	static Scanner scan = new Scanner(System.in);
	static Funcoes objFunc = new Funcoes();
	static Descritor Cabecalho = new Descritor();

	public static void main(String[] args) {

		int op = 0;

		do {
			System.out.println("\n\n");
			System.out.println("1 - Pilha");
			System.out.println("2 - Fila");
			System.out.println("3 - Sair");
			System.out.println("Escolha uma opção: ");
			op = Integer.parseInt(scan.nextLine());
			switch (op) {
			case 1:
				Pilha();
				break;

			case 2:
				Fila();
				break;

			case 3:

				break;

			default:
				System.out.println("opção invalida");
				break;
			}

		} while (op != 3);
		System.out.println("Sistema Finalizado");
	}

	public static void Pilha() {
		String Valor;
		System.out
				.println("Digite um valor para inserir ou Espaço em branco para remover");

		Valor = scan.nextLine();

		if (Valor.equals(" ")) {

			objFunc.RemocaoPilha(Cabecalho);
			if (Cabecalho.qtde != 0)
				objFunc.impressao(Cabecalho.primeiro);

		} else {

			objFunc.InsercaoPilhaEFila(Valor, Cabecalho);
			objFunc.impressao(Cabecalho.primeiro);
		}

	}

	public static void Fila() {
		String Valor;
		System.out
				.println("Digite um valor para inserir ou Espaço em branco para remover");

		Valor = scan.nextLine();

		if (Valor.equals(" ")) {

			objFunc.RemocaoFila(Cabecalho);
			if (Cabecalho.qtde != 0)
				objFunc.impressao(Cabecalho.primeiro);

		} else {

			objFunc.InsercaoPilhaEFila(Valor, Cabecalho);
			objFunc.impressao(Cabecalho.primeiro);
		}

	}

}
