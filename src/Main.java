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


        printLists(integerList);
        printLists(stringList);

    }

    public static <T> void printLists(ArrayList<T> list) {

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}