class Parent {
    public Parent() {
        System.out.println("Inside the parent Called the default constructor with no args");
    }

    public Parent(String message) {

        System.out.println("Inside the parent called the constructor with args " + message);
    }
}

public class ConstructorChaining extends Parent {

    public ConstructorChaining() {
        System.out.println("Called the default constructor with no args");
    }

    public ConstructorChaining(String message) {
        super(message);
        System.out.println("Called the constructor with args " + message);
    }

    public static void main(String args[]) {

        new ConstructorChaining("Hello World");
    }
}
