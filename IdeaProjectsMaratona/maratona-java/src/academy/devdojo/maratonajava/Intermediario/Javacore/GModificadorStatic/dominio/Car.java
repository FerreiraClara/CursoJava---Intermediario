package academy.devdojo.maratonajava.Intermediario.Javacore.GModificadorStatic.dominio;

public class Car {
    private String name;
    private double maxSpeed;
    private double limSpeed = 250;

    public Car(String name, double maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public void printDate(){
        System.out.println("-------------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade Máxima: " + this.maxSpeed);
        System.out.println("Velocidade Limite: " + this.limSpeed);
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

    public double getLimSpeed() {
        return this.limSpeed;
    }

    public void setLimSpeed(double limSpeed) {
        this.limSpeed = limSpeed;
    }
}
