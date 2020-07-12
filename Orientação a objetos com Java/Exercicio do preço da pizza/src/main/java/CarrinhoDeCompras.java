public class CarrinhoDeCompras {

    public int valorTotalDasPizzas = 0;
    public static int quantidadePizzas = 0;

    public void adicionaCarrinhoCompras( Pizza p ) {
        if (!(p.quantidadeIngredientesPorPizza == 0)) {
            valorTotalDasPizzas += p.preco;
            quantidadePizzas++;
        } else {
            System.out.println("Por favor, escolha 1 ou mais ingredientes para a pizza de " + p.nome + "\n");
        }
    }
}
