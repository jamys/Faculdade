public class Metodos {
	Cadastro objCadastro = new Cadastro();

	public void inserirAluno(String Curso, String Nome, String Sexo, float N1,
			float N2) {
		for (int i = 0; i < objCadastro.Nome.length; i++) {
			if (objCadastro.Nota1[i] == 0) {
				objCadastro.Nome[i] = Nome;
				objCadastro.Curso[i] = Curso;
				objCadastro.Sexo[i] = Sexo;
				objCadastro.Nota1[i] = N1;
				objCadastro.Nota2[i] = N2;
				break;
			}
		}
	}

	public boolean VerificaNome(String Nome, String[] Vetor) {
		boolean Existe = false;
		for (int i = 0; i < Vetor.length; i++) {
			if (Nome.equals(Vetor[i])) {
				Existe = true;
				break;
			}
		}
		return Existe;
	}

	public void CalculoSexos() {
		float PM;
		float PF;
		int m = 0;
		int f = 0;
		int TotalDeAlunos;

		for (int i = 0; i < objCadastro.Nota1.length; i++) {
			if ("m".equals(objCadastro.Sexo[i])
					|| "M".equals(objCadastro.Sexo[i]))
				m++;
			if ("f".equals(objCadastro.Sexo[i])
					|| "F".equals(objCadastro.Sexo[i]))
				f++;
		}
		TotalDeAlunos = m + f;
		PM = ((float) m / (float) TotalDeAlunos) * 100;
		PF = ((float) f / (float) TotalDeAlunos) * 100;
		System.out.println("Alunos do sexo masculino: " + PM + "%");
		System.out.println("Alunos do sexo feminino: " + PF + "%");

	}

	

	public void ImprimirMediasPorAluno() {

		System.out.println("Medias Administração");
		for (int i = 0; i < objCadastro.Nota1.length; i++) {
			if ("ADM".equals(objCadastro.Curso[i]))
				System.out.println("Aluno: " + objCadastro.Nome[i] + " Media: "
						+ (objCadastro.Nota1[i] + objCadastro.Nota2[i]) / 2);
		}
		System.out.println("Sistemas de Infomação");
		for (int i = 0; i < objCadastro.Nota1.length; i++) {
			if ("SI".equals(objCadastro.Curso[i]))
				System.out.println("Aluno: " + objCadastro.Nome[i] + " Media: "
						+ (objCadastro.Nota1[i] + objCadastro.Nota2[i]) / 2);
		}
	}

	public void CalculaMaiorMedia() {
		int PosMaiorMedia = 0;
		for (int i = 0; i < objCadastro.Nome.length; i++) {
			if ((objCadastro.Nota1[PosMaiorMedia] + objCadastro.Nota2[PosMaiorMedia]) / 2 > (objCadastro.Nota1[i] + objCadastro.Nota2[i]) / 2) {
				PosMaiorMedia = i;
			}
			System.out.println("Aluno com maior media: "
					+ objCadastro.Nome[PosMaiorMedia] + " Media: "
					+ (objCadastro.Nota1[i] + objCadastro.Nota2[i]) / 2);
		}
	}

	public void MediasPorCurso() {
		float MediaSI = 0;
		float MediaADM = 0;
		int si = 0;
		int adm = 0;
		for (int i = 0; i < objCadastro.Curso.length; i++) {
			if ("SI".equals(objCadastro.Curso[i])) {
				MediaSI = MediaSI
						+ ((objCadastro.Nota1[i] + objCadastro.Nota2[i]) / 2);
				si++;
			}
			if ("ADM".equals(objCadastro.Curso[i])) {
				MediaADM = MediaADM
						+ ((objCadastro.Nota1[i] + objCadastro.Nota2[i]) / 2);
				adm++;
			}

		}

		MediaADM = MediaADM / (float) adm;
		MediaSI = MediaSI / (float) si;

		System.out.println("Media Administração: " + MediaADM
				+ "\nMedia Sistemas de Infomação: " + MediaSI);

	}

}
