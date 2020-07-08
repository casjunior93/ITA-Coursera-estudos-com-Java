public class Carro {
    int velocidade;
    int potencia;
    String nome;

    public void acelerar() {
        velocidade += velocidade;
    }

    public void frear() {
        velocidade = velocidade/2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void imprime() {
        System.out.println("O carro " + nome + " está a " + getVelocidade() + " km/h");
    }

}
