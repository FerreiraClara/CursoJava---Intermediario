package academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.domino.Animes2;

public class Animes2Test {
    public static void main(String[] args) {
//        Todos os valores são passados obrigatóriamente no construtor

        Animes2 anime01 = new Animes2("Akame", "TV", 26, "Ação");

        anime01.printDate();

    }
}
