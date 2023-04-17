package HomeWorks.HomeWork01;
import java.util.Scanner;
/**
 * Вычислить n-ое треугольного числа (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.print("Введите число: ");
        if(scanner.hasNextInt()){
            number = scanner.nextInt();
            int triangleNumber = 0, factorial = 1;
            for(int i = 1; i <= number; i++){
                triangleNumber += i;
                factorial *= i;
            }
            System.out.printf("Треугольное число: %d, Факториал: %d\n", triangleNumber, factorial);
        }
        else {
            System.out.println("Введены неверные данные!");
        }
        scanner.close();
    }
}
