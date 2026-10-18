package ec.epn.edu.calculator;

public class CalculatorExecute {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        int addition = c.addition(4, 7);
        int subtraction = c.subtraction(7, 1);

        System.out.println();
        System.out.println("+----------------------------------------+");
        System.out.println("|              CALCULADORA               |");
        System.out.println("+----------------------------------------+");
        System.out.printf("| %-12s | %-9s | %11s |%n", "Operacion", "Calculo", "Resultado");
        System.out.println("+--------------+-----------+-------------+");
        System.out.printf("| %-12s | %-9s | %11d |%n", "Suma", "4 + 7", addition);
        System.out.printf("| %-12s | %-9s | %11d |%n", "Resta", "7 - 1", subtraction);
        System.out.println("+----------------------------------------+");
        System.out.println();
    }
}

