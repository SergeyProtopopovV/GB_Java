import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.text.SimpleDateFormat;
import java.util.Date;

class BubbleSort {
    private static String log(String data) {

        String pattern = "yyyy-MM-dd hh:mm ";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        String message = date + data;
        return message;
    }


    private static FileWriter fileWriter(String mes) {
        try {
            FileWriter fw = new FileWriter("log.txt", true);
            fw.write(mes + "\n");
            fw.flush();

        } catch (IOException e) {
            System.out.println("ошибка записи");
        }
        return null;
    }

    public static void sort(int[] mas) {

        boolean isSorted = false;
        int buf;
        try {
            FileWriter fw = new FileWriter("log.txt", false);
            fw.write("");
            fw.flush();

        } catch (IOException e) {
            System.out.println("ошибка записи");
        }


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
            String mes = log(Arrays.toString(mas));
            fileWriter(mes);
        }
    }
}