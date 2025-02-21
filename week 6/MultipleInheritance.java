
interface Driveable {
    void drive();  
}


interface Flyable {
    void fly(); 
}


public class MultipleInheritance implements Driveable, Flyable {
   
    @Override
    public void drive() {
        System.out.println("The flying car is driving on the road.");
    }
   
    public void fly() {
        System.out.println("The flying car is flying in the sky.");
    }
   
    public static void main(String[] args) {
       
        MultipleInheritance myFlyingCar = new MultipleInheritance();
        myFlyingCar.drive();
        myFlyingCar.fly();
    }
}
