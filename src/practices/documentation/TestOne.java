package practices.documentation;

public class TestOne {
    public static void main(String[] args) {
        System.out.println("a");
        try {
            System.out.println("b");
            throw new IllegalArgumentException();
        } catch (RuntimeException e){
            System.out.println("c");
        } finally {
            System.out.println("d");
        }
        System.out.println("e");
    }
}
