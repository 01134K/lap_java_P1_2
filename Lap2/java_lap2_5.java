import java.util.Scanner;

public class java_lap2_5 {
    //6421600042
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Number : ");
        int number = input.nextInt();
        int[][] arr2d = new int[number][];
        int tmp = 1;
        for (int i = 0; i < arr2d.length; i++)
        {
            arr2d[i] = new int[number];
            number--;
        }

        for(int i = 0; i < arr2d.length; i++)
        {
            for(int j = 0; j < arr2d[i].length; j++)
            {
                arr2d[i][j] = tmp;
                tmp++;
                System.out.print(arr2d[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
