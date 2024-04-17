package task1;

import java.util.LinkedList;

class LLTasks {
    public static LinkedList<Object> revert(LinkedList<Object> ll) {
        // Напишите свое решение ниже
        LinkedList<Object> reverseLL = new LinkedList<>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            reverseLL.add(ll.get(i));
        }
        return reverseLL;
    }
}