import java.util.*;
// main class
public class Main
{
    public static void main(String[] args)
    {
        // asking for the inputs
        Scanner in = new Scanner(System.in);
        System.out.print("Please input the First Variable: ");
        double no1 = in.nextDouble();
        System.out.print("Please inout the Second Variable: ");
        double no2 = in.nextDouble();
        System.out.print("The Result of the two variables is: ");
        System.out.println(no1 > 0 && no1 < 1 && no2 > 0 && no2 < 1);
    }
}
