import java.util.Scanner;

public class java_lap2_4 {
    //6421600042
    public static void main(String[] args) {
        float[][] arr2d = new float[4][4];
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Input arr2d :");
            for(int i =0; i < arr2d.length; i++)
                for(int j = 0; j < arr2d[i].length; j++)
                {
                    arr2d[i][j] = input.nextFloat();
                }
        }
        System.out.println("Transpose arr2d");

        for(int i = 0; i < arr2d.length; i++)
        {
            for(int j = 0; j < arr2d[i].length; j++)
            {
                System.out.print(arr2d[j][i]+" ");
            }
            System.out.println();
        }
    }
}
