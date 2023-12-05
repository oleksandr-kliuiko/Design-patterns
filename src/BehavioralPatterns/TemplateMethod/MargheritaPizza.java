package BehavioralPatterns.TemplateMethod;

public class MargheritaPizza extends PizzaTemplate {
    @Override
    protected void prepareDough() {
        System.out.println("Приготовлення тонкого тіста");
    }

    @Override
    protected void addSauce() {
        System.out.println("Додавання томатного соусу");
    }

    @Override
    protected void addToppings() {
        System.out.println("Додавання свіжого базиліку та моцарели");
    }

    @Override
    protected void bakePizza() {
        System.out.println("Випікання при 400 градусах протягом 15 хвилин");
    }

    @Override
    protected void deliverPizza() {
        System.out.println("Доставка піци Маргаріта");
    }
}
