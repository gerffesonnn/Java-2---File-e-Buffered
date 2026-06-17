package Nivel_3_Dificil_Sistema_de_Credenciamento_de_Hackathon;

public class Desenvolvedor extends Participante {

    private String linguagemFavorita;

    public Desenvolvedor(String nome, int idade,
                         String matricula,
                         String linguagemFavorita) {

        super(nome, idade, matricula);
        this.linguagemFavorita = linguagemFavorita;
    }

    public String getLinguagemFavorita() {
        return linguagemFavorita;
    }

    public void setLinguagemFavorita(String linguagemFavorita) {
        this.linguagemFavorita = linguagemFavorita;
    }

    @Override
    public String toString() {
        return super.toString()
                + " | Linguagem: " + linguagemFavorita;
    }
}