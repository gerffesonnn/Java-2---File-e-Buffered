package Nível_2_Médio_Roster_de_Jogo_de_Luta;

public class LutadorCorpoACorpo extends Personagem {

    private String arteMarcial;

    public LutadorCorpoACorpo(String nome,
                              int forcaBase,
                              String arteMarcial) {

        super(nome, forcaBase);
        this.arteMarcial = arteMarcial;
    }

    public String getArteMarcial() {
        return arteMarcial;
    }

    public void setArteMarcial(String arteMarcial) {
        this.arteMarcial = arteMarcial;
    }

    @Override
    public String toString() {
        return super.toString() +
                " | Arte Marcial: " + arteMarcial;
    }
}
