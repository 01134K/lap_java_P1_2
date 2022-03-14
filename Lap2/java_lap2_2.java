import java.util.Scanner;

public class java_lap2_2 {
    //6421600042
    public static void main(String[] args) {
        String[] user = new String[4];
        try (Scanner input = new Scanner(System.in)) {
			for(int i = 0; i < user.length; i++)
			{
			    System.out.print("Please input nisit["+i+"] : ");
			    user[i] = input.nextLine();
			}
		}
        for(int i = 0; i < user.length; i++)
        {
             System.out.println(user[i]);
        }
    }
}
