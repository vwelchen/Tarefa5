package ChainsOfResponsibility;

public class PrincipalChainsOfResponsibility {

	public static void main(String[] args) {
		
		System.out.println("O padr�o Chain of Responsibility consiste em uma s�rie de objetos receptores e de objetos\r\n"
				+ "de solicita��o, onde cada objeto de solicita��o possui uma l�gica interna que separa quais s�o\r\n"
				+ "tipos de objetos receptores que podem ser manipulados e passa o restante para o pr�ximo objeto de\r\n"
				+ "solicita��o da cadeia. No exemplo vemos a implementa��o para lidar com a eventual cria��o de diferentes\r\n"
				+ "tipos de logs. No exemplo podemos ter logs dos tipos �info�, �warning� e �error�, ficando\r\n"
				+ "aberta e simples a possibilidade de tratar cada tipo desses logs de maneira diferente,\r\n"
				+ "caso seja desejado. Como um log s� pode ser de um tipo, quando a corrente chega a\r\n"
				+ "este tipo, o log � tratado e a execu��o da corrente � parada.\n");
		
		//Instancio os Handlers
		LogInfoHandler logInfoHandler = new LogInfoHandler();
		LogWarningHandler logWarningHandler = new LogWarningHandler();
		LogErrorHandler logErrorHandler = new LogErrorHandler();

		logInfoHandler.next(logWarningHandler);
		logWarningHandler.next(logErrorHandler);

		String response = logInfoHandler.handle("error");
		System.out.println(response);
	}

}