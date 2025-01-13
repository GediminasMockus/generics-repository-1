package uzduotis4;

import static uzduotis4.ListOfNumbers.findWithMaxAverage;

public class Main {
    public static void main(String[] args) {

        ListOfNumbers listObject1 = new ListOfNumbers();
        listObject1.addNumber(11.5d);
        listObject1.addNumber(10.2d);
        listObject1.addNumber(23.7d);

        ListOfNumbers listObject2 = new ListOfNumbers();
        listObject2.addNumber(75d);
        listObject2.addNumber(14.8d);
        listObject2.addNumber(17.6d);
        listObject2.addNumber(12.5d);

        ListOfNumbers listObject3 = new ListOfNumbers();
        listObject3.addNumber(100d);

        ListOfNumbers result1 = findWithMaxAverage(listObject1, listObject2, listObject3);
        ListOfNumbers result2 = findWithMaxAverage(listObject1, listObject2);

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }

}

