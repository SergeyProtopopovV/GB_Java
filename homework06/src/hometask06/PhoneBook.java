package hometask06;

import java.util.*;

class PhoneBook {
    private static HashMap<String, HashSet<String>> phoneBook = new HashMap<>();

    public void add(String name, String phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
            System.out.printf("Номер: %s добавлен к контакту: %s%n", phoneNum, name);
        } else {
            HashSet<String> numbers = new HashSet<>();
            numbers.add(phoneNum);
            phoneBook.put(name, numbers);
            System.out.printf("Добавлена запись, контакт: %s, телефон: %s%n", name, phoneNum);
        }
    }

    public void delete(String name, String phoneNum) {
        if (phoneBook.containsKey(name)) {
            HashSet<String> numbers = phoneBook.get(name);
            numbers.remove(phoneNum);
            phoneBook.put(name, numbers);
            System.out.printf("Удален номер: %s из контакта: %s%n", phoneNum, name);
        }
    }

    public HashSet<String> find(String name) {
        if (phoneBook.containsKey(name)) {
            return phoneBook.get(name);
        } else {
            System.out.println("Такого контакта нет.");
            return new HashSet<>();
        }
    }

    public static void getPhoneBook() {
        List<HashMap.Entry<String, HashSet<String>>> sortedEntries = new ArrayList<>(phoneBook.entrySet());
        sortedEntries.sort((entry1, entry2) -> Integer.compare(entry2.getValue().size(), entry1.getValue().size()));
        for (HashMap.Entry<String, HashSet<String>> entry : sortedEntries) {
            System.out.println(STR."\{entry.getKey()}: \{entry.getValue()}");
        }
    }
}