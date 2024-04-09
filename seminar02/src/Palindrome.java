//Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом
// (возвращает boolean значение).


import java.util.Arrays;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("а роза упала на лапу   АзорА"));
    }

    public static boolean isPalindrome(String str){
        str = str.replace(" ", "").trim().toLowerCase();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            int length = charArray.length;
            if (str.charAt(i) != str.charAt(length - i - 1)) {
                System.out.println("Это не палиндром");
                return false;
            }
        }
        System.out.println("Это палиндром");
        return true;
    }
}