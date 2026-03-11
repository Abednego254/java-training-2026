public class Main {
    public static void main(String[] args) {

        String a = new String("alice");
        String b = a;

        a = "John";
        System.out.println(a);
        System.out.println(b);
    }
}