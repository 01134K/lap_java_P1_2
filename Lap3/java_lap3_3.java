
import java.util.Scanner;
public class java_lap3_3 {
    //6421600042
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.print("Input Frist Number : ");
      String number1 = input.nextLine();

      System.out.print("Input Second Number :");
      String number2 = input.nextLine();
      int index1 = number1.length()-1;
      int index2 = number2.length()-1;
      int lnOfnumber = 0; 
      int sed = 0;
      String ans = "" ;
        if(number1.length() >= number2.length() )
        {
            lnOfnumber = number1.length();
        }
        else
        {
            lnOfnumber = number2.length();
        }
        for(int i = 0; i < lnOfnumber; i++)
        {
           int tmp1 = Integer.parseInt(number1.charAt(index1)+"");
           int tmp2 = Integer.parseInt(number2.charAt(index2)+"");
           int tmpsum = tmp1 + tmp2 + sed;
           
            if(tmpsum>9)
            {
                sed =1;
                tmpsum =tmpsum%10;
            }
            else
                sed = 0;
            ans =tmpsum+ans;     
            index1--;
            index2--;
            if(index1<0)
            {
               number1 = "0";
                index1 = 0;
            }
            else if(index2<0)
            {
               number2="0";
                index2 = 0;
            }
        }
        if(sed == 1)
            ans = 1+ans;
            System.out.println("Summation = "+ans);
    }
}