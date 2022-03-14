import java.util.Scanner;
// 6421600042 
public class KBasicjava4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int number = input.nextInt();
        int i,j,spacebar=0,count=0,k;
        for(j=1;j<=number/2;j++)
        {    
            for(i=0;i<spacebar;i++)
            {
                System.out.print(" ");
            }
            for(i=0;i<j;i++)
            {
                System.out.print("*");
                count++;
            }
            System.out.println();
            spacebar++;
        }
    /*------------------------------------------------------*/    
        k=j;
        for(j=1;j<=number/2+1;j++)
        {    
            for(i=0;i<spacebar;i++)
            {
                System.out.print(" ");
            }
            for(i=0;i<k;i++)
            {
                System.out.print("*");
                count++;
            }
            System.out.println();
            spacebar--;
            k--;
        }
        System.out.println("Cout of * is "+count);      
}
}
