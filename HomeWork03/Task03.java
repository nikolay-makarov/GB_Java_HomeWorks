package HomeWorks.HomeWork03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 * Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее арифметичское этого списка.
 */

public class Task03 {

    public static List<Integer> makeRandomList(int arrayLength) {
        List<Integer> numbersList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < arrayLength; i++)
            numbersList.add(i, random.nextInt(101));
        return numbersList;
    }
    
    public static void main(String[] args) {
        int arrayLength = 10;
        List<Integer> list = makeRandomList(arrayLength);
        System.out.print("Заданный список: ");
        System.out.println(list);

        int min = list.get(0);
        int max = list.get(0);
        int total = list.get(0);

        for (int elem : list.subList(1, arrayLength)) {
            total += elem;
            if (min > elem) min = elem;
            if (max < elem) max = elem;
        }

        System.out.printf("Минимальное число в списке: %d\n", min);
        System.out.printf("Максимальное число в списке: %d\n", max);
        System.out.printf("Среднее арифметическое элементов списка: %.1f\n", (double)total / arrayLength);
    }
}
