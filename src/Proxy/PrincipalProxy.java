package Proxy;

public class PrincipalProxy {

	public static void main(String[] args) {
		
		System.out.println("O Proxy fornece um substituto ou um espaço reservado para outro objeto.\r\n"
				+ "Pode controlar o acesso ao objeto original, permitindo que você execute algo antes\r\n"
				+ "ou depois que a solicitação chega ao objeto original. O proxy fica no meio do caminho\r\n"
				+ "entre o chamado do objeto cliente. Caso a aplicação venha a fazer uma requisição\r\n"
				+ "ao banco de dados entre o cliente e o banco teremos um proxy, onde será uma ‘cópia’\r\n"
				+ "do objeto real. Ali poderemos executar diversas lógicas, como logs, autenticação,\r\n"
				+ "cache entre outros.\n");
		
		Universidade universidade = new UniversidadeProxy("errado");
		System.out.println("Login Incorreto");
		System.out.println(universidade.getNomeInstituicao());
		System.out.println(universidade.getNomeCurso());
		System.out.println("");
		System.out.println("----------------------------");
		System.out.println("");
		universidade = new UniversidadeProxy("correto");
		System.out.println("Login válido");
		System.out.println(universidade.getNomeInstituicao());
		System.out.println(universidade.getNomeCurso());
	}

}
