import java.util.Scanner;
// 6421600042 

public class KBasicjava2{

    public static void main(String[] args) {
        
        String STD = "00000000";
        String STDMAX = "00000000";
        float score = 0;
        float max = 0;
        
        while(true){
        System.out.print("Std ID :");
        Scanner input = new Scanner(System.in);

        STD = input.nextLine();
        
        if(STD.equals("Q"))break;
        System.out.print("Score = ");
        score = input.nextFloat();
            if(max < score)
            {
                max = score;
                STDMAX = STD;
            }
        }
        System.out.print("Maximum Score is "+max+" on "+STDMAX );

    }

}