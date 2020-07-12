import java.util.HashMap;

public class Pizza {
    public static HashMap<String, Integer> map = new HashMap<String, Integer>();
    public static int quantidadeIngredientes = 0;
    public int preco = 0;
    public int quantidadeIngredientesPorPizza = 0;
    public String nome;

    public static void contabilizaIngrediente( String ingrediente ) {
            if (map.containsKey(ingrediente)) {
                Integer a = map.get(ingrediente);
                a++;
                map.put(ingrediente, a);
            } else {
                map.put(ingrediente, 1);
            }
    }

    public void adicionaIngrediente( String ingrediente ) {
        if (!ingrediente.isEmpty()) {
            quantidadeIngredientes++;
            this.quantidadeIngredientesPorPizza++;
            contabilizaIngrediente(ingrediente);
            getPreco();
        }
    }

    public void getPreco() {
        if (quantidadeIngredientesPorPizza <= 2 ) {
            this.preco = 15;
        } else if ( quantidadeIngredientesPorPizza >= 3 && quantidadeIngredientesPorPizza <= 5) {
            this.preco = 20;
        } else {
            this.preco = 23;
        }
    }
}
