package HomeWorks.HomeWork01;
import java.util.Scanner;
/*
 * Реализовать простой калькулятор
 */
public class Task03 {

    public static double sumOfNumbers(double number1, double number2) {
        return number1 + number2;
    }

    public static double differenceOfNumbers(double number1, double number2) {
        return number1 - number2;
    }

    public static double productOfNumbers(double number1, double number2) {
        return number1 * number2;
    }

    public static double quotientOfNumbers(double number1, double number2) {
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

        double result;
        if(operation == '+') {
            result = sumOfNumbers(number1, number2);
            System.out.printf("%.2f %c %.2f = %.2f\n", number1, operation, number2, result);
        }
        else if (operation == '-') {
            result = differenceOfNumbers(number1, number2);
            System.out.printf("%.2f %c %.2f = %.2f\n", number1, operation, number2, result);
        }
        else if (operation == '*') {
            result = productOfNumbers(number1, number2);
            System.out.printf("%.2f %c %.2f = %.2f\n", number1, operation, number2, result);
        }
        else if (operation == '/') {
            result = quotientOfNumbers(number1, number2);
            System.out.printf("%.2f %c %.2f = %.2f\n", number1, operation, number2, result);
        }
        else {
            System.out.println("Введена неверная операция!");
        }
        scanner.close();
    }
}
