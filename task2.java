import java.util.LinkedList;
import java.util.Scanner;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

public class task2 {
    static LinkedList<Integer> fillList(int N) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        return list;
    }

    static LinkedList<Integer> enqueue(LinkedList<Integer> inputList) {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        inputList.add(n);
        scanner.close();
        return inputList;
    }

    static int dequeue(LinkedList<Integer> list){
        int firstNumber = list.getFirst();
        list.removeFirst();
        return firstNumber;
    }

    static int first(LinkedList<Integer> list){
        int firstNumber = list.getFirst();
        return firstNumber;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list = fillList(10);
        System.out.println(enqueue(list));
        System.out.println(dequeue(list));
        System.out.println(list);
        System.out.println(first(list));
    }
}