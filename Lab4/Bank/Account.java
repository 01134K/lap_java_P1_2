
package Bank;
//6421600042
public class Account {
    private int id ;
    private double Balance ;
    private double annualInterestRate ;
  
    public int getId(){
        return this.id ;
    }

    public void setId(int id){
        this.id =  id ;
    }

    public double getBalance(){
        return this.Balance ;
    }

    public void setBalance(double Balance){
        this.Balance = Balance ;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate ;
    }

    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public Account(int id , double Balance , double annualInterestRate){

        this.id = id ;
        this.Balance = Balance ;
        this.annualInterestRate = annualInterestRate ;  
    }

    public boolean withdraw(double value){
        
        if(this.Balance >= value){
            this.Balance = this.Balance - value ;
            System.out.println("Withdraw "+value+" from Account ID : "+this.id);
            return true ;
        }
        else return false ;

    }

    public void deposit(double value){
        System.out.println("Deposit "+value+" from Account ID : "+this.id);
        this.Balance = this.Balance + value ;

    }
 
}
