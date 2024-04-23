package Lesson_06.part2;

import java.util.*;

public class Ex001_Program {

    public static void main(String[] args) {
        // #region

        Lesson_06.part2.Worker w1 = new Lesson_06.part2.Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Lesson_06.part2.Worker w4 = new Lesson_06.part2.Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Lesson_06.part2.Worker w2 = new Lesson_06.part2.Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Lesson_06.part2.Worker w3 = new Lesson_06.part2.Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        // System.out.println(w1);
        // System.out.println(w2);
        // System.out.println(w3);
        //#endregion

        System.out.println(w1==w4);
        System.out.println(w1.equals(w4));
        var workers = new HashSet<Lesson_06.part2.Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
        
    }
}