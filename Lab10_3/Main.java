import java.util.Scanner;

public class Main{

    public static int fibonacci(int i){
        if(i == 0)return 0;
        if(i == 1)return 1;

        return fibonacci(i-1) + fibonacci(i-2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please input i : ");
        int i = input.nextInt();
        System.out.println("Value of "+i+" th Fibonacci = "+fibonacci(i));
    }
}