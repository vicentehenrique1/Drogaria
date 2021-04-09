import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class FuncionarioControler {
	static ArrayList<Funcionario> listafuncionario = new ArrayList<Funcionario>();
	// Cadastrar clientes
	// Não cadastrar cliente repetido
	private static AtomicInteger id_generator = new AtomicInteger(0);
	static Scanner scan = new Scanner(System.in);

	
	
	public void cadastrar() {
Funcionario a = new Funcionario();
		System.out.println("Informar o nome do Funcionario:");
		a.setNome(scan.nextLine());

		System.out.println("Informar o CPF do Funcionario:");
		 a.setCpf(scan.nextLine());

		a.setId(id_generator.getAndIncrement());

		listafuncionario.add(a);
		System.out.println("Funcionario cadastrado com sucesso.");
	}

	public static void remover() {
		System.out.println("Digite o id do Funcionario para remover");
		int id = scan.nextInt();	
		int i = 0;
        for (Funcionario funcionario : listafuncionario) {
            if (funcionario.getId() == id) {
                listafuncionario.remove(i);
            }
            i++;
        }
		}
	
	

	public static void alterar() {
	
		System.out.println("Digite o Nome do Funcionario que deseja Alterar");
		String nome = scan.nextLine();
		System.out.println("Digite o Novo Nome");
		String novo = scan.nextLine();
		int i = 0;
		for (Funcionario funcionario: listafuncionario)  {
			if (funcionario.getNome().equals(nome)) {
				listafuncionario.get(i).setNome(novo);
				
			} i++;
		}
	}
	

	public static void listar() {
		String saida = "";
		// Listar todos os Clientes Cadastrados
		
		for (int i = 0; i < listafuncionario.size(); i++) {
			saida = saida + "Nome: " + listafuncionario.get(i).getNome() + "\n" + "CPF: " + listafuncionario.get(i).getCpf()
					+ "\n" + "Nº Cadastro: " + listafuncionario.get(i).getId();

		}System.out.println(saida);
	}
}


