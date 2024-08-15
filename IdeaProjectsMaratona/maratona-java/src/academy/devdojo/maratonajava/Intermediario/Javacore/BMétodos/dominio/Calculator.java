package academy.devdojo.maratonajava.Intermediario.Javacore.BMétodos.dominio;

public class Calculator {
    public void sumOfTwoNumbers(){
        System.out.println(10 + 10);
    }

    public void subOfTwoNumbers(){
        System.out.println(21 - 2);
    }

    public void multiplicationOfTwoNumbers(int num1, float num2){
        System.out.println(num1 * num2);
    }

    public double divisionOfTwoNumbers(double num1, int num2){
        if(num2 == 0) {
            System.out.print("Não existe divisão por ");
            return 0;
        } else {                                     // não tem necessidade de ter else, nesse caso, porque o return
            double divisor = num1 / num2;           // funciona como um "break", diferente do divisionOfTwoNumbers3
            return divisor;                        // return num1/num2;
        }
    }

    public int divisionOfTwoNumbers2(double num1, double num2){
        return (int) (num1 / num2);                     // casting agrupadando os dois valores ou fazer casting individual
    }

    public void divisionOfTwoNumbers3(double num1, double num2){
        if(num2 == 0) {
            System.out.println("Não existe divisão por 0");
        } else {
            double divisor = num1 / num2;
            System.out.println(divisor);
        }
    }

    public void divisionOfTwoNumbers4(double num1, double num2){
        if(num2 == 0) {
            System.out.println("Não existe divisão por 0");         //se entrar no if, vai continuar a execução fora do
            return;                                                //if, ent é possível usar o return para o método void
                                                                  //como se fosse um "break"
        }

        double divisor = num1 / num2;
        System.out.println(divisor);
    }
}
