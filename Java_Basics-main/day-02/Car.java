public class Car{
    private String color;
    private double speed;
    private String make;
    private String brand;
    private static long carsSold=0;

    public Car(String color,String brand){
        this.color=color;
        this.brand=brand;
        this.carsSold++;
    }

    public static long noOfCarsSold(){
        return Car.carsSold;
    }

    public void accelerate(double accelerateSpeed){
        this.speed += accelerateSpeed;
    }

    public void decelerate(double decelerateSpeed){
        this.speed -= decelerateSpeed;
    }

    public void stop(){
        this.speed=0;
    }

    public double getCurrentSpeed(){
        return this.speed;
    }
}