package academy.devdojo.maratonajava.Intermediario.Javacore.DSobrecargaDeMetodos.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.DSobrecargaDeMetodos.dominio.AnimesAntes;

public class AnimesAntesTest {
    public static void main(String[] args) {
        AnimesAntes anime01 = new AnimesAntes();

        anime01.setName("Akudama Drive");
        anime01.setType("TV");
        anime01.setEpisodes(18);

        anime01.printDate();

    }
}
