public class Greeter {

    public void greet(Greeting greeting) {
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeting lambdaGreeting = () -> System.out.println("Hello World");
        lambdaGreeting.perform();
    }
}