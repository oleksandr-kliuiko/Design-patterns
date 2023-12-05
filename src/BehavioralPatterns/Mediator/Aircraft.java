package BehavioralPatterns.Mediator;

public class Aircraft {
    private String name;
    private AirTrafficControl airTrafficControl;

    public Aircraft(String name, AirTrafficControl airTrafficControl) {
        this.name = name;
        this.airTrafficControl = airTrafficControl;
    }

    public void sendMessage(String message) {
        System.out.println(name + " відправляє повідомлення: " + message);
        airTrafficControl.sendMessage(message, this);
    }

    public void receiveMessage(String message) {
        System.out.println(name + " отримує повідомлення: " + message);
    }
}
