package academy.devdojo.maratonajava.Intermediario.Javacore.GModificadorStatic.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.GModificadorStatic.dominio.CarComStatic;

public class CarComStaticTest {
    public static void main(String[] args) {
        CarComStatic car01 = new CarComStatic("BMW", 280);
        CarComStatic car02 = new CarComStatic("Mercedes", 275);
        CarComStatic car03 = new CarComStatic("Audi", 290);

        CarComStatic.limSpeed = 180;

        car01.printDate();
        car02.printDate();
        car03.printDate();

//      CarComStatic.limSpeed nao precisa que seja criado um objeto, ele funciona sozinho
//      Ex do código:
        System.out.println();
        System.out.println();

        System.out.println(CarComStatic.limSpeed);
        CarComStatic.limSpeed = 200;
        System.out.println(CarComStatic.limSpeed);

    }
}
