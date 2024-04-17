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
        float sum = 0;
        for(int i = 0; i < convertedList.size(); i++)
            sum += convertedList.get(i);
        float average = sum / convertedList.size();
        System.out.printf("Minimum is %d\n", convertedList.get(0));
        System.out.printf("Maximum is %d\n", convertedList.get(convertedList.size() - 1));
        System.out.printf("Average is = %.1f", average);

    }
}
