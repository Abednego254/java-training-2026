package practiceExersices.week4.day2ListsAndMaps;

import java.util.*;

public class IteratorPlusCollection {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(100, 75, 75, 45, 54, 45, 38, 54, 10, 65));

        System.out.println("Original List: "+ numbers);
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            if (number < 50) {
                iterator.remove();
            }
        }
        System.out.println("List after removing numbers less than 50: : "+ numbers);

        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        System.out.println("Remaining numbers without duplicates: "+ uniqueNumbers);
    }
}
