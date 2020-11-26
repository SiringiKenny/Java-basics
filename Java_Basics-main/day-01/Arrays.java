public class Arrays{
    public static void main(String Args[]){
        int [] numbers = new int [10];
        numbers[2] = 21;
        numbers[3] = 21;

        int [] values =  {11, 22, 33, 44, 55};

        System.out.println(values[2]);

        //Iterate over an Array
        for(int index = 0; index < numbers.length; index++){
           System.out.println("The numbers at numbers["+index+"] "+ "is "+ numbers[index] );
        }
    }
}