package Proxy;

public class UniversidadeProxy extends Universidade {

	public String login;

	public UniversidadeProxy(String login) {
		this.login = login;
	}

	@Override
	public String getNomeInstituicao() {
		if (verificarLogin()) {
			return super.getNomeInstituicao();
		}
		return "Institui��o inv�lida";
	}

	@Override
	public String getNomeCurso() {
		if (verificarLogin()) {
			return super.getNomeCurso();
		}
		return "Nome Inv�lido";
	}

	private boolean verificarLogin() {
		return login == "correto";
	}
}
