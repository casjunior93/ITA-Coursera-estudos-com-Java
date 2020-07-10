public class Compra {

    int valorTotal;
    int numeroParcelas;

    //qndo a vista
    public Compra( int valor ) {
        valorTotal = valor;
        numeroParcelas = 1;
    }

    //qndo parcelado
    public Compra ( int quantidadeParcelas, int valorParcela ) {
        numeroParcelas = quantidadeParcelas;
        valorTotal = valorParcela * quantidadeParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela() {
        return valorTotal/numeroParcelas;
    }
}
