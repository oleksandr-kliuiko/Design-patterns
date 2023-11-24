package CreationalPatterns.Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("singleton");
        Singleton singleton2 = Singleton.getInstance("singleton2");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);
    }
}
