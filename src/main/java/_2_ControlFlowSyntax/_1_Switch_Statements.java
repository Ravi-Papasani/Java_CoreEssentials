package _2_ControlFlowSyntax;

public class _1_Switch_Statements {
    public static void main(String[] args) {

        //If statement
       /*
        if ( a > b)  b = 0;

        if (a > b){
        System.out.println("a is greater");
        b = 0;
        }
       * */


        //if-else statement
        /*
         if (a > b){
        System.out.println("a is greater");
        }else if (a < b){
        System.out.println("a is lesser");
        }else {
        System.out.println("a and b are equal");
        }
        * */


        //Nested ifs

        /*
          if (a > b){
        System.out.println("a is greater");
        if (isTooBig(a)) System.out.println("a is too big");
        }else if (a < b){
        System.out.println("a is lesser");
        }else {
        System.out.println("a and b are equal");
        }
        * */


        //Switch Statement
        /*
        switch (a) {
            case 0:
                System.out.println("a is 0");
                break;
            case 1:
                System.out.println("a is 1");
                break;
            case 2:
                System.out.println("a is 2");
                break;
            default:
                System.out.println("a is >= 3");
        }
        */

        //Switch fall-through pattern
        /*
        switch (a) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("a is an even number less than 10");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("a is an odd number less than 10");
                break;
            default:
                System.out.println("a is greater than 10");
        }
        */

        //Switch value
       /*
        switch (value){
            //value supported => byte, short, char, int, String, Enum
        }
        */


        //Switch expression, which returns a value (java 14 feature)
        /*
        int numLetters = switch (day) {
            case MONDAY, FRIDAY, SUNDAY -> 6;
            case TUESDAY                -> 7;
            case THURSDAY, SATURDAY     -> 8;
            case WEDNESDAY              -> 9;
        };

        Notes:
        => No break required - no fall through
        => Switch expression - returns value
        => Possible to declare same variable in multiple 'blocks'
        */




    }
}
