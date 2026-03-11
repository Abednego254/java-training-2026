package practiceExersices.week4.day1Generics;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = new List<>();
        stringList.add("Malcolm");
        System.out.println("STRING: "+ stringList.getList());

        List<Integer> integersList = new List<>();
        integersList.add(1);
        System.out.println("INTEGER: "+ integersList.getList());

        List<Double> doubleList = new List<>();
        doubleList.add(1.1);
        System.out.println("DOUBLE: "+ doubleList.getList());

        List<Object> objectList = new List<>();
        objectList.add(123);
        System.out.println("OBJECT: "+ objectList.getList());
    }
}
