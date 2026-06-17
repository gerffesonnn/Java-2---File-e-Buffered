package Nivel_3_Dificil_Sistema_de_Credenciamento_de_Hackathon;

public class Participante {

    private String nome;
    private int idade;
    private String matricula;

    public Participante(String nome, int idade, String matricula) {
        this.nome = nome;
        setIdade(idade);
        setMatricula(matricula);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 14 && idade <= 21) {
            this.idade = idade;
        } else {
            System.out.println("Idade inválida!");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()
                + " | Idade: " + getIdade()
                + " | Matrícula: " + getMatricula();
    }
}