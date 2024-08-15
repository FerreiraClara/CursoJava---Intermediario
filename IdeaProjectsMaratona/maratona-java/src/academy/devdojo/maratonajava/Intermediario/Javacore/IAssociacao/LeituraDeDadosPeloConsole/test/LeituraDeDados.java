package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.LeituraDeDadosPeloConsole.test;

import java.util.Scanner;

public class LeituraDeDados {
    public static void main(String[] args) {
        Scanner inputPalavra = new Scanner(System.in);
        Scanner inputNomeCompleto = new Scanner(System.in);

        System.out.println("Digite uma única palavra: ");
//        next lê só a primeira palavra
        String next = inputPalavra.next();

        System.out.println("Digite seu nome completo: ");
//        nextLine lê a linha inteira
        String next2 = inputNomeCompleto.nextLine();

        String next3 = inputPalavra.nextLine();
//
        System.out.println(next);
        System.out.println(next2);
        System.out.println(next3);

//        Quando chama o método nextLine() em seguida (usando o mesmo input),
//        ele lê o restante da entrada que foi deixada no buffer, que é a
//        linha inteira que contém a palavra "World" (exemplo).

    }
}
