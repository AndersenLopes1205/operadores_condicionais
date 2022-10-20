package operadores_condicionais;

public class TestesCondicionais {
	public static void main(String[] args) {
		int opcao = 3;
		double saldo = 5.825;
		if (opcao ==3) {
			System.out.println("Consultar conta poupança");
			System.out.println("Fazer transferencia");
		} else if(opcao == 2) {
			System.out.println("Fazer deposito");
		} else if(opcao == 1) {
	System.out.println("Verificar saldo " + saldo);
		}else {
			System.err.println("Erro de comunicao");
		}
	}
	
}
