package academy.devdojo.maratonajava.Intermediario.Javacore.GModificadorStatic.test;

import academy.devdojo.maratonajava.Intermediario.Javacore.GModificadorStatic.dominio.Car;

public class CarTest {
    public static void main(String[] args) {
        Car car01 = new Car("BMW", 280);
        Car car02 = new Car("Mercedes", 275);
        Car car03 = new Car("Audi", 290);

//      Só vai mudar o limite do car01
//      É preciso criar uma propriedade que seja INDEPENDENTE do objeto
        car01.setLimSpeed(200);

        car01.printDate();
        car02.printDate();
        car03.printDate();
    }
}
