package practices.documentation;

import java.util.function.Predicate;

public class TestTwo {
    private static boolean test(Predicate<Integer> p) {
        return p.test(5);
    }

    public static void main(String[] args) {
        System.out.println(test(i -> i == 5));
        System.out.println(test((i) -> i == 5));
        System.out.println(test((i) -> {return i == 5;}));
        System.out.println(test(i -> {return i == 5;}));
    }
}
