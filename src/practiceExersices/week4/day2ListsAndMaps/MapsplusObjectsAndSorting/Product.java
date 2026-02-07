package practiceExersices.week4.day2ListsAndMaps.MapsplusObjectsAndSorting;

import java.util.*;

public class Product {
    int id;
    String name;
    double cost;

    public Product(int id, String name, double cost) throws IllegalArgumentException {
        if (id <= 0) {
            throw new IllegalArgumentException("Id cannot be negative!");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        if (cost <= 0) {
            throw new IllegalArgumentException("Cost cannot be negative!");
        }

        this.id = id;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return id +" | "+ name +" | "+ cost;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null) return false;
        if (getClass() != object.getClass()) return false;

        Product product = (Product) object;
        return id == product.id &&
                Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public static void main(String[] args) {
        try {
            Map<Integer, Product> productMap = new HashMap<>();
            productMap.put(1, new Product(201, "Laptop", 95000));
            productMap.put(2, new Product(202, "Phone", 55000));
            productMap.put(3, new Product(203, "Headphones", 8000));
            productMap.put(4, new Product(204, "Monitor", 32000));
            productMap.put(5, new Product(205, "Keyboard", 4500));
            productMap.put(6, new Product(206, "Mouse", 2000));
            productMap.put(7, new Product(201, "Laptop", 95000));

            List<Product> productList = new ArrayList<>(productMap.values());

            System.out.println("The original list of products");
            for (Product product : productList) {
                System.out.println(product);
            }

            Iterator<Product> iterator = productList.iterator();
            while (iterator.hasNext()) {
                Product product = iterator.next();
                if (product.cost < 5000) {
                    iterator.remove();;
                }
            }

            System.out.println("\nList 0f products costing more than 5000");
            for (Product product : productList) {
                System.out.println(product);
            }

            Comparator<Product> sortByCostDesc = (s1, s2) -> Double.compare(s2.cost, s1.cost);
            Collections.sort(productList, sortByCostDesc);

            System.out.println("\nSorted list by cost descending");
            for (Product product : productList) {
                System.out.println(product);
            }

            Set<Product> productSet = new HashSet<>(productList);

            System.out.println("\nThe Employee set");
            for (Product product : productSet) {
                System.out.println(product);
            }
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }
    }
}
