public class Operators{
    public static void main(String args[]){
        //Arithmetic Operators
        int result = 43 + 23;
        int product = 53 * 23;
        int modulo = 53 % 3;
        int divisionResult = 54 / 2;

        System.out.println("=============Arithmetic Operator Starts ==============");
        System.out.printf("The result of addition is %d %n ", result );
        System.out.printf("The result of product is %d %n ", product );
        System.out.printf("The result of remainder is %d %n ", modulo );
        System.out.printf("The result of division is %d %n ", divisionResult );
        System.out.println("=============Arithmetic Operator Ends ==============");

        //Relatonal Operators
        boolean greaterThan = 54 > 12;
        boolean lessThan = 23 > 342;
        boolean equalTo = 122 == 343;
        boolean notEqualTo = 234 != 231;
        
        System.out.println("=============Relational Operator Starts ==============");
        System.out.printf("Greater than result %s %n", greaterThan);
        System.out.printf("Greater than result %s %n", lessThan);
        System.out.printf("Greater than result %s %n", equalTo);
        System.out.printf("Greater than result %s %n", notEqualTo);
        System.out.println("=============Relational Operator Starts ==============");


        //Logical Operators
        System.out.println("=============Relational Operator Starts ==============");
        System.out.println("Logical AND " + (true && true));
        System.out.println("Logical OR " + (false || true));
        System.out.println("=============Relational Operator Starts ==============");



    }
}