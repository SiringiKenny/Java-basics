public class Methods{
    public static void main(String[] args){
        String name = args[0];
        greet(name);
        int result = calc(43,45);
        System.out.println("The result is " + result);
    }

    static void greet(String message){
        System.out.println("Hello "+message);
    }

    static int calc (int operand1, int operand2){
        return operand1 + operand2;
    }
}