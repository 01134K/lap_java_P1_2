import java.util.ArrayList;
import Bank.*;
//6421600042
public class Main {
    
    public static void main(String[] args) {

        System.out.println("Welcome to My Program");
        
        //Client std[] = new Client[2];
        ArrayList<Client> Astd = new ArrayList<>();
        Astd.add(new Client( 144556677 , "Jame Panter" , "0811151511" )) ;
        Astd.get(0).addAccount(new Account( 4450123 , 20000 , 1.5 )) ;
        Astd.get(0).addAccount(new Account( 4450295 , 90000 , 2.0 )) ;

        Astd.add(new Client( 122338899 , "Camelo Antony" , "0899959599" )) ;
        Astd.get(1).addAccount(new Account( 4550234 , 10000 , 1.5 )) ;
        Astd.get(1).addAccount(new Account( 4550379 , 80000 , 3.0 )) ;
        Astd.get(1).addAccount(new Account( 4550987 , 50000 , 4.0 )) ;

        System.out.println(Astd.get(0).toString()+Astd.get(1).toString());

        double max = Astd.get(1).accounts.get(0).getBalance() ;

        Astd.get(1).accounts.get(0).withdraw(max) ;
        Astd.get(1).accounts.get(2).deposit(max) ;
        Astd.get(1).removeAccount(Astd.get(1).accounts.get(0).getId()) ;

        System.out.println(Astd.get(0).toString()+Astd.get(1).toString());
        /*std[0] = new Client( 144556677 , "Jame Panter" , "0811151511") ;
        std[0].addAccount(new Account( 4450123 , 20000 , 1.5 )) ;
        std[0].addAccount(new Account( 4450295 , 90000 , 2.0 )) ;
        
        std[1] = new Client( 122338899 , "Camelo Antony" , "0899959599") ;
        std[1].addAccount(new Account( 4550234 , 10000 , 1.5 )) ;
        std[1].addAccount(new Account( 4550379 , 80000 , 3.0 )) ;
        std[1].addAccount(new Account( 4550987 , 50000 , 4.0 )) ;

        System.out.println(std[0].toString()+std[1].toString());
       
        double max = std[1].accounts.get(0).getBalance();
        std[1].accounts.get(0).withdraw(max);
        std[1].accounts.get(2).deposit(max);
        std[1].removeAccount( std[1].accounts.get(0).getId());

        System.out.println(std[0].toString()+std[1].toString());*/
       
    }
}


//Client std[] = new Client[2];