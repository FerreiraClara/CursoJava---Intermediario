package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio;

public class CalculatorVarargs {
    public void sumArray(int[] numbers){
        int sum = 0;
        for (int cont : numbers) {
            sum += cont;
        }
        System.out.println(sum);
    }

    public void sumVarArgs(int... numbers){
        int sum = 0;
        for (int cont: numbers) {
            sum += cont;
        }
        System.out.println(sum);
    }

    public void sumVarArgs2(int valor, int... numbers){     // o varArgs precisa ser o último
        int sum = 0;
        for (int cont: numbers) {
            sum += cont;
        }
        System.out.println(sum);
    }
}
