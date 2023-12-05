package BehavioralPatterns.State;

public class OnState implements State {
    private LightContext context;

    public OnState(LightContext context) {
        this.context = context;
    }

    @Override
    public void turnOn() {
        System.out.println("Світло вже увімкнене");
    }

    @Override
    public void turnOff() {
        System.out.println("Вимикаємо світло");
        context.setState(new OffState(context));
    }
}
