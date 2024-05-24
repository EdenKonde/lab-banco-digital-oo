
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
	@Override
	public void solicitarEmprestimo(){

		if(super.getSaldo() >= 100){
			System.out.println("Você um emprestimo pré-aprovado no valor de R$300");
		} else {
			
			System.out.println("Não existe emprestimo disponível, mantém os seus dados atualizado!");
		}
	}
	
}
