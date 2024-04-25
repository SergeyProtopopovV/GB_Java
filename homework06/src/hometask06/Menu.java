package hometask06;

// Меню работы с телефонной книгой
// пункты меню:
// 1. Добавить контакт
// 2. Найти контакт
// 3. Удалить телефон из контакта
// 4. Показать все контакты в порядке убывания количества телефонов
// 5. Выход

import java.util.Scanner;

public class Menu {
    private static PhoneBook phoneBook = new PhoneBook();
    private static Scanner scanner = new Scanner(System.in);

    public static void userChoice() {
        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Найти контакт");
            System.out.println("3. Удалить телефон из контакта");
            System.out.println("4. Показать все контакты в порядке убывания количества телефонов");
            System.out.println("5. Выход");
            System.out.println("Выберите пункт из меню (1-5):");
            String input = scanner.nextLine();
            if (input.equals("1")) {
                String name = contactName();
                String phone = contactPhone();
                phoneBook.add(name, phone);
                pressEnter();
            } else if (input.equals("2")) {
                String name = contactName();
                System.out.println(phoneBook.find(name));
                pressEnter();
            } else if (input.equals("3")) {
                String name = contactName();
                String phone = contactPhone();
                phoneBook.delete(name, phone);
                pressEnter();
            } else if (input.equals("4")) {
                PhoneBook.getPhoneBook();
                pressEnter();
            } else if (input.equals("5")) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Неверный ввод");
                pressEnter();
            }
        }
    }

    private static String contactName() {
        System.out.println("Введите имя контакта:");
        String name = scanner.nextLine();
        return name;
    }

    private static String contactPhone() {
        System.out.println("Введите номер телефона:");
        String phone = scanner.nextLine();
        return phone;
    }

    private static void pressEnter() {
        System.out.println("Для продолжения нажмите клавишу Enter");
        scanner.nextLine();
    }
}
