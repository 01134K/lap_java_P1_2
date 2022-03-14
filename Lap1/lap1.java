import java.util.Scanner;
public class lap1 {
    public static void main(String[] args) {
       

        String Std = "0" ;
        String MaxStd = "0" ;
        float MaxScore = 0;
        while (true)
        {
            
            System.out.print("Std ID : ");
            Scanner x = new Scanner(System.in);
            Std = x.nextLine();

            //if(Std.equals("Q")||Std.equals("q")) {break;}

            System.out.print("Score = ");

            Float Score = x.nextFloat();

                if(MaxScore < Score)
                {
                    MaxScore = Score;
                    MaxStd = Std ; 
                }

        }
       // System.out.print("Maximum Score is "+MaxScore+"on"+MaxStd);

    }

}