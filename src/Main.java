import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integerList = new ArrayList<>();
        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("good morning");
        integerList.add(42);
        stringList.add("java programming");
        integerList.add(100);
        stringList.add("example string");
        integerList.add(7);
        stringList.add("openAI rocks");
        integerList.add(2025);
        stringList.add("learning is fun");
        integerList.add(10);


        printLists(stringList, integerList);

    }

    public static <T, V> void printLists(ArrayList<T> list1, ArrayList<V> list2) {
        int maxSize = Math.min(list1.size(), list2.size());

        for (int i = 0; i < maxSize; i++) {
            System.out.println("List 1: " + list1.get(i));
            System.out.println("List 2: " + list2.get(i));
        }
    }
}