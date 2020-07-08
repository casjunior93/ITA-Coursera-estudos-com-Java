public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();

        c1.nome = "Gol";
        c1.velocidade = 10;

        c2.nome = "Fusca";
        c2.potencia = 10;
        c2.velocidade = 10;

        c3.nome = "Corsa";
        c3.potencia = 10;
        c3.velocidade = 10;

        c1.acelerar();
        c1.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.frear();
        c3.acelerar();

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
