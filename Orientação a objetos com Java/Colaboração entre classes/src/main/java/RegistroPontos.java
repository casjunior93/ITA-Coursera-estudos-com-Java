public class RegistroPontos {
    //metodos para o que o usuario faz
    private CalculaBonus bonus;

    public RegistroPontos ( CalculaBonus cb ) {
        bonus = cb;
    }

    public void fazerComentario( Usuario u) {
        var pontos = 3 * bonus.bonus( u );
        u.setPontos(pontos);
    }

    public void criarTopicoForum( Usuario u ) {
        var pontos = 5 * bonus.bonus( u );
        u.setPontos(pontos);
    }

    public void darLike(  Usuario u) {
        var pontos = 1 * bonus.bonus( u );
        u.setPontos(pontos);
    }


}
