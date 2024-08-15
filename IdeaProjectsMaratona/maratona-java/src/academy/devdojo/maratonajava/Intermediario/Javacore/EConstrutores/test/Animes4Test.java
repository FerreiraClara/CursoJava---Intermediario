package academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.EConstrutores.domino.Animes4;

public class Animes4Test {
    public static void main(String[] args) {
//        Todos os valores são passados obrigatóriamente no construtor

        Animes4 anime01 = new Animes4("Akame", "TV", 26, "Ação", "Production IG");
        Animes4 anime02 = new Animes4();

        anime01.printDate();

        System.out.println("");

        anime02.printDate();

    }
}
