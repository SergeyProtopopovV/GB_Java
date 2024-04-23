package clients.impl;

import clients.Animal;
import clients.Owner;

import java.time.LocalDate;

public class Cat extends Animal {
    public Cat(int id, String name, LocalDate birthdate, Owner owner) {
        super(id, name, birthdate, owner);
    }

    public String getName() {
        return name;
    }
}
