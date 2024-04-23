package task1;

//Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//Вывести данные по сотрудникам с фамилией Иванов.

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");
        System.out.println(map);
        Map<Integer, String> map1 = Map.of(123456, "Иванов", 321456, "Васильев",
                234561, "Петрова");
        System.out.println(map1);
        System.out.println(map.get(654321));
        map.put(654321, "Сидоров");
        System.out.println(map.get(654321));
        System.out.println(map.entrySet()); // Иттерируемый список
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            System.out.println(entry);
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            if (entry.getValue().equals("Иванов"))
                System.out.println(entry);
        }
    }
}