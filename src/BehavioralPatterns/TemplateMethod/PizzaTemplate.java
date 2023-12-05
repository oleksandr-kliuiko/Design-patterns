package BehavioralPatterns.TemplateMethod;

public abstract class PizzaTemplate {
    public final void makePizza() {
        prepareDough();
        addSauce();
        addToppings();
        bakePizza();
        deliverPizza();
    }

    // Абстрактні методи, які підкласи повинні реалізувати
    protected abstract void prepareDough();

    protected abstract void addSauce();

    protected abstract void addToppings();

    protected abstract void bakePizza();

    protected abstract void deliverPizza();
}
