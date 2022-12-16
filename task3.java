//1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.

import java.util.Stack;

public class task3 {
    public static void printStack(Integer[] array) {
        Stack<Integer> stack = new Stack<>();
        for (Integer s : array) {
            stack.add(s);
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

    }

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, 4, 5 };
        printStack(array);
    }

}