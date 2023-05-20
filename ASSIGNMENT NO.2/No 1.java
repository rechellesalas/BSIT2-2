import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = input.nextLine();

        System.out.print("Enter the word you want to be replaced: ");
        String wordRep = input.nextLine();

        System.out.print("Enter the word for the replacement: ");
        String newWord = input.nextLine();
        String newSentence = sentence.replace(wordRep, newWord);

        System.out.println("Result: ");

        String[] word = sentence.split("\\s");
        int wordCount = word.length;
        System.out.println("Number of words in the string: " + wordCount);
        System.out.println("Revised sentence: " + newSentence.toUpperCase());
    }
}