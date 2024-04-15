//Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//
//Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
//
//int[] arr - числовой массив
//После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt'
//в формате год-месяц-день час:минуты {массив на данной итерации}.
//Для логирования использовать логгер logger класса BubbleSort.
//        Пример
//        arr = new int[]{9, 4, 8, 3, 1};
//sort(arr)
//
//// При чтении лог-файла получим:
// 2023-05-19 07:53 [4, 8, 3, 1, 9]
// 2023-05-19 07:53 [4, 3, 1, 8, 9]
// 2023-05-19 07:53 [3, 1, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]
// 2023-05-19 07:53 [1, 3, 4, 8, 9]

import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

class BubbleSort {
    private static File log(String data) {
        Logger logger = Logger.getLogger(BubbleSort.class.getName());
        try {
            FileHandler fh = new FileHandler("log.txt");
            logger.addHandler(fh);
        } catch (SecurityException | IOException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
    private static FileWriter fileWriter(String data) {
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file);
            fr.write(data);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return fr;
    }

    public static void sort(int[] mas) {

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
            log(Arrays.toString(mas));
        }
    }
}
