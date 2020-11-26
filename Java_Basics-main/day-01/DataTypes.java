public class DataTypes{
    public static void main(String args[]){

        // Whole Numbers -Unsigned :Negative and Positive
        byte  byteValue=77; // 1 byte - 8 bits
        short shortValue=400;// 2 byte - 16 bits
        int intValue=20;// 4 byte - 32 bits
        Long longValue=233434L;// 8 byte -64 bits

        // Real Numbers
        double doubleValue=3243.67733;// 8 bytes
        float floatValue=324.45F;// 4 bytes

        // boolean (true|false)
        boolean flag=true; // 1 byte (only one bit will be used)

        //characters
        char charValue='c'; // 2 bytes- Signed : Only Positive

        System.out.println("Integer value is : "+ intValue);
    }
}