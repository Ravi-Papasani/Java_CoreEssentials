package _3_ClassesAndObjects.NestedClasses;

public class Local {
    public static void main(String[] args) {
        class Foo {
            int x;
        }
        Foo f  = new Foo();
        f.x = 10;
    }
}
