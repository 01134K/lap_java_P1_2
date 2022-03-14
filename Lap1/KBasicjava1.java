import java.util.Scanner;
// 6421600042 
public class KBasicjava1{
public static void main(String[] args) {
    float Baht = 0;
    System.out.print("Input distance(km) : ");
    Scanner input = new Scanner(System.in);
    float km = input.nextFloat();
    if(km<=4)
    System.out.println("Delivery Fee = Free!!");
    else{
    if(km<=10)
    Baht = (km-4)*10;
    else
    Baht = ((km-4-6)*12)+60;
    String.format("%.2f",Baht) ;
    System.out.printf("Delivery Fee = %.2f",Baht);
}
}
}
