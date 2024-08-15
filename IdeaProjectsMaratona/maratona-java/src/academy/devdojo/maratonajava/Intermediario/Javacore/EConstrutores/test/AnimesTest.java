package academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.domino.Animes;

public class AnimesTest {
    public static void main(String[] args) {
        Animes anime01 = new Animes("Akame");

        anime01.start("TV", 26, "Ação");

        anime01.printDate();

    }
}
