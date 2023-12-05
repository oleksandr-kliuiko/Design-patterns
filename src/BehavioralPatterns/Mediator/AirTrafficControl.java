package BehavioralPatterns.Mediator;

public interface AirTrafficControl {
    void sendMessage(String message, Aircraft aircraft);
    void addAircraft(Aircraft aircraft);
}
