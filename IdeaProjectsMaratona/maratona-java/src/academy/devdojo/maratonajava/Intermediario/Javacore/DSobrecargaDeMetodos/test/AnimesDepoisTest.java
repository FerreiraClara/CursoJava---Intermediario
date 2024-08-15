package academy.devdojo.maratonajava.Intermediario.Javacore.DSobrecargaDeMetodos.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.DSobrecargaDeMetodos.dominio.AnimesDepois;

public class AnimesDepoisTest {
    public static void main(String[] args) {
        AnimesDepois anime01 = new AnimesDepois();

        anime01.start("Akudama Drive", "TV", 15, "Ação");

        anime01.printDate();

    }
}
