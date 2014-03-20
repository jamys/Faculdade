import java.util.Scanner;

public class Exercicio {

	// 1 - implemente um algorimo para calcular a media dos valores da LE
	// 2 - implemente um algoritimo para encontrar o maior elemento
	// 3 - implemente um algoritimo para remover o primeiro elemento da LE, caso
	// o usuario solicitar remova o ultimo
	// 4 - implemente um algoritimo para inserir um elemento no inicio da LE,
	// caso o usuario solicitar insira no final
	// obs: implemente procedures / funcions

	// variaveis Metodo media
	static float Soma = 0;
	static float Divisor = 0;
	static float Media;
	
	// variaveis metodo Calcula maior
	static int Maior;

	// Variaveis metodo 
	static int Menu;
	static NO Anterior;
	
	// variaveis metodo inserir no inicio
	
	
	public static void main(String[] args) {
        
		NO PrimeiroNO = new NO();
		PrimeiroNO.valor = 1;
		for (int i = 2; i < 11; i++) {
			InserirNo(i, PrimeiroNO);
		}
	//	Imprime(PrimeiroNO);
	//	CalculaMedia1(PrimeiroNO);
	//	CalculaMedia2(Soma, Divisor);

	//	MaiorDaLista(PrimeiroNO);
	//	MaiorDaLista2();
		
	//RemocaoMenu(PrimeiroNO);	
	MenuInserir(PrimeiroNO);
	}

	public static void InserirNo(int Valor, NO Raiz) {
		NO ultimoNo = ultimoNo(Raiz);
		NO NovoNo = new NO();
		NovoNo.valor = Valor;
		ultimoNo.Prox = NovoNo;
	}

	public static NO ultimoNo(NO Raiz) {
		NO ultimoNo;
		if (Raiz.Prox != null) {
			ultimoNo = ultimoNo(Raiz.Prox);
		} else {

			ultimoNo = Raiz;

		}
		return ultimoNo;
	}

	public static void CalculaMedia1(NO valor) {
		Soma = Soma + valor.valor;
		Divisor++;

		if (valor.Prox != null) {
			CalculaMedia1(valor.Prox);
		}

	}

	public static void CalculaMedia2(float Soma, float Divisor) {

		Media = Soma / Divisor;
		System.out.println("Media = " + Media);

	}

	public static void Imprime(NO Raiz) {
		if (Raiz.Prox != null) {
			System.out.println("valor: " + Raiz.valor);
			Imprime(Raiz.Prox);
		} else
			System.out.println("Valor: " + Raiz.valor);
	}

	public static void MaiorDaLista(NO valor) {
		if (valor.valor > Maior) {
			Maior = valor.valor;
		}
		if (valor.Prox != null) {
			MaiorDaLista(valor.Prox);

		}
	}

	
	public static void MaiorDaLista2() {
		System.out.println("Maior valor da lista: "+Maior);

		}
	
	public static void RemocaoMenu(NO primeiroNo){
 
		Scanner scan = new Scanner(System.in);
		System.out.println("Escolha uma opção:");
		System.out.println("1 - Remover do inicio");
		System.out.println("2 - Remover do final");
		Menu = scan.nextInt();
		if(Menu == 1){
			primeiroNo = RemoveNoInicio(primeiroNo);
			Imprime(primeiroNo);
		}
		
		if(Menu == 2){
			RemoveNoFinal(primeiroNo);
			Imprime(primeiroNo);
		}
	}

	
	public static NO RemoveNoInicio(NO primeiroNo){
		return primeiroNo.Prox;
	}
	
	public  static void RemoveNoFinal(NO valor) {
	  
		if(valor.Prox.Prox == null){
			valor.Prox = null;
		}
		
		if(valor.Prox != null){
			RemoveNoFinal(valor.Prox);
		}
		
		//  NO Anterior = null;
	   // NO no = valor;
	   // while(no.Prox != null){
	   // 	Anterior = no;
	   // 	no = no.Prox;
	   // }
	    //Anterior.Prox = null;

		
		
	}

public static void MenuInserir(NO no){
	Scanner scan = new Scanner(System.in);
	int op;
	System.out.println("Escolha uma opção");
	System.out.println("1 - inserir no inicio");
	System.out.println("2 - inserir no final");
	op = scan.nextInt();
	if(op == 1){
		no = NovoPrimeiro(no);
		Imprime(no);
	}
	
	if(op == 2){
		NovoUltimo(no);
		Imprime(no);
	}
	
}

public static NO NovoPrimeiro(NO antigoPrimeiro){
	NO novoPrimeiro = new NO();
	novoPrimeiro.Prox = antigoPrimeiro;
	return novoPrimeiro;
	
}

public static void NovoUltimo(NO valor){
	NO novoNO = new NO();
	NO ultimoNO = ultimoNo(valor);
	ultimoNO.Prox = novoNO;
}

}
