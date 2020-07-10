public class CalculaBonus {
    public int bonusDoDia = 2;
    public int bonus( Usuario u ) {
        int multiplicador = bonusDoDia;
        if (u.isVip()) {
            multiplicador *= 5;
        }
        return multiplicador;
    }
}
