package academy.devdojo.maratonajava.Intermediario.Javacore.FBlocosDeInicializacao.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.FBlocosDeInicializacao.dominio.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime01 = new Anime();
        Anime anime02 = new Anime("One piece");

        System.out.println(anime01.getEpisodes());
        System.out.println();
        System.out.println(anime02.getEpisodes());
    }
}
