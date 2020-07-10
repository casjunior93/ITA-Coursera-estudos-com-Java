public class Principal {
    public static void main(String[] args) {
        Compra compraVista = new Compra( 500 );
        System.out.println("Compra a vista no valor de " + compraVista.valorTotal + " reais.");

        Compra compraPrazo = new Compra( 4, 180);
        System.out.println("Compra a prazo, em " + compraPrazo.getNumeroParcelas() + "x de "
        + compraPrazo.getValorParcela() + " reais. Total de " + compraPrazo.getValorTotal() + " reais");
    }
}
