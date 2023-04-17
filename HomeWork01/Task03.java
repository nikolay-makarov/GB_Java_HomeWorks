package HomeWorks.HomeWork01;
import java.util.Scanner;
/*
 * Реализовать простой калькулятор
 */
public class Task03 {
    public static double SumOfNumbers(double number1, double number2) {
        return number1 + number2;
    }
    public static double DifferenceOfNumbers(double number1, double number2) {
        return number1 - number2;
    }
    public static double ProductOfNumbers(double number1, double number2) {
        return number1 * number2;
    }
    public static double QuotientOfNumbers(double number1, double number2) {
        return number1 / number2;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2;
        System.out.print("Введите первое число: ");
        number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        number2 = scanner.nextDouble();

        System.out.print("Введите операцию (+-*/): ");
        char operation = scanner.next().charAt(0);
        double result = 0;
        if(operation == '+')
            result = SumOfNumbers(number1, number2);
        else if (operation == '-')
            result = DifferenceOfNumbers(number1, number2);
        else if (operation == '*')
            result = ProductOfNumbers(number1, number2);
        else if (operation == '/')
            result = QuotientOfNumbers(number1, number2);
        System.out.printf("%.2f %s %.2f = %.2f\n", number1, operation, number2, result);
        scanner.close();
    }
}
