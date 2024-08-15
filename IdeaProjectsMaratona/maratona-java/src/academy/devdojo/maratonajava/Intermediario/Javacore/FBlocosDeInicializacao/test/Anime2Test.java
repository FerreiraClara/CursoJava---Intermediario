package academy.devdojo.maratonajava.Intermediario.Javacore.FBlocosDeInicializacao.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.FBlocosDeInicializacao.dominio.Anime2;

public class Anime2Test {
    public static void main(String[] args) {
        Anime2 anime01 = new Anime2();
        Anime2 anime02 = new Anime2("One piece");

        for (int episode : anime02.getEpisodes()) {
            System.out.print(episode + " ");
        }


//        System.out.println(anime01.getEpisodes());
//        System.out.println();
//        System.out.println(anime02.getEpisodes());
    }
}
