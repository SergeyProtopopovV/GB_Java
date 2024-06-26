package task2;

//Написать метод, который переводит число из римского формата записи в арабский.
//Например, MMXXII = 2022

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToArabic("MCMLXXXV"));
    }

    static int romanToArabic(String romanNum) { // "MCMLXXXV" 1985
        Map<String, Integer> map = Map.of(
                "I", 1,
                "V", 5,
                "X", 10,
                "L", 50,
                "C", 100,
                "D", 500,
                "M", 1000
        );
        int result = 0;
        List<Integer> numList = new ArrayList<>();
        String[] arrStr = romanNum.split("");
        for (int i = 0; i < arrStr.length; i++) {
            numList.add(map.get(arrStr[i]));
        }
        for (int i = 0; i < numList.size() - 1; i++) {
            if (numList.get(i) < numList.get(i + 1))
                result -= numList.get(i);
            else
                result += numList.get(i);
        }
        result += numList.getLast();
        return result;
    }
}
