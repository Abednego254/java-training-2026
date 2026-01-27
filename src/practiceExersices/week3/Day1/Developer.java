package practiceExersices.week3.Day1;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);

        if (programmingLanguage == null || programmingLanguage.trim().isEmpty()) {
            throw new IllegalArgumentException("Language must be filled!");
        }
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public double calculateBonus() {
        double bonus = 0.10 * getSalary();
        return bonus;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("LANGUAGE: "+ getProgrammingLanguage());
        System.out.println("BONUS: "+ calculateBonus());
    }
}
