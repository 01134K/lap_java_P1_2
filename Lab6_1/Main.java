
import Lib.*;

public class Main{

    public static void main(String[] args) {
        
        MoveablePoint A = new MoveablePoint(0, 0, 10, 15);
        MoveablePoint B = new MoveablePoint(100, 120, 5, 12);
        System.out.println("A = " + A.toString());
        System.out.println("B = " + B.toString());
        A.backward();
        A.backward();
        B.forward();
        B.forward();
        System.out.println();
        System.out.println("Distance A to B = " + A.Distance(B));
            
    }
}



