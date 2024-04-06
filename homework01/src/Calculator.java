class Calculator {
    public float calculate(char op, int a, int b) {
        // Введите свое решение ниже
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a - b;
        } else if (op == '/') {
            return (float) a / b;
        } else if (op == '*') {
            return a * b;
        }
        return a;
    }
}



