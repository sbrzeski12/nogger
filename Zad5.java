class Calculator{
    public double calculate(double a){
        return Math.pow(a, 2);
    }
    public double calculate(double a, double b){
        return a * b;
    }
    public double calculate(double a, double b, double c){
        return a + b + c;
    }
}
public class Zad5 {
    public static void main(String[] args){
    Calculator calculator = new Calculator();

    double res1 = calculator.calculate(6);
    double res2 = calculator.calculate(4,6);
    double res3 = calculator.calculate(5,5,5);

        System.out.println("6^2 = "+ res1 + ", 4 * 6 = " + res2 + ", 5 + 5 + 5 = " + res3);
    }
}
