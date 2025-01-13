package uzduotis4;

import java.util.ArrayList;
import java.util.List;

public class ListOfNumbers {
    private List<Double> numbers;

    public ListOfNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(Number number) {
        if (number != null) {
            this.numbers.add(number.doubleValue());
        }
    }

    public Double getAverage() {
        if (numbers.isEmpty()) {
            return null;
        }
        double sum = 0;
        for (Double number : numbers) {
            sum += number;
        }
        return sum / numbers.size();
    }

    public static ListOfNumbers findWithMaxAverage(ListOfNumbers... lists) {
        ListOfNumbers maxAverageList = null;
        Double maxAverage = null;

        for (ListOfNumbers list : lists) {
            Double average = list.getAverage();
            if (average != null && (maxAverage == null || average > maxAverage)) {
                maxAverageList = list;
                maxAverage = average;
            }
        }
        return maxAverageList;
    }

    @Override
    public String toString() {
        return "ListOfNumbers{" + "numbers=" + numbers +" average= "+ getAverage()+'}';
    }
}
