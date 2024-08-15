package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.LeituraDeDadosPeloConsole.Exercicio.test;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("O grande software de previsão do futuro!");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO");

        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        } else {
            System.out.println("NÃO");
        }

        //exercicío pegadinha
    }
}
