package Nivel_3_Dificil_Sistema_de_Credenciamento_de_Hackathon;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Participante> aprovados = new ArrayList<>();

        try {

            BufferedWriter arquivo = getBufferedWriter();

            arquivo.close();

            BufferedReader br = new BufferedReader(
                    new FileReader("inscricoes_brutas.txt"));

            BufferedWriter aprovadosArq = new BufferedWriter(
                    new FileWriter("aprovados_hackathon.txt"));

            BufferedWriter pendenciasArq = new BufferedWriter(
                    new FileWriter("pendencias_inscricao.txt"));

            String linha;

            while ((linha = br.readLine()) != null) {

                try {

                    String[] dados = linha.split(";");

                    if (dados.length < 5) {
                        throw new Exception();
                    }

                    int idade = Integer.parseInt(dados[2]);

                    if (idade < 14 || idade > 21) {
                        pendenciasArq.write(linha);
                        pendenciasArq.newLine();
                        continue;
                    }

                    if (dados[0].equals("DEV")) {

                        Desenvolvedor dev =
                                new Desenvolvedor(
                                        dados[1],
                                        idade,
                                        dados[3],
                                        dados[4]);

                        aprovados.add(dev);

                    } else if (dados[0].equals("DES")) {

                        Designer des =
                                new Designer(
                                        dados[1],
                                        idade,
                                        dados[3],
                                        dados[4]);

                        aprovados.add(des);

                    } else {

                        pendenciasArq.write(linha);
                        pendenciasArq.newLine();
                    }

                } catch (Exception e) {

                    pendenciasArq.write(linha);
                    pendenciasArq.newLine();
                }
            }

            System.out.println("Participantes aprovados:\n");

            for (Participante p : aprovados) {

                System.out.println("Nome: " + p.getNome());
                System.out.println("Idade: " + p.getIdade());
                System.out.println("Matrícula: " + p.getMatricula());
                System.out.println();

                aprovadosArq.write(p.toString());
                aprovadosArq.newLine();
            }

            br.close();
            aprovadosArq.close();
            pendenciasArq.close();

            System.out.println("Processamento concluído!");

        } catch (IOException e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static BufferedWriter getBufferedWriter() throws IOException {
        BufferedWriter arquivo = new BufferedWriter(
                new FileWriter("inscricoes_brutas.txt"));

        arquivo.write("DEV;Joao;18;2025001;Java");
        arquivo.newLine();

        arquivo.write("DES;Maria;20;2025002;Photoshop");
        arquivo.newLine();

        arquivo.write("DEV;Pedro;12;2025003;Python");
        arquivo.newLine();

        arquivo.write("DES;Ana;25;2025004;Figma");
        arquivo.newLine();

        arquivo.write("DEV;Lucas;19;2025005;C#");
        arquivo.newLine();
        return arquivo;
    }
}