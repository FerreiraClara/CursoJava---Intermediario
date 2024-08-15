package academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.domino.Animes3;

public class Animes3Test {
    public static void main(String[] args) {
//        Todos os valores são passados obrigatóriamente no construtor

        Animes3 anime01 = new Animes3("Akame", "TV", 26, "Ação");
        Animes3 anime02 = new Animes3();

        anime01.printDate();

        System.out.println("");

        anime02.printDate();

    }
}
