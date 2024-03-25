package Calculator;

public class CalculatorMain {

    public static class CalculatorClass {
        double num1;
        double num2;

        public static double soma(double num1, double num2) {
            return num1 + num2;
        }

        public static double sub(double num1, double num2) {
            return num1 - num2;
        }

        public static double mult(double num1, double num2) {
            return num1 * num2;
        }

        public static double div(double num1, double num2) {
            if (num2 != 0) {
                return num1 / num2;
            } else {
                System.out.println("Denominador é igual a 0, sendo assim, é impossível fazer a divisão!");
                return Double.NaN;
            }
        }
    }

    public static void main(String[] args) {
        double a = 10.0;
        double b = 2.0;

        System.out.println("Soma: " + CalculatorClass.soma(a, b));
        System.out.println("Subtração: " + CalculatorClass.sub(a, b));
        System.out.println("Multiplicação: " + CalculatorClass.mult(a, b));
        System.out.println("Divisão: " + CalculatorClass.div(a, b));
    }
}
