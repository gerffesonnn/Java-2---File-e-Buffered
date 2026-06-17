package Nível_2_Médio_Roster_de_Jogo_de_Luta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class main {

    public static void main(String[] args) {

        List<Personagem> personagens = new ArrayList<>();

        try {

    
            BufferedWriter bw = new BufferedWriter(
                    new FileWriter("personagens_db.csv"));

            bw.write("L;Jin;85;Karate");
            bw.newLine();

            bw.write("A;Victor;80;Pistola Cibernetica");
            bw.newLine();

            bw.write("L;King;90;Luta Livre");
            bw.newLine();

            bw.write("A;Nina;75;Rifle de Precisão");
            bw.newLine();

            bw.close();

            // Lê o arquivo
            BufferedReader br = new BufferedReader(
                    new FileReader("personagens_db.csv"));

            String linha;

            while ((linha = br.readLine()) != null) {

                String[] dados = linha.split(";");

                if (dados[0].equals("L")) {

                    LutadorCorpoACorpo lutador =
                            new LutadorCorpoACorpo(
                                    dados[1],
                                    Integer.parseInt(dados[2]),
                                    dados[3]);

                    personagens.add(lutador);

                } else if (dados[0].equals("A")) {

                    Atirador atirador =
                            new Atirador(
                                    dados[1],
                                    Integer.parseInt(dados[2]),
                                    dados[3]);

                    personagens.add(atirador);
                }
            }

            br.close();

            System.out.println("Personagens carregados:\n");

            for (Personagem p : personagens) {
                System.out.println(p);
            }

        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
