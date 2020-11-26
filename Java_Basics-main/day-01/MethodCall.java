public class MethodCall{
    public static void main(String args[]){
        System.out.println("Before calling Method1");
        method1();
        System.out.println("After calling Method1");
    }

    static void method1(){
        System.out.println("Before calling Method2");
        method2();
        System.out.println("After calling Method2");
    }

    static void method2(){
        System.out.println("Before calling Method3");
        method3();
        System.out.println("After calling Method3");
    }

    static void method3(){
        System.out.println("Executing Method3");
    }


}