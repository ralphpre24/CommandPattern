public class Light {
    private boolean isOn;

    public Light() {
        this.isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Light is now turned ON.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Light is now turned OFF.");
    }

    public void showStatus() {
        if (isOn) {
            System.out.println("Light: ON.");
        } else {
            System.out.println("Light: OFF.");
        }
    }
}