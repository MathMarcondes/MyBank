package Bank;

public class Banco1 {
	public int numConta;
	protected String tipo;  //cc -> conta corrente & cp -> conta poupan�a.
	private String dono;
	private float saldo;
	private boolean status;
	
		
	
	//M�todo Construtor
	
	public Banco1() {
		saldo = 0;
		status = false;
	}

		
		
	//Getters and Setters
		public int getNumConta() {
			return this.numConta;
		}
		
		public void setNumConta(int n) {
			this.numConta = n;
		}
		
		public void setTipo(String t) {
			this.tipo = t;
		}
		public String getTipo() {
			return this.tipo;
		}
		public void setDono(String d) {
			this.dono = d;
		}
		public String getDono() {
			return this.dono;
		}
		public void setSaldo(float s) {
			this.saldo = s;
		}
		public float getSaldo() {
			return this.saldo;
		}
		public void setStatus(boolean r) {
			this.status = r;
		}
		public boolean getStatus() {
			return this.status;
		}
		
		
	//M�todos Espec�ficos
		
	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);
		if (t == "cc") {
			setSaldo(50.00f);
		} else if (t == "cp") {
			setSaldo(150.00f); 
			}
		System.out.println("Conta aberta com sucesso! Bem vindo(a)");
		System.out.println("=================================");
	}	
	
	
	public void fecharConta() {
		if (getSaldo() > 0) {
			System.out.println("N�o foi poss�vel encerrar a conta pois ainda cont�m dinheiro.");
			
		} else if (getSaldo() < 0) {
			System.out.println("N�o foi poss�vel encerrar a conta. Ponta conta em d�bito");
			
		} else {
			System.out.println("Conta encerrada com sucesso.");
			setStatus(false);
		}
	}
	
	public void depositar(float v) { 
		if (getStatus()) {
			setSaldo(getSaldo() + v);
		} else {
			System.out.println("Imposs�vel Depositar");
		}
	}
	
	public void sacar(float v) {
		if (getStatus()) {
			if (getSaldo() >= v) {
				setSaldo(getSaldo() - v);
			} else {
				System.out.println("Saldo não é insuficiente");
			}
		}  else {
			System.out.println("Conta não registrada.");
		}
	}
	
	public void pagarMensalidade(int v) {
		if (this.tipo == "cc") {
			v = 12;
			setSaldo(getSaldo() - 12);
		} else if (this.tipo == "cp") {
			v = 20;
			setSaldo(getSaldo() - 20);
		}
	 if(this.status = true) {
		 if (this.saldo > v) {
			 setSaldo(getSaldo() - v);
		 } else {
			 System.out.println("Saldo insficiente.");
		 }
			
	 }
	}
	 public void estadoAtual() {
		 System.out.println("Conta: " + getNumConta());
		 System.out.println("Dono: " + getDono());
		 System.out.println("Saldo: " + getSaldo());
	 }
}
