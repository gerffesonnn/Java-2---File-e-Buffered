package Nivel_3_Dificil_Sistema_de_Credenciamento_de_Hackathon;

public class Designer extends Participante {

    private String ferramentaVisual;

    public Designer(String nome, int idade,
                    String matricula,
                    String ferramentaVisual) {

        super(nome, idade, matricula);
        this.ferramentaVisual = ferramentaVisual;
    }

    public String getFerramentaVisual() {
        return ferramentaVisual;
    }

    public void setFerramentaVisual(String ferramentaVisual) {
        this.ferramentaVisual = ferramentaVisual;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Ferramenta: " + ferramentaVisual;
    }
}