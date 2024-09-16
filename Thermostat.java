public class Thermostat {
    private int temperature;

    public Thermostat() {
        this.temperature = 22;  // Default temperature
    }

    public void increaseTemperature() {
        temperature += 1;
        System.out.println("Raising temperature to " + temperature + "°C.");
    }

    public void decreaseTemperature() {
        temperature -= 1;
        System.out.println("Reducing temperature to " + temperature + "°C.");
    }

    public void showStatus() {
        System.out.println("Temp. Status: " + temperature + "°C.");
    }
}