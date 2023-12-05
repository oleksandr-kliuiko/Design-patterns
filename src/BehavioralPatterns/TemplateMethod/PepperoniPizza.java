package BehavioralPatterns.TemplateMethod;

public class PepperoniPizza extends PizzaTemplate {
    @Override
    protected void prepareDough() {
        System.out.println("Приготовлення товстого тіста");
    }

    @Override
    protected void addSauce() {
        System.out.println("Додавання соусу");
    }

    @Override
    protected void addToppings() {
        System.out.println("Додавання пепероні та сиру");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Випікання при 450 градусах протягом 20 хвилин");
    }

    @Override
    protected void deliverPizza() {
        System.out.println("Доставка піци Пепероні");
    }
}
