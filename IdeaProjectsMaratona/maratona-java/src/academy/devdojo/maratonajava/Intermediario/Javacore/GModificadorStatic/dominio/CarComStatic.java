package academy.devdojo.maratonajava.Intermediario.Javacore.GModificadorStatic.dominio;

public class CarComStatic {
    private String name;
    private double maxSpeed;
    public static double limSpeed = 250;

    public CarComStatic(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void printDate(){
        System.out.println("-------------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade Máxima: " + this.maxSpeed);
        System.out.println("Velocidade Limite: " + CarComStatic.limSpeed);
    }

    public static double getLimSpeed() {
        return CarComStatic.limSpeed;
    }

    public static void setLimSpeed(double limSpeed) {
        CarComStatic.limSpeed = limSpeed;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }


}
