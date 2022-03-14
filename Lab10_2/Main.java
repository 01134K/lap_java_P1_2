
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
    private int balance ;
    private boolean Deposit_state ;
    public Account(){
        this.balance = 0;
        this.Deposit_state = true ;
    }

    synchronized public void deposit(int value){

        if(Deposit_state == false){
            try {
                wait();
            } catch (Exception e) {}
        }
        this.balance += value ;
        System.out.println("Deopsit "+value+" Balance : "+this.balance);
        Deposit_state = false ;
        notify();
    }

    synchronized public void withdraw(int value){

        if(Deposit_state == true){
            try {
                wait();
            } catch (Exception e) {}
        }
        if(this.balance < value){
            System.out.println("Cant Withdraw "+value+" Balance : "+this.balance);
        }
        else{
            this.balance -= value ;
            System.out.println("withdraw "+value+" Balance : "+this.balance);
        }
        Deposit_state = true ;
        notify();
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