
public class Main{

    public static void main(String[] args) {
        Account x = new Account();
        UserA a = new UserA(x);
        UserB b = new UserB(x);
        a.start();
        b.start();
    }
}

class Account{
    int balance ;
    public Account(){
        this.balance = 0;
    }
    synchronized public void deposit(int value){
        this.balance += value ;
        System.out.println("Deopsit "+value+" Balance : "+this.balance);
    }
    synchronized public void withdraw(int value){
        if(this.balance < value){
            System.out.println("Cant Withdraw "+value+" Balance : "+this.balance);

        }
        else{
            this.balance -= value ;
            System.out.println("withdraw "+value+" Balance : "+this.balance);
        }
    }
}
class UserA extends Thread{

    Account data ;
    public UserA(Account data){
        this.data = data ;
    }
    public void run(){
        for(int i = 0; i < 10; i++){
            data.deposit((int)(Math.random()*100));
        }

    }

}

class UserB extends Thread{

    Account data ;
    public UserB(Account data){
        this.data = data ;
    }

    public void run(){
        for(int i = 0; i < 10; i++){
            data.withdraw((int)(Math.random()*100));
        }

    }

}