import java.util.*;
public class Main

{
    static int SumMeth(int no1, int no2){
        return no1 + no2;
    }

    static double DoubleMeth(double doubleNo1, double doubleNo2){
        return doubleNo1 + doubleNo2;
    }

    static double ProductofSums(int SumMeth, double DoubleMeth) {return SumMeth * DoubleMeth;}
}

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int no1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int no2 = input.nextInt();

        System.out.print("Enter first double: ");
        double doubleNo1 = input.nextDouble();

        System.out.print("Enter second double: ");
        double doubleNo2 = input.nextDouble();

        System.out.println("Result for sum of integers: " + SumMeth(no1, no2));
        System.out.println("Result for sum of doubles: " + DoubleMeth(doubleNo1, doubleNo2));
        System.out.print("Result for product of sums: " + ProductofSums(SumMeth(no1, no2), DoubleMeth(doubleNo1, doubleNo2)));
    }
}