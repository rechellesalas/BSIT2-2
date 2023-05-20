import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
      // asking for inputs
        System.out.print("Input the First Integer: ");
        int no1 = in.nextInt();
        System.out.print("Input the Second Integer: ");
        int no2 = in.nextInt();
        System.out.print("Input the Third Integer: ");
        int no3 = in.nextInt();
        System.out.print("Input the Forth Integer: ");
        int no4 = in.nextInt();

        // if else statement
        if (no1 == no2 && no2 == no3 && no3 == no4)
        {
            System.out.println("Yehey!, All four numbers are equal!");
        }
         else
         {
             System.out.println("Oh no!, Numbers are not equal.");
         }

    }
}