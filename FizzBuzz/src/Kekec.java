import java.util.InputMismatchException;
import java.util.Scanner;

public class Kekec {
    public static void main(String [] args){
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Vnsei stevilo vecje od 0");
            int selectedNumber = input.nextInt();
            if(selectedNumber == 0)
            {
                System.out.println("Vnesi celo stevilo vecje od 0 ");
            }

            for( int i=1; i<= selectedNumber; i++)
            {
                if(i % 3 == 0 && i % 5 == 0)
                {
                    System.out.println("FizzBuzz");
                }
                else if (i % 3 == 0)
                {
                    System.out.println("Fizz");
                }
                else if(i % 5 == 0)
                {
                    System.out.println("Buzz");
                }
                else
                {
                    System.out.println(i);
                }

            }
        }
        catch (InputMismatchException e)
        {
            System.out.println("Vnesi  celo stevilo vecje od 0 - tekst ni dovoljen");
        }

    }
}
