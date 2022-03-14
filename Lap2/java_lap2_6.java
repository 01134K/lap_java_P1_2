import java.util.ArrayList;
import java.util.Scanner;

public class java_lap2_6 {
    //6421600042
    public static void main(String[] args) {
        int x = 0,tmp1 = 0,tmp2 = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("=====MENU=====");
        System.out.println("1) Add to back");
        System.out.println("2) Add at index");
        System.out.println("3) Edit");
        System.out.println("4) Remove by index");
        System.out.println("5) Remove by value");
        System.out.println("6) Exit");
        while(true)
        {   
            System.out.print("Select --->");
            x = input.nextInt();
            if(x == 6) break;
            switch (x) {
                case 1:
                System.out.print("Input Value : ");
                tmp1 = input.nextInt();
                list.add(tmp1);
                    break;

                case 2:
                System.out.print("Input indxe : ");
                tmp2 = input.nextInt();
                System.out.print("Input Value : ");
                tmp1 = input.nextInt();
                list.add(tmp2,tmp1);
                    break;

                case 3:
                System.out.print("Input indxe : ");
                tmp2 = input.nextInt();
                System.out.print("Input Value : ");
                tmp1 = input.nextInt();
                list.set(tmp2,tmp1);
                    break;

                case 4:
                System.out.print("Input indxe : ");
                tmp1 = input.nextInt();
                list.remove(tmp1);
                    break;

                case 5:
                System.out.print("Input Value : ");
                tmp1 = input.nextInt();
                list.remove(Integer.valueOf(tmp1));
                    break; 
            }
            for(int i : list)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
