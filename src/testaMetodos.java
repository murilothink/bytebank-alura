
public class testaMetodos {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta ();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.depositar(50);
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta ();
		contaDaMarcela.depositar(1000);
		System.out.println(contaDaMarcela.saldo);
		
		contaDaMarcela.transfere(300, contaDoPaulo); 
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.tituar = "Murilo Henrique";
		System.out.println(contaDoPaulo.tituar);
				
		
		
		
	}

	
}
	