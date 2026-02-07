package practiceExersices.week3.day3;

public class Computer {
    private String brand;
    private String model;
    private double price;

    public Computer(String brand, String model, double price) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("You must fill the brand name");
        }
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("You must fill the model name");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("The price should be positive");
        }

        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void displayInfor() {
        System.out.println("These are the computer specifications: ");
        System.out.println("Computer Brand: "+ brand);
        System.out.println("Model: "+ model);
        System.out.println("price: "+ price);
    }

    public static class Processor {
        private String type;
        private String speed;
        private String cores;

        public Processor(String type, String speed, String cores) {
            if (type == null || type.trim().isEmpty()) {
                throw new IllegalArgumentException("You must fill the type of the computer");
            }
            if (speed == null || speed.trim().isEmpty()) {
                throw new IllegalArgumentException("You must fill the speed of the computer");
            }
            if (cores == null || cores.trim().isEmpty()) {
                throw new IllegalArgumentException("Kindly specify the cores of the computer.");
            }

            this.type = type;
            this.speed = speed;
            this.cores = cores;
        }

        public void displayInfo() {
            System.out.println("Computer Type: "+ type);
            System.out.println("Speed: "+ speed);
            System.out.println("Cores: "+ cores);
        }
    }

    public class Memory {
        private String ram;
        private String storage;

        public Memory(String ram, String storage) {
            if (ram == null || ram.trim().isEmpty()) {
                throw new IllegalArgumentException("You must fill the ram of the computer");
            }
            if (storage == null || storage.trim().isEmpty()) {
                throw new IllegalArgumentException("You must fill the speed of the computer");
            }

            this.ram = ram;
            this.storage = storage;
        }

        public void displayInfo() {
            System.out.println("RAM: "+ ram);
            System.out.println("Storage: "+ storage);
        }
    }

    public static void main(String[] args) {
        Computer computer = new Computer("HP", "EliteBook", 25000);
        Processor processor = new Processor("HP", "380GH", "Intel Core i5");
        Computer.Processor memory = new Processor("HP", "380GH", "Intel Core i5");
        Computer computer1 = new Computer("HP", "EliteBook", 25000);
        Computer.Memory customMemory = computer.new Memory("16GB", "239SSD");

        computer.displayInfor();
        memory.displayInfo();
        customMemory.displayInfo();
    }
}
