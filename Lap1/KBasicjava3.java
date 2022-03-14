import java.util.Scanner;
// 6421600042 

public class KBasicjava3 {
    public static void main(String[] args) {
        int number = 0;
        int numberI = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Input your number ");
        number = input.nextInt();
        System.out.print("Your Encrytion Code =  ");
        while(number != 0){

            numberI =  number % 10;
            number = number / 10;
            
                if(numberI % 2 == 0)
                numberI++;
                else numberI--;
            System.out.print(numberI);
        }
        
        
    }
}
