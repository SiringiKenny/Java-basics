import java.util.Scanner; 

public class ExceptionDemo {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter thi first number");
        int operand1 = sc.nextInt();
        
        System.out.println("Please enter the second number");
        int opernand2 = sc.nextInt();

        System.out.println("Please enter the number to fetch from the array");
        int index = sc.nextInt();
        int result = 0;
        int[] values = {11,22,33,44,55,66};
        int value = 0;
        try {
            result = (operand1 / opernand2);
            value = values[index];
        } catch (ArithmeticException exception){
            System.out.println("Handling the Arithmetic Exception gracefully");
            System.out.println("Please input a correct value.");
        } catch( ArrayIndexOutOfBoundsException ex){
            System.out.println(" Please choose a number between 0 and "+ (values.length - 1));
        }
        System.out.println(" The result of division is "+ result);
        System.out.println(" this message will not be printed if there is an exception");
        System.out.println(" The value at index is  "+value);
        sc.close();;
    }
}
