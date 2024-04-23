package clients;

import java.time.LocalDate;

public class Animal {
    protected int id;
    protected String name;
    protected LocalDate birthdate;
    protected Owner owner;

    public Animal(int id, String name, LocalDate birthdate, Owner owner) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.owner = owner;
    }
}
