package HomeWorks.HomeWork06;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;

public class Task01 {
    public static void main(String[] args) {
        Laptop laptop1=new Laptop("Vivobook",1000,"ASUS");
        laptop1.setColor("metallic");
        laptop1.setHDD(512);
        laptop1.setOS("Windows 11");
        laptop1.setRAM(16);

        Laptop laptop2=new Laptop("MacBook Air 13", 2000,"Apple");
        laptop2.setColor("gray");
        laptop2.setHDD(256);
        laptop2.setOS("macOS Big Sur");
        laptop2.setRAM(8);

        Laptop laptop3=new Laptop("RedmiBook 14 II",3000,"Xiaomi");
        laptop3.setColor("gray");
        laptop3.setHDD(512);
        laptop3.setOS("Windows 11");
        laptop3.setRAM(16);

        Laptop laptop4=new Laptop("Spectre X360",4000,"HP");
        laptop4.setColor("black");
        laptop4.setHDD(512);
        laptop4.setOS("Windows 11");
        laptop4.setRAM(16);

        Laptop laptop5=new Laptop("ThinkPad X1",5000,"Lenovo");
        laptop5.setColor("black");
        laptop5.setHDD(512);
        laptop5.setOS("Windows 10 Pro");
        laptop5.setRAM(16);

        HashSet <Laptop> laptops = new HashSet<>(Arrays.asList(laptop1,laptop2,laptop3,laptop4,laptop5));
        HashSet <Laptop> result = new HashSet<>();

        System.out.print("Введите цифру, соответствующую необходимому критерию:\n1 - объем ОЗУ \n2 - Объем HDD \n3 - Операционная система \n4 - цвет \n5 - искать\n");
        Scanner scanner = new Scanner(System.in);
        Integer n = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, Object> filters = new HashMap<>();
        while(n!=5){
        if(n==1){
            System.out.println("Введите объем оперативной памяти");
            Integer temp = scanner.nextInt();
            scanner.nextLine();
            filters.put("RAM", temp);
        }
        if(n==2){
            System.out.println("Введите объем HDD" );
            Integer temp = scanner.nextInt();
            scanner.nextLine();
            filters.put("HDD", temp);
        }
        if(n==3){
            System.out.println("Введите ОС");
            String temp = scanner.nextLine();
            filters.put("OS", temp);
        }
        if(n==4){
            System.out.println("Введите цвет");
            String temp = scanner.nextLine();
            filters.put("color", temp);
        }

        System.out.print("Введите цифру, соответствующую необходимому критерию:\n1 - объем ОЗУ \n2 - Объем HDD \n3 - Операционная система \n4 - цвет \n5 - искать\n");
        n = scanner.nextInt();
        scanner.nextLine();
    }

        for (Entry<String, Object> entry : filters.entrySet()) {
            if(entry.getKey().equals("RAM")){
                Iterator iterator = laptops.iterator();
                while(iterator.hasNext()){
                    Laptop lap = (Laptop) iterator.next();
                    if(lap.getRAM()>=(Integer)entry.getValue()){
                        result.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("HDD")){
                Iterator iterator = laptops.iterator();
                while(iterator.hasNext()){
                    Laptop lap = (Laptop)iterator.next();
                    if(lap.getHDD()>=(Integer)entry.getValue()){
                        result.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("OS")){
                Iterator iterator = laptops.iterator();
                while(iterator.hasNext()){
                    Laptop lap = (Laptop)iterator.next();
                    if(lap.getOS().equals(entry.getValue())){
                        result.add(lap);
                    }
                }
            }
            if(entry.getKey().equals("color")){
                Iterator iterator = laptops.iterator();
                while(iterator.hasNext()){
                    Laptop lap = (Laptop)iterator.next();
                    if(lap.getColor().equals(entry.getValue())){
                        result.add(lap);
                    }
                }
            }
        }

            Iterator iterator = result.iterator();
            while(iterator.hasNext()){
                Laptop lap = (Laptop)iterator.next();
            System.out.println(lap.toString());
            System.out.println();
        }
    }
}
