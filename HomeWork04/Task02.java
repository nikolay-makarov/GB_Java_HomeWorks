package HomeWorks.HomeWork04;

import java.util.LinkedList;
import java.util.Random;

/*
 * Реализуйте очередь с помощью LinkedList со следующими методами:
 * enqueue() - помещает элемент в конец очереди,
 * dequeue() - возвращает первый элемент из очереди и удаляет его,
 * first() - возвращает первый элемент из очереди, не удаляя.
 */

public class Task02 {
    public static LinkedList<Integer> makeRandomList(int listLength) {
        Random random = new Random();
        LinkedList <Integer> randomIntegerList = new LinkedList<>();

        for (int i = 0; i < listLength; i++) {
            randomIntegerList.add(random.nextInt(101));
        }

        return randomIntegerList;
    }

    public static void enqueue(LinkedList<Integer> ll, int elem) {
        ll.addLast(elem);
    }

    public static int dequeue(LinkedList<Integer> ll) {
        if (ll.isEmpty()) {
            System.out.println("Очередь пуста!");
            return -1;
        }
        else
            return ll.pollFirst();
    }

    public static int first(LinkedList<Integer> ll) {
        if (ll.isEmpty()) {
            System.out.println("Очередь пуста!");
            return -1;
        }
        else
            return ll.getFirst();
    }

    public static void main(String[] args) {
        System.out.print("Создаем очередь (список) из 10 элементов от 0 до 100: ");
        LinkedList<Integer> linkedList = makeRandomList(10);
        System.out.println(linkedList);

        System.out.print("Добавляем число 15 в очередь: ");
        enqueue(linkedList, 15);
        System.out.println(linkedList);

        System.out.print("Возвращаем первый элемент из очереди, удаляя его: " + dequeue(linkedList) + '\n');
        System.out.println(linkedList);

        System.out.print("Возвращаем первый элемент очереди, не удаляя: " + first(linkedList) + '\n');
        System.out.println(linkedList);
    }
}
