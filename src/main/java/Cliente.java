import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Cliente {
	static ArrayList<Clientevar> listaClientes = new ArrayList<Clientevar>();
	// Cadastrar clientes
	// Não cadastrar cliente repetido
	private static AtomicInteger id_generator = new AtomicInteger(0);
	static Scanner scan = new Scanner(System.in);

	
	
	public void cadastrar() {
Clientevar a = new Clientevar();
		System.out.println("Informar o nome do Cliente:");
		a.setNome(scan.nextLine());

		System.out.println("Informar o CPF do Cliente:");
		 a.setCpf(scan.nextLine());

		a.setId(id_generator.getAndIncrement());

		listaClientes.add(a);
		System.out.println("Cliente cadastrado com sucesso.");
	}

	public static void remover() {
		System.out.println("Digite o id do cliente para remover");
		int id = scan.nextInt();	
		int i = 0;
        for (Clientevar clientevar : listaClientes) {
            if (clientevar.getId() == id) {
                listaClientes.remove(i);
            }
            i++;
        }
		}
	
	

	public static void alterar() {
	
		System.out.println("Digite o Nome do Cliente que deseja Alterar");
		String nome = scan.nextLine();
		System.out.println("Digite o Novo Nome");
		String novo = scan.nextLine();
		int i = 0;
		for (Clientevar clientevar: listaClientes)  {
			if (clientevar.getNome().equals(nome)) {
				listaClientes.get(i).setNome(novo);
				
			} i++;
		}
	}
	

	public static void listar() {
		String saida = "";
		// Listar todos os Clientes Cadastrados
		
		for (int i = 0; i < listaClientes.size(); i++) {
			saida = saida + "Nome: " + listaClientes.get(i).getNome() + "\n" + "CPF: " + listaClientes.get(i).getCpf()
					+ "\n" + "Nº Cadastro: " + listaClientes.get(i).getId();

		}System.out.println(saida);
	}
}
