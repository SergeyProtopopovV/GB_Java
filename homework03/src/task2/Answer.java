package task2;

import java.util.Arrays;
import java.util.ArrayList;

class Answer {
    public static void removeEvenNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> convertedList = new ArrayList<>(Arrays.asList(arr));
        ArrayList<Integer> evenList = new ArrayList<>();
        for (int i = 0; i < convertedList.size(); i++) {
            if (convertedList.get(i) % 2 != 0) {
                evenList.add(convertedList.get(i));
            }
        }
        System.out.println(evenList);
    }
}
