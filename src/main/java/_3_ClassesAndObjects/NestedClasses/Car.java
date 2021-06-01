package _3_ClassesAndObjects.NestedClasses;

//Static nested class
public class Car {
    static class Wheel{

    }

    public static void main(String[] args) {
        Car myCar = new Car();
        Car.Wheel someCarWheel = new Car.Wheel();
        //someCarWheel = just an instance not associated with any car instance
    }
}
