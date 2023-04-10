package lambda13;

public class Java8Tester {
    public static void main(String[] args) {

        //wihtout paranthesis
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        //with paranthesis
        GreetingService greetService2 = (message) -> System.out.println("Hello from second service " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    interface GreetingService {
        void sayMessage(String message);
    }
}
