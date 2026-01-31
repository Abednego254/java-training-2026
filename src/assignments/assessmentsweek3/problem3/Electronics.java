package assignments.assessmentsweek3.problem3;

public class Electronics extends Product {
    protected int warrantyPeriod;
    protected double powerConsumption;

    public Electronics(String productId, String name, double price, int stockQuantity, int warrantyPeriod, double powerConsumption) throws InvalidProductException {
        super(productId, name, price, stockQuantity);
        if (warrantyPeriod < 5) {
            throw new InvalidProductException("Electronics products have a minimum warranty of 5 months");
        }
        if (powerConsumption <= 0) {
            throw new InvalidProductException("Electronic products consume power. Cannot be negative");
        }

        this.warrantyPeriod = warrantyPeriod;
        this.powerConsumption = powerConsumption;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    @Override
    public double calculateDiscount() {
        double discount = 0.05 * price;
        System.out.println("Discount calculated: "+ discount +". Price After discount: "+ price);
        price -= discount;
        return discount;
    }

    @Override
    public String getProductType() {
        return "ELECTRONICS";
    }

    @Override
    public void reduceStock(int quantity) throws OutOfStockException {
        super.reduceStock(quantity);

    }

    @Override
    public void applyTax() {
        super.applyTax();
        System.out.println("Tax Applied ......");
        System.out.println("Final price: "+ price);
    }

    @Override
    public void displayProductInfo() {
        super.displayProductInfo();
        System.out.println("The warranty period: "+ getWarrantyPeriod());
        System.out.println("The power consumption rate in percentage: "+ getPowerConsumption());
    }
}
