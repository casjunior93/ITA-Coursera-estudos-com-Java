public class Somador {
    String nome;
    int valorInstancia = 0;
    static int valorEstatico = 0;

    void somar() {
        valorInstancia++;
        valorEstatico++;
    }

    void imprimir() {
        System.out.println("O somador " + nome + " tem valorInstancia: " + valorInstancia + " valorEstatico: " +
                valorEstatico);
    }

}
