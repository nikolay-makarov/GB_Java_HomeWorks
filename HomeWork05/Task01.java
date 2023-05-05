package HomeWorks.HomeWork05;

import java.util.ArrayList;
import java.util.HashMap;

/*
 * Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

public class Task01 {
    public static void addPhoneNumber(String key, String value, HashMap<String, ArrayList<String>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<String> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printPhoneBook(HashMap<String, ArrayList<String>> map){
        for (var item : map.entrySet()) {
            System.out.printf("%s: ", item.getKey());
            for(String el: item.getValue()){
                System.out.printf("%s; ", el);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        addPhoneNumber("Сидоров Алексей Петрович", "+7(982)999-88-77", phoneBook);
        addPhoneNumber("Сидоров Алексей Петрович", "+7(982)888-77-66", phoneBook);
        addPhoneNumber("Петров Сидор Алексеевич", "8(3456)78-90-11", phoneBook);
        addPhoneNumber("Алексеев Петр Сидорович", "+7(800)500-88-77", phoneBook);
        addPhoneNumber("Алексеев Петр Сидорович", "8(495)343-23-12", phoneBook);

        printPhoneBook(phoneBook);
    }
}
