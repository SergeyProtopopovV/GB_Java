package task2;

//В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
//
//        enqueue() - помещает элемент в конец очереди
//        dequeue() - возвращает первый элемент из очереди и удаляет его
//        first() - возвращает первый элемент из очереди, не удаляя
//        getElements() - возвращает все элементы в очереди

import java.util.LinkedList;

class MyQueue<T> {
    // Напишите свое решение ниже
    LinkedList<T> userQueue = new LinkedList<T>();
    public void enqueue(T element){
        // Напишите свое решение ниже
        userQueue.add(element);
    }

    public T dequeue(){
        // Напишите свое решение ниже
        return userQueue.removeFirst();
    }

    public T first(){
        // Напишите свое решение ниже
        return userQueue.getFirst();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return userQueue;
    }
}
