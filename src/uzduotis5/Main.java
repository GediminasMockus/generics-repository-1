package uzduotis5;

public class Main {
    public static void main(String[] args) {

        SuperPair<String, String, Integer> pair1 = new SuperPair<>("Hello", "World", 42);
        SuperPair<Integer, Double, Float> pair2 = new SuperPair<>(10, 20.5, 30.0f);
        SuperPair<String, Boolean, Double> pair3 = new SuperPair<>("Key", true, 15.75);


        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);


        // SuperPair<String, String, String> invalidPair = new SuperPair<>("Test", "Fail", "Not a number");

    }
}

