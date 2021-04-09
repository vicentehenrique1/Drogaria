import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class VendaControler {
	static ArrayList<Venda> listaVendas = new ArrayList<Venda>();
	// Cadastrar clientes
	// Não cadastrar cliente repetido
	private static AtomicInteger id_generator = new AtomicInteger(0);
	static Scanner scan = new Scanner(System.in);

	public void vender() {
		Venda a = new Venda();
		System.out.println("Informar o ID do Produto:");
		int compra = scan.nextInt();

		ProdutoControler produtoControler = new ProdutoControler();
		for (Produto produto : produtoControler.getListaProdutos()) {
		if (produto.getId()==(compra)) {
			a.setProduto(produto);
			produto.setQuantidade(produto.getQuantidade()-1);
		}}

		a.setId(id_generator.getAndIncrement());

		listaVendas.add(a);
		System.out.println("Venda finalizada.");
	}

	public static void listar() {
		String saida = "";
		// Listar todos os Clientes Cadastrados

		for (int i = 0; i < listaVendas.size(); i++) {
			saida = saida + "Nome: " + listaVendas.get(i).getProduto() + "\n" + "ID: " + listaVendas.get(i).getId() ;
					

		}
		System.out.println(saida);
	}

}
