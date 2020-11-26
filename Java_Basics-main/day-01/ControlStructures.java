public class ControlStructures{
    public static void main(String args[]){

        boolean flag = false;

        if(flag)
          System.out.println("Value is False");
        else
          System.out.println("Value is true");

        String dayOfTheWeek = "wednesday";

        if(dayOfTheWeek == "sunday" || dayOfTheWeek == "saturday")
          System.out.println("It's a Weekend");
        else if(dayOfTheWeek == "Monday")
          System.out.println("Beggining of the week");
        else if(dayOfTheWeek == "Tuesday")
          System.out.println("Settling down");
        else if(dayOfTheWeek == "wednesday")
          System.out.println("Balanced day");
        else          
          System.out.println("Preparing for the weekend");

          //Switch Case
          switch(dayOfTheWeek) {
              case "Monday" :  System.out.println("Begining of the week");

              break;
              case "Tuesday" :  System.out.println("Settling down");

              break;

              case "wednesday" :  System.out.println("Balanced day");
              break;
              default: System.out.println("Default Case");
              
              

          }
          
          
          

        
          

    }
}