package practices.myExamCloud;

public class Test {
    public static void main(String[] args) {
        outer: for (int x = 0; x < 2; x++) {
            middle: for (int y = 0; y < 2; y++) {
                inner: for (int z = 0; z < 2; z++){
                    if (y == x) {
                        System.out.println("X = "+ x +" Y = "+ y +" Z = "+ z);
                        break middle;
                    }
                }
            }
        }
    }
}
