package Nível_2_Médio_Roster_de_Jogo_de_Luta;

public class Atirador extends Personagem {

    private String armaPrincipal;

    public Atirador(String nome,
                    int forcaBase,
                    String armaPrincipal) {

        super(nome, forcaBase);
        this.armaPrincipal = armaPrincipal;
    }

    public String getArmaPrincipal() {
        return armaPrincipal;
    }

    public void setArmaPrincipal(String armaPrincipal) {
        this.armaPrincipal = armaPrincipal;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Arma Principal: " + armaPrincipal;
    }
}
