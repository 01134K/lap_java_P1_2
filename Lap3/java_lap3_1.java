
import java.util.Scanner;
public class java_lap3_1 {
    //6421600042
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input String 1 : ");
        String str1 = input.nextLine();

        System.out.print("Input String 2 : ");
        String str2 = input.nextLine();

         if(str1.toUpperCase().equals(str2.toUpperCase()))
         {
            System.out.println("The two strings are equal.");
         }
         else
         {
            System.out.println("The two strings are NOT equal.");
         }

    }
}
