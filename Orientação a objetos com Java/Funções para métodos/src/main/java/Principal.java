public class Principal {
    public static void main(String[] args) {
        Aluno carlos = new Aluno();
        carlos.bim1 = 70;
        carlos.bim2 = 50;
        carlos.bim3 = 40;
        carlos.bim4 = 90;

        System.out.println(carlos.media());
        System.out.println(carlos.passouDeAno());
    }
}
