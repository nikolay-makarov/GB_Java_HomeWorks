package HomeWorks.HomeWork03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */

public class Task02 {

    public static List<Integer> makeRandomList(int arrayLength) {
        List<Integer> numbersList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++)
            numbersList.add(i, random.nextInt(101));
        return numbersList;
    }

    public static List<Integer> deleteEvenNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0)
                numbers.remove(i--);
        }
        return numbers;
    }

    public static void main(String[] args) {
        List<Integer> numbers = makeRandomList(15);
        System.out.print("Исходный список: ");
        System.out.println(numbers);

        deleteEvenNumbers(numbers);

        System.out.print("Cписок после удаления четных чисел: ");
        System.out.println(numbers);
    }
}
