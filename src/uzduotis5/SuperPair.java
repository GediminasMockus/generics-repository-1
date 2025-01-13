package uzduotis5;

public class SuperPair<T1, T2, T3 extends Number> {
    private T1 first;
    private T2 second;
    private T3 third;

    public SuperPair(T1 first, T2 second, T3 third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "SuperPair{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }
}
