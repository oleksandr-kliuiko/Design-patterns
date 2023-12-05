package BehavioralPatterns.State;

public class LightContext {
    private State state;

    public LightContext() {
        this.state = new OffState(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void turnOn() {
        state.turnOn();
    }

    public void turnOff() {
        state.turnOff();
    }
}
