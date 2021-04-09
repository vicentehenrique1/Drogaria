import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class FabricanteControler {
	static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();
	// Cadastrar clientes
	// Não cadastrar cliente repetido
	private static AtomicInteger id_generator = new AtomicInteger(0);
	static Scanner scan = new Scanner(System.in);

	
	
	public void cadastrar() {
Fabricante a = new Fabricante();
		System.out.println("Informar o nome do Fabricante:");
		a.setNome(scan.nextLine());

		System.out.println("Informar a descrição do Fabricante:");
		 a.setDescricao(scan.nextLine());

		a.setId(id_generator.getAndIncrement());

		listaFabricantes.add(a);
		System.out.println("Cliente cadastrado com sucesso.");
	}

	public static void remover() {
		System.out.println("Digite o id do Fabricante para remover");
		int id = scan.nextInt();	
		int i = 0;
        for (Fabricante fabricante : listaFabricantes) {
            if (fabricante.getId() == id) {
                listaFabricantes.remove(i);
            }
            i++;
        }
		}
	
	

	public static void alterar() {
	
		System.out.println("Digite o Nome do Fabricante que deseja Alterar");
		String nome = scan.nextLine();
		System.out.println("Digite o Novo Nome");
		String novo = scan.nextLine();
		int i = 0;
		for (Fabricante fabricante: listaFabricantes)  {
			if (fabricante.getNome().equals(nome)) {
				listaFabricantes.get(i).setNome(novo);
				
			} i++;
		}
	}
	

	public static void listar() {
		String saida = "";
		// Listar todos os Fabricantes Cadastrados
		
		for (int i = 0; i < listaFabricantes.size(); i++) {
			saida = saida + "Nome: " + listaFabricantes.get(i).getNome() + "\n" + "Descrição: " + listaFabricantes.get(i).getDescricao()
					+ "\n" + "Nº Cadastro: " + listaFabricantes.get(i).getId();

		}System.out.println(saida);
	}
}


