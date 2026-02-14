package practices.myExamCloud;

public class TestOne {
    public static void main(String[] args) {
        A1:
        for (int i = 0; i < 2; ++i) {
            A2:
            for (int j = -1; j < 2; ++j) {

                A3:
                for (int k = -1; k < 2; ++k) {
                    System.out.println("K " + k);
                    if ((i++ - k++) == 2) {
                        break;
                    }
                }
            }
        }
    }
}
