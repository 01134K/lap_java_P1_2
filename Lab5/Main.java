
import Lib.*;
import Lib.Number;

public class Main{

    public static void main(String[] args) {
        
        System.out.println("Welcome to My Program");
        Number n;
        n = new Number(4);
        System.out.println("N is : "+n.getn());
        System.out.println("N is zero = "+n.nISzero());
        System.out.println("N is positive = "+n.nISpositive());
        System.out.println("N is negative = "+n.nISnegative());
        System.out.println("N is Seven = "+n.nISeven());
        System.out.println("N is odd = "+n.nISodd());
        System.out.println("N is Sprime ="+n.nISprime());
       // n = new Number(4);
        System.out.println("N Factorial is ="+n.nFactorial());
        System.out.println("N Powtwo is ="+n.nPowtwo());
        System.out.println("N Sqrt is ="+n.nSqrt());
       // n = new Number(423);
       n.setn(12);
        System.out.println("N Plus is = "+n.nPlus());
        System.out.println("N Reverse is = "+n.nReverse());
        System.out.println("N Candivide is ="+n.nCandivide());
        System.out.println("N BNumber is = "+n.nBNumber());

    }
}



