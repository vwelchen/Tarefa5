package Proxy;

public class PrincipalProxy {

	public static void main(String[] args) {
		
		System.out.println("O Proxy fornece um substituto ou um espa�o reservado para outro objeto.\r\n"
				+ "Pode controlar o acesso ao objeto original, permitindo que voc� execute algo antes\r\n"
				+ "ou depois que a solicita��o chega ao objeto original. O proxy fica no meio do caminho\r\n"
				+ "entre o chamado do objeto cliente. Caso a aplica��o venha a fazer uma requisi��o\r\n"
				+ "ao banco de dados entre o cliente e o banco teremos um proxy, onde ser� uma �c�pia�\r\n"
				+ "do objeto real. Ali poderemos executar diversas l�gicas, como logs, autentica��o,\r\n"
				+ "cache entre outros.\n");
		
		Universidade universidade = new UniversidadeProxy("errado");
		System.out.println("Login Incorreto");
		System.out.println(universidade.getNomeInstituicao());
		System.out.println(universidade.getNomeCurso());
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("");
		universidade = new UniversidadeProxy("correto");
		System.out.println("Login v�lido");
		System.out.println(universidade.getNomeInstituicao());
		System.out.println(universidade.getNomeCurso());
	}

}
