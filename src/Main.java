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

    public static void printLists(ArrayList<String> stringList, ArrayList<Integer> integerList) {
        System.out.println("String List:");
        for (String str : stringList) {
            System.out.println(str);
        }

        System.out.println("\nInteger List:");
        for (Integer num : integerList) {
            System.out.println(num);
        }
    }
}