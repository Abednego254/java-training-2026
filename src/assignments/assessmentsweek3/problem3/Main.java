package assignments.assessmentsweek3.problem3;

public class Main {
    public static void main(String[] args) {
        try {
            Product laptop = new Electronics("00001", "Laptop", -999.99, 10, 20, 45);
            Product clothing = new Clothing("00002", "Polo Shirt", 1000, 20, "XL", "Jeans", "red");
            Product book = new Books("00004", "Vumba", 800, 25, "Hassan Mwana Wa Ali", "Longhorn Publishers", "A12345");
            laptop.reduceStock(15);
            System.out.println();
            clothing.displayProductInfo();
        }
        catch (InvalidProductException | OutOfStockException e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
}
