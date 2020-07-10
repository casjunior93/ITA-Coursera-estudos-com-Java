public class Principal {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario();
        CalculaBonus cb = new CalculaBonus();
        RegistroPontos registroPontos = new RegistroPontos( cb );
        usuario1.setVip(true);
        usuario2.setVip(false);

        registroPontos.criarTopicoForum( usuario1 );
        registroPontos.darLike( usuario1 );
        registroPontos.criarTopicoForum( usuario2 );
        registroPontos.darLike( usuario2 );
        System.out.println(usuario1.getPontos());
    }
}
