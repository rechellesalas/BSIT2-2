import java.util.*;
// main class
public class Main
{
    // main driver method
    public static void main(String [] args)
    {
        // taking input from standard input
        Scanner in = new Scanner(System.in);
        // asking for the input
        System.out.print("Please Input a Uppercase String: ");
        //line separator
        String line = in.nextLine();
        // converting the input string into Lowercase
        line = line.toLowerCase();
        // printing the lowercase string
        System.out.println(line);
    }
}