import clients.Animal;
import clients.Owner;
import clients.impl.Cat;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Cat a = new Cat(1, "Murka", LocalDate.of(2018, 3, 3), new Owner());
        System.out.println(a.getName());
    }
}