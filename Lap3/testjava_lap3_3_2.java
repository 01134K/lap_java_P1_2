
import java.util.Scanner;
public class testjava_lap3_3_2 {
    //6421600042
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Input Frist Number : ");
      String number1 = input.nextLine();

      System.out.print("Input Second Number :");
      String number2 = input.nextLine();
      int lnOfnumber; 
      int zeroOfNumber = 0;
      String tme = "" ;
        if(number1.length() >= number2.length() )
        {
            lnOfnumber = number1.length();
            zeroOfNumber = number1.length() - number2.length();
            for(int i = number1.length() - number2.length() ; i < 0; i++)
            {
                if(zeroOfNumber >= 0)
                {
                    for(int j = 0; zeroOfNumber >= j; j--)
                    {
                        tme = tme + "0";
                    }
                    number2 = tme + number2;
                }
                        
            }
        }
        else
        {
            lnOfnumber = number2.length();
        }
        System.out.println("n1 = "+number1);
        System.out.println("n2 = "+number2);
        System.out.println("tme = "+tme);
        System.out.println("ln = "+lnOfnumber);
        System.out.println("n1 - n2 = "+zeroOfNumber);


        
    }
}
