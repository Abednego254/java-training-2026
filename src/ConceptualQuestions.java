public class ConceptualQuestions {
    /*
        ===============================================================
        The difference between method overloading and method overriding
        ================================================================
     */

    // This is method overloading
    public int multiply(int a, int b) {
        return a * b;
    }
    // The below method overloads the above one
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Now Method Overriding
    //Take an example of the following method:

    @Override
    public String toString() {
        return " ";
    }
    //The method above demonstrates toString overriding a built in java method

    /*
        ===================================
        Why fields are declared as private
        ===================================
     */

    public class Book{
        private String author;
        private int numberOfPages;
    }
    // Fields are declared as private so that we can restrict acces by members who are not part of this class
    // Also, to manage access to the data in a certain class

    /*
        =============================================
        When to use super keyword
        ==============================================
     */

    //Take an example of 2 classes. Animal, a super class and Dog the child class
    public class Animal {
        private String name;
        public Animal(String name) {
            this.name = name;
        }
    }
    //In order to be able to access the name variable in the super class, you make use of super. Check this out
    public class Dog extends Animal {
        private String color;
        public Dog(String name, String color) {
            super(name); // usage of the super keyword
        }
    }

    /*
    =======================================================
        Purpose of @Override annotation
        ======================================================
     */
    // @Override annotation is used when we need to override a method that is in a super class
    // For Example:
    public class AnimalOne {
        public void makeSound() {}
    }
    public class DogOne extends AnimalOne {
        @Override   // We have overriden the method in the super class AnimalOne
        public void makeSound() {}
    }

    /*
    ==============================================================
    How Encapsulation improves code mantainability
    ==============================================================
     */

    // Encapsulation restricts access to its private fields
    // But then, it provides public getters and setters for the private fields to make sure they are accessible
    // Here is an example
    public class Vehicle {
        private String color;

        public String getColor() {
            return color;
        }
        public void setColor(String color) {
            this.color = color;
        }
    }
}
