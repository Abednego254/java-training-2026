package assignments.assessmentsweek3.problem3;

public class Clothing extends Product {
    private String size;
    private String material;
    private String color;

    public Clothing(String productId, String name, double price, int stockQuantity, String size, String material, String color) throws InvalidProductException {
        super(productId, name, price, stockQuantity);

        if (size == null || !size.trim().matches("[A-Za-z0-9]{2}")) {
            throw new InvalidProductException("The size should be exactly 2 characters.");
        }
        if (material == null || material.trim().isEmpty()) {
            throw new InvalidProductException("Kindly add the missing field, material");
        }
        if (color == null || color.trim().isEmpty()) {
            throw new InvalidProductException("Kindly add the missing field color.");
        }

        this.size = size;
        this.material = material;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public double calculateDiscount() {
        double discount = 0.03 * price;
        System.out.println("Discount calculated. The discount: "+ discount);
        price -= discount;
        System.out.println("Price after discount: "+ price);
        return discount;
    }

    @Override
    public String getProductType() {
        return "CLOTHING";
    }

    @Override
    public void reduceStock(int quantity) throws OutOfStockException {
        super.reduceStock(quantity);
    }

    @Override
    public void applyTax() {
        super.applyTax();
        System.out.println("Tax applied ...");
        System.out.println("Final Price: "+ price);
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("Size: "+ getSize());
        System.out.println("Material: "+ getMaterial());
        System.out.println("Color: "+ color);
    }
}
