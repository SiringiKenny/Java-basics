public class CarClient{
  public static void main(String[] args) {
        Car toyota = new Car("Red","Toyota");
        Car audi = new Car("Black","Audi");
        Car bmw = new Car("White","BMW");
        Car innova = new Car("Red","Innova");

        System.out.println("Number of cars sold : " + Car.noOfCarsSold());


        toyota.accelerate(10);
        toyota.accelerate(20);

        System.out.println("Current Speed : " + toyota.getCurrentSpeed());

        toyota.decelerate(10);
        toyota.decelerate(10);
        System.out.println("Current Speed : " + toyota.getCurrentSpeed());


        toyota.stop();
        System.out.println("Current Speed : " + toyota.getCurrentSpeed());



    }
}