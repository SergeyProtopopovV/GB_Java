//Реализовать стэк с помощью массива.
//Нужно реализовать методы:
//size(), empty(), push(), peek(), pop().

public class GBStack <T> { // <T> или <E> (вообще любая буква) означает что обертка будет работать с любым типом данных
    private int capacity = 2;
    private int size = 0;
    private int top = -1;
    private T[] values = (T[]) new Object[capacity];

    private void addCapacity() { // метод увеличевает размер стека
        capacity *= 2;
        T[] temp = (T[]) new Object[capacity];
        System.arraycopy(values, 0, temp, 0, values.length);
        values = temp;
    }

    public int size() {
        return size;
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(T element) {
        if (capacity == size) addCapacity();
        values[++top] = element;
        size++;
    }

    public T peek() {
        if (!empty()) return values[top];
        else throw new RuntimeException("стек пуст");
    }

    public T pop() {
        if (empty()) {
            throw new RuntimeException("стек пуст");
        } else {
            peek();
        }
        return values[top--];
    }

    @Override
    public String toString() {
        if (empty()) return "";
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < size(); i++) {
            builder.append(values[i]).append(", ");
        }

        return String.format("[%s]", builder);
    }
}
