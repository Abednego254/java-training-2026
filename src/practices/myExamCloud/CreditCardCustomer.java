package practices.myExamCloud;

public class CreditCardCustomer extends Customer {
    public static void main(String[] args) {
        CreditCardCustomer brad = new CreditCardCustomer();
        brad.customerId = "12122";
        System.out.println(brad.customerId);

        int[] myArray[] = {{100,8}, {19}, {}, {15,26,35}};
        int i[][] = new int[][] {{81,62,88}, {48,5,6}};
    }

    String getCustomerId() {
        return customerId;
    }
}
