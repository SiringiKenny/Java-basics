public class MethodOverloading{
    public void sum(int a, int b){
        System.out.println("The result of addition is 1 : "+(a+b));
    }

    public void sum(long a, long b){
        System.out.println("The result of addition is 2 "+(int)(a+b));
    }

    public int sum(int a, int b,int c){
        System.out.println("The result of addition is "+(a+b+c));
        return a+b+c;
    }
    
    public void sum(String a, String b){
        System.out.println("The result of addition is "+(a+b));
    }
    
    public static void main(String args[]){
        MethodOverloading demo = new MethodOverloading();
        demo.sum(22,21,23);
        demo.sum(4,5);
    }

}