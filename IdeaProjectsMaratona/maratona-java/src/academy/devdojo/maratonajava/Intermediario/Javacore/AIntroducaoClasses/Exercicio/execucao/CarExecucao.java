package academy.devdojo.maratonajava.Intermediario.Javacore.AIntroducaoClasses.Exercicio.execucao;

import academy.devdojo.maratonajava.Intermediario.Javacore.AIntroducaoClasses.Exercicio.dominio.Car;

public class CarExecucao {
    public static void main(String[] args) {
        Car carro1 = new Car();
        Car carro2 = new Car();

        carro1.name = "Fusca Bala";
        carro1.model = "Sport";
        carro1.year = 1969;

        carro2.name = "Mustang";
        carro2.model = "GT-500";
        carro2.year = 1968;

        //carro2 = carro1;

        System.out.println("Carro 1: ");
        System.out.println("Nome: " + carro1.name + "\nModelo: " + carro1.model + "\nAno: " + carro1.year + "\n");

        System.out.println("Carro 2: ");
        System.out.println("Nome: " + carro2.name);
        System.out.println("Modelo: " + carro2.model);
        System.out.println("Ano: " + carro2.year);

    }
}
