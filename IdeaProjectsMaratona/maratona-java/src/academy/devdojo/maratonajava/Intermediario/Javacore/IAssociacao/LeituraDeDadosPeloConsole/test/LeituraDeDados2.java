package academy.devdojo.maratonajava.Intermediario.Javacore.IAssociacao.LeituraDeDadosPeloConsole.test;

import java.util.Scanner;

public class LeituraDeDados2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        String name = entrada.nextLine();

        System.out.println("Digite sua idade: ");
        int age = entrada.nextInt();

        System.out.println("Digite M ou F para o seu sexo: ");
        char sex = entrada.next().charAt(0);

        System.out.println("---------------------------");

        System.out.println("Nome: " + name);
        System.out.println("Idade: " + age);
        System.out.println("Sexo: " + sex);

//        Se digitar "Maculino" no sexo, só vai pegar a primeira letra
//        (charAt(0) - caracterer q estiver na posição 0)
    }
}
