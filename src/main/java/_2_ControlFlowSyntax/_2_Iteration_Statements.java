package _2_ControlFlowSyntax;

public class _2_Iteration_Statements {
    public static void main(String[] args) {

        //Classic For Loop
        for (int i =0; i < 10; i++){
            System.out.println(i);
        }

        //Commas in for Loop
        int i,j;
        for(i = 0, j = 10; i < 10; i++, j--){
            System.out.println(i + j);
        }

        //For-each Loop
       /*
        for (type iterationVariable : collection) {
            block-statement;
        }
       */

        int randomNumbers[] = {122,45,35,28,96};
        int total = 0;

        //for (var number : randomNumbers) we can use var, which is type inference
        for (int number : randomNumbers) {
            total = total + number;
        }


        //Nested Loops
       /*
       int matrix[][] = new int[10][20];

        for (int i = 0; i < 10; i++) {
            for (int j =0; j < 20; j++){
                matrix[i][j] = i * j;
            }
        }
*/
        //Nested Loops with for-each
        int matrixx[][] = new int[10][20];

        for (int[] subArray : matrixx) {
            for (int element : subArray) {
                System.out.println("Element is " + element);
            }
        }

        //Usage of Classic for and for-each
       /*
       // Classic for
       => When index is needed
       => Mostly used in Arrays
       // for-each loop
       => when you need just the element
       => Mostly used in collection API
        */


        //While Loop
        /*
       while (condition) {
            //statements
        }
        */

        //Do-while Loop
        /*
        do {
           //statements
        }while (condition)
        */
        // At least the statement executes once in the do-while loop

       //Break
        /*
        for (int i = 0; i < 10; i++){
            if (i == 5) break;
            System.out.println(i); //i prints till 4
        }
        */

        //Continue
        /*
        for (int i = 0; i < 10; i++){
            if (i == 5) continue;
            System.out.println(i); //i prints 0 to 9 but skips 5
        }
        */

    }
}
