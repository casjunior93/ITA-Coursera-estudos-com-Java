import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        //criando objetos do tipo Pizza
        Pizza p1 = new Pizza();
        Pizza p2 = new Pizza();
        Pizza p3 = new Pizza();
        Pizza p4 = new Pizza();
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        //Criando as Pizzas
        p1.nome = "Calabresa";
        p1.adicionaIngrediente("Queijo");
        p1.adicionaIngrediente("");
        p1.adicionaIngrediente("Calabresa");
        carrinhoDeCompras.adicionaCarrinhoCompras( p1 );

        p2.nome = "Mussarela";
        p2.adicionaIngrediente("Queijo");
        p2.adicionaIngrediente("Cebola");
        p2.adicionaIngrediente("Tomate");
        p2.adicionaIngrediente("Mussarela");
        p2.adicionaIngrediente("Azeitona");
        carrinhoDeCompras.adicionaCarrinhoCompras( p2 );

        p3.nome = "Catupiry";
        p3.adicionaIngrediente("Queijo");
        p3.adicionaIngrediente("Tomate");
        p3.adicionaIngrediente("Azeitona");
        p3.adicionaIngrediente("Catupiry");
        carrinhoDeCompras.adicionaCarrinhoCompras( p3 );

        //Pizza sem ingredientes
        p4.nome = "Strogonoff";
        carrinhoDeCompras.adicionaCarrinhoCompras( p4 );

        //Imprimindo os resultados
        System.out.println("Total: " + carrinhoDeCompras.quantidadePizzas + " pizzas");
        System.out.println("Carrinho de compras: " + carrinhoDeCompras.valorTotalDasPizzas + " reais\n");
        System.out.println("Total de ingredientes utilizados:");
        for (Map.Entry<String, Integer> e : Pizza.map.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
