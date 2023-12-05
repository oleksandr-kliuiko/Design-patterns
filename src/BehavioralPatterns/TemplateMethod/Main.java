package BehavioralPatterns.TemplateMethod;

public class Main {
    public static void main(String[] args) {
        PizzaTemplate margherita = new MargheritaPizza();
        margherita.makePizza();

        System.out.println();

        PizzaTemplate pepperoni = new PepperoniPizza();
        pepperoni.makePizza();
    }
}
