package task3;

//В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
//
//        Отмена последней операции должна быть реализована следующим образом:
//        если передан оператор '<' калькулятор должен вывести результат предпоследней операции.

import java.util.ArrayDeque;
import java.util.Deque;

class Calculator {
    ArrayDeque<Float> results = new ArrayDeque<Float>();
    public float calculate(char op, int a, int b) {
        // Введите свое решение ниже
        if (op == '+') {
            float result = a + b;
            results.add(result);
            return result;
        } else if (op == '-') {
            float result = a - b;
            results.add(result);
            return result;
        } else if (op == '/') {
            float result = (float) a / b;
            results.add(result);
            return result;
        } else if (op == '*') {
            float result = a * b;
            results.add(result);
            return result;
        } else if (op == '<') {
            results.pollLast();
            float result = results.pollLast();
            return result;
        } else {
            return 0;
        }
    }
}

