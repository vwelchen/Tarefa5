package Bridge;

public class Cargas implements Transporte {
	@Override
	public void transportar() {
		System.out.println("Ve�culo Transportando Cargas");
	}

	@Override
	public void descricaoTransporte() {
		System.out.println("Ve�culo que Transporta Cargas");
	}
}