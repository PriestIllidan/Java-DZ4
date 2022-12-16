import java.util.LinkedList;

// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

public class task1 {
    static LinkedList<Integer> fillList(int N) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < N; i++) {
            list.add((int) (Math.random() * 10));
        }
        System.out.println(list);
        return list;
    }

    static void reversList(LinkedList<Integer> list) {
        LinkedList<Integer> reversList = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversList.add(list.get(i));
        }
        System.out.println(reversList);
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = fillList(10);
        reversList(list);
    }
}