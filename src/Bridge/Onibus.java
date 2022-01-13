package Bridge;

public class Onibus extends Veiculo {

	public Onibus(String marca, Transporte transporte) {
		super(marca, transporte);
	}

	@Override
	public void realizarAtividade() {
		System.out.print("�nibus " + marca + ": ");
		this.transporte.transportar();
	}
}