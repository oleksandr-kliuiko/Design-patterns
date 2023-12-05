package BehavioralPatterns.State;

public class Main {
    public static void main(String[] args) {
        LightContext light = new LightContext();

        light.turnOn();
        light.turnOff();
        light.turnOff();
        light.turnOn();
        light.turnOn();
    }
}
