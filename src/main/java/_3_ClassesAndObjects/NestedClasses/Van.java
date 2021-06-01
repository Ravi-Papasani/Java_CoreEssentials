package _3_ClassesAndObjects.NestedClasses;

//Anonymous inner class
public class Van {
    private int wheels;
    private static int seats;
    private double weight;
    private double mileage;

    public boolean isTwoSeater(){
        return seats == 2;
    }

    public boolean isFourSeater(){
        return seats == 4;
    }

    public static void main(String[] args) {
        Car car = new Car() {
            public boolean isTwoSeater() {
                return seats >= 2;
            }
        };
    }
}
