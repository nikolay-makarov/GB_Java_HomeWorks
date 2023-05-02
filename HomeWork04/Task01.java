package HomeWorks.HomeWork04;

import java.util.LinkedList;
import java.util.Random;

/*
 * Пусть дан LinkedList с несколькими элементами.
 * Реализуйте метод, который вернет “перевернутый” список.
 */
public class Task01 {
    public static LinkedList<Integer> makeRandomList(int listLength) {
        Random random = new Random();
        LinkedList <Integer> randomIntegerList = new LinkedList<>();

        for (int i = 0; i < listLength; i++) {
            randomIntegerList.add(random.nextInt(101));
        }

        return randomIntegerList;
    }

    public static LinkedList<Integer> reverseList(LinkedList<Integer> linkedList) {
        LinkedList<Integer> copy = (LinkedList<Integer>) linkedList.clone();
        LinkedList<Integer> reversedList = new LinkedList<>();
        
        while (!copy.isEmpty()){
            reversedList.add(copy.removeLast());
        }

        return reversedList;
    }

    public static void main(String[] args) {
        System.out.println("Создаем список из 10 элементов, состоящий из целых чисел от 0 до 100.");
        LinkedList<Integer> sourceList = makeRandomList(10);

        System.out.print("Исходный список: ");
        System.out.println(sourceList);

        System.out.print("Перевернутый список: ");
        System.out.println(reverseList(sourceList));
    }
}
