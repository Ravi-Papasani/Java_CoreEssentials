package _3_ClassesAndObjects.NestedClasses;


//Inner class ( Non-static nested class)
public class Jeep {
    class Wheel{

    }

    public static void main(String[] args) {
        Jeep myJeep = new Jeep();
        Jeep.Wheel myJeepWheel =  myJeep.new Wheel();
        //myJeepWheel = Not just any wheel! This is associated with the Jeep instance
    }
}
