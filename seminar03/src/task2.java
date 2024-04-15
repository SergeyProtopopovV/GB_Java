//Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
//Вывести название каждой планеты и количество его повторений в списке.

import java.util.ArrayList;
import java.util.List;

public class task2 {

    public static void main(String[] args) {
        getReapetedPlanets();
    }

    public static void getReapetedPlanets() {
        List <String> planets = List.of("Марс", "Земля", "Венера", "Меркурий", "Марс", "Венера", "Земля");
        List <Integer> counts = new ArrayList<>();
        List <String> resultPlanets = new ArrayList<>();
        for (String planet: planets) {
            int position = resultPlanets.indexOf(planet);
            if (position >= 0) {
                counts.set(position, counts.get(position) + 1);
            } else {
                resultPlanets.add(planet);
                counts.add(1);
            }

        }
        System.out.println(resultPlanets);
        System.out.println(counts);

    }
}
