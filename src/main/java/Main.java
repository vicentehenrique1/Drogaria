import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Clientevar clientevar = new Clientevar();
		Cliente cliente = new Cliente();
		while (true) {
			System.out.println("Selecione a operação do Cliente:" + "\n1 - Criar" + "\n2 - Lista de clientes" + "\n3 - Editar"
					+ "\n4 - Deletar"+ "\n Digite 5 para pular:"); 
			int operacao = scan.nextInt();
			if (operacao == 1) {
				cliente.cadastrar();
			} else if (operacao == 2) {
				cliente.listar();
			} else if (operacao == 3) {
				cliente.alterar();
			} else if (operacao == 4) {
				cliente.remover();
			} 

			ProdutoControler produtoControler = new ProdutoControler();
			
				System.out.println("Selecione a operação do Produto:" + "\n1 - Criar" + "\n2 - Lista de Produtos" + "\n3 - Editar"
						+ "\n4 - Deletar"+"\n Digite 5 para pular:");
				int op = scan.nextInt();
				if (op == 1) {
					produtoControler.cadastrar();
				} else if (op  == 2) {
					produtoControler.listar();
				} else if (op  == 3) {
					produtoControler.alterar();
				} else if (op  == 4) {
					produtoControler.remover();
				}
				FabricanteControler fabricanteControler = new FabricanteControler();
				
				System.out.println("Selecione a operação do Fabricante:" + "\n1 - Criar" + "\n2 - Lista de Fabricantes" + "\n3 - Editar"
						+ "\n4 - Deletar"+"\n Digite 5 para pular:");
				int op2 = scan.nextInt();
				if (op2 == 1) {
					fabricanteControler.cadastrar();
				} else if (op2 == 2) {
					fabricanteControler.listar();
				} else if (op2 == 3) {
					fabricanteControler.alterar();
				} else if (op2 == 4) {
					fabricanteControler.remover();
				}
		
FuncionarioControler funcionarioControler = new FuncionarioControler();
				
				System.out.println("Selecione a operação do Funcionario:" + "\n1 - Criar" + "\n2 - Lista de Funcionarios5" + "\n3 - Editar"
						+ "\n4 - Deletar"+"\n Digite 5 para pular:");
				int op3 = scan.nextInt();
				if (op3 == 1) {
					funcionarioControler.cadastrar();
				} else if (op3 == 2) {
					funcionarioControler.listar();
				} else if (op3 == 3) {
					funcionarioControler.alterar();
				} else if (op3 == 4) {
					funcionarioControler.remover();
				}
		
				VendaControler vendaControler = new VendaControler();
				System.out.println("Selecione a operação de Venda:" + "\n1 - Vender" + "\n2 - Lista de Vendas" + "\n Digite 5 para pular:");
				int op4 = scan.nextInt();
				if (op4 == 1) {
					vendaControler.vender();
				} else if (op4 == 2) {
					vendaControler.listar();
				}
				}
		}
		
	
	
	
}
	
	
	


