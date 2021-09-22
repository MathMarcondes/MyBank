package Bank;

public class Main {

	public static void main(String[] args) {
		Banco1 b1 = new Banco1();
		b1.setNumConta(2476);
		b1.setDono("Louden");
		b1.abrirConta("cc");
		b1.depositar(100);
		b1.estadoAtual();
		
		b1.sacar(150.0f);
		b1.estadoAtual();
		
		
		
		
	}
}
		
	
		
		
	