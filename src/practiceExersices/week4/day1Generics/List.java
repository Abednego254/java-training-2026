package practiceExersices.week4.day1Generics;

public class List <T> {
    private T list;

    public void add(T list) {
        this.list = list;
    }

    public T getList() {
        return this.list;
    }
}
