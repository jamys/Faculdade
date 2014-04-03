public class Funcoes {

	public void InsercaoPilhaEFila(String Valor, Descritor Head) {
		Lista novo = new Lista();
		Lista Aux;
		if (Head.qtde == 0) {
			novo.Valor = Valor;
			Head.ultimo = novo;
			Head.primeiro = novo;
			Head.qtde++;

		} else {
			Aux = Head.ultimo;
			novo.Valor = Valor;
			Aux.prox = novo;
			novo.ant = Aux;
			Head.ultimo = novo;
			Head.qtde++;
		}

	}

	public void RemocaoPilha(Descritor Head) {
		Lista aux;
		Lista aux2;
		if (Head.qtde == 0) {
			System.out.println("\n\n");
			System.out.println("Lista Vazia");
			System.out.println("\n\n");
		} else {
			aux = Head.ultimo;
			aux2 = aux.ant;
			aux2.prox = null;
			Head.ultimo = aux2;
			Head.qtde--;
		}

	}

	public void RemocaoFila(Descritor Head) {

		if (Head.qtde == 0) {
			System.out.println("\n\n");
			System.out.println("Lista Vazia");
			System.out.println("\n\n");
		} else {
			Head.primeiro = Head.primeiro.prox;
			Head.qtde--;
		}

	}

	public void impressao(Lista Head) {

		if (Head.prox == null) {
			System.out.printf("|%s|", Head.Valor);
		} else {

			System.out.printf("|%s|", Head.Valor);
			impressao(Head.prox);

		}

	}

}
