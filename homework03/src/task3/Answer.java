package task3;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;


class Answer {
    public static void analyzeNumbers(Integer[] arr) {
        // Введите свое решение ниже
        ArrayList<Integer> convertedList = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(convertedList);
        System.out.println(convertedList);
        System.out.printf("Minimum is %d\n", convertedList.getFirst());
        System.out.printf("Maximum is %d", convertedList.getLast());

    }
}
