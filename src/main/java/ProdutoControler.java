import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class ProdutoControler {
		static ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
		// Cadastrar clientes
		// Não cadastrar cliente repetido
		private static AtomicInteger id_generator = new AtomicInteger(0);
		static Scanner scan = new Scanner(System.in);

		
		
		public void cadastrar() {
	Produto a = new Produto();
			System.out.println("Informar o nome do Produto:");
			a.setProduto(scan.nextLine());

			System.out.println("Informar o preço do produto:");
			 a.setPreco(scan.nextDouble());

			 System.out.println("Informar a descrição do produto:");
				a.setDescricao(scan.nextLine());
			
				System.out.println("Informar a quantidade do produto:");
				 a.setQuantidade(scan.nextInt());
				
				 a.setId(id_generator.getAndIncrement());

			listaProdutos.add(a);
			System.out.println("Produto cadastrado com sucesso.");
		}

		public static void remover() {
			System.out.println("Digite o id do produto para remover");
			int id = scan.nextInt();	
			int i = 0;
	        for (Produto produto : listaProdutos) {
	            if (produto.getId() == id) {
	                listaProdutos.remove(i);
	            }
	            i++;
	        }
			}
		
		

		public static void alterar() {
		
			System.out.println("Digite o Nome do Produto que deseja Alterar");
			String nome = scan.nextLine();
			System.out.println("Digite o Novo Nome");
			String novo = scan.nextLine();
			int i = 0;
			for (Produto produto: listaProdutos)  {
				if (produto.getProduto().equals(produto)) {
					listaProdutos.get(i).setProduto(novo);
					
				} i++;
			}
		}
		

		public static void listar() {
			String saida = "";
			// Listar todos os Produtos Cadastrados
			
			for (int i = 0; i < listaProdutos.size(); i++) {
				saida = saida + "Nome: " + listaProdutos.get(i).getProduto() + "\n" + "Quantidade: " + listaProdutos.get(i).getQuantidade()
						+ "\n" + "Nº Cadastro: " + listaProdutos.get(i).getId();

			}System.out.println(saida);
		}

		public static ArrayList<Produto> getListaProdutos() {
			return listaProdutos;
		}
	}


