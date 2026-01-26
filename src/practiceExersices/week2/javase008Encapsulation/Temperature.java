package practiceExersices.week2.javase006.javase008Encapsulation;

public class Temperature {
    private double celcius;

    public double getCelcius() {
        return celcius;
    }
    public void setCelcius(double celcius) {
        this.celcius = celcius;
    }
    double fahrenheit = 0;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    double kelvin = 0;
    public double getKelvin() {
        return kelvin;
    }

    public void setKelvin(double kelvin) {
        this.kelvin = kelvin;
    }

    public Temperature(double celcius){
        this.celcius = celcius;
    }

    public double calculateFahrenheit() {
        fahrenheit = (celcius * (9.0/5.0) + 32.0);
        return fahrenheit;
    }

    public double calculateKelvin() {
        kelvin = celcius + 273.15;
        return kelvin;
    }

    public void displayAllScales() {
        System.out.println("Celcius: "+ getCelcius());
        System.out.println("Fahrenheit: "+ calculateFahrenheit());
        System.out.println("Kelvin: "+ calculateKelvin());
    }

    public static void main(String[] args) {
        Temperature temperature = new Temperature(25);
        temperature.displayAllScales();
        System.out.println();

        temperature.setCelcius(40);
        temperature.displayAllScales();
        System.out.println();

        temperature.setFahrenheit(77.0);
        temperature.displayAllScales();
        System.out.println();

        temperature.setKelvin(300);
        temperature.displayAllScales();
        System.out.println();
    }

}
