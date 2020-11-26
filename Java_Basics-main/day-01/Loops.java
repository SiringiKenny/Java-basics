public class Loops{
    public static void main(String args[]){
        //for loop
        for(int index = 0; index < 10 ; index ++){
            System.out.println("The value is"  + index);
        }

        int[] items = new int[]{11, 22, 33, 44};

        for(int value: items)
         System.out.println("For each loop "+ value);

        //while
        int initialValue = 0;
        while(initialValue < items.length-1){
            System.out.println("While loop "+ items[initialValue++]);
        }

        //do while
        do{
            System.out.println("While loop "+ items[initialValue++]);

        } while(initialValue < items.length-1);
    }
}