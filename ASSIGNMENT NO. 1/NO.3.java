import java.util.*;
// main class
public class Main
{// main driver method
    public static void main(String[] args) {
        // taking input from standard output
        Scanner in = new Scanner(System.in);
        // asking for input
        System.out.print("Please input the number to be multiply: ");
        // line separator
        int no1 = in.nextInt();
        System.out.println("Results: ");

        // array loop
        for (int i = 0; i < 10; i++)
        {
            // printing and calculation
            System.out.println(no1 + "x" + (i+1) + "=" + (no1 * (i+1)));
        }

    }
}