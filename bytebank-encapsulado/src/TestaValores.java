
public class TestaValores {
	public static void main(String[] args) {
		Conta conta = new Conta(1221, 12323);
		
		conta.setAgencia(-50);
		conta.setNumero(-300);
		
		Conta conta1 = new Conta(1223, 11233);
		Conta conta2 = new Conta(88923, 1223);
		
		System.out.println(Conta.getTotal());
		
		
		
		
				
	}

}
