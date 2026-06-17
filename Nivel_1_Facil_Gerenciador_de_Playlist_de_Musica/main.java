package Nivel_1_Facil_Gerenciador_de_Playlist_de_Musica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {

        Musica m1 = new Musica("Bohemian Rhapsody", "Queen", 1975);
        Musica m2 = new Musica("Thriller", "Michael Jackson", 1982);
        Musica m3 = new Musica("Shape of You", "Ed Sheeran", 2017);

        try {

            BufferedWriter bw =
                    new BufferedWriter(
                            new FileWriter("minha_playlist.txt"));

            bw.write(m1.toString());
            bw.newLine();

            bw.write(m2.toString());
            bw.newLine();

            bw.write(m3.toString());
            bw.newLine();

            bw.close();

            System.out.println("Playlist salva com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao salvar: " + e.getMessage());
        }

        try {

            BufferedReader br =
                    new BufferedReader(
                            new FileReader("minha_playlist.txt"));

            String linha;

            System.out.println("\nMúsicas da playlist:");

            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }
}
