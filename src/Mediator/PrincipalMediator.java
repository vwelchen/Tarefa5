package Mediator;

public class PrincipalMediator {
	public static void main(String[] args) {
		
		System.out.println("Mediator tem a intenção de definir um objeto que encapsula a forma como um conjunto\r\n"
				+ "de objetos interagem. Promove o acoplamento fraco evitando que os objetos se refiram explicitamente\r\n"
				+ "uns aos outros e nos permite variar sua interação de forma independente. É utilizado para fornecer\r\n"
				+ "um meio de comunicação centralizado entre diferentes objetos em um sistema, quando a lógica de\r\n"
				+ "comunicação entre objetos é complexa, possibilitando ter um ponto central de comunicação que cuida\r\n"
				+ "da lógica de comunicação. No exemplo do Chat apresentado, há um objeto central ou árbitro mediador\r\n"
				+ "que está interagindo com o resto de usuários de tal modo que todos os usuários que estão nesta\r\n"
				+ " sala de chat, quando enviam uma mensagem para outro, eles fazem isso através do mediador,\r\n"
				+ "que é o único que gerencia essas mensagens e entrega ao destinatário.\n");
		
		IChatRoom chatroom = new ChatRoom();

		User user1 = new ChatUser(chatroom, "1", "Maria");
		User user2 = new ChatUser(chatroom, "2", "José");
		User user3 = new ChatUser(chatroom, "3", "João");
		User user4 = new ChatUser(chatroom, "4", "Ana");

		chatroom.addUser(user1);
		chatroom.addUser(user2);
		chatroom.addUser(user3);
		chatroom.addUser(user4);

		user1.send("Hello brian", "2");
		user2.send("Hey buddy", "1");

	}
}