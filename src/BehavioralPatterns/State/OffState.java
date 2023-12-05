package BehavioralPatterns.State;

public class OffState implements State {
    private LightContext context;

    public OffState(LightContext context) {
        this.context = context;
    }

    @Override
    public void turnOn() {
        System.out.println("Вмикаємо світло");
        context.setState(new OnState(context));
    }

    @Override
    public void turnOff() {
        System.out.println("Світло вже вимкнене");
    }
}
