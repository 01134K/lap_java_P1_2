
package Bank;

import java.util.ArrayList;
//6421600042
public class Client {
    private int id ;
    private String name ;
    private String phone ;
    public ArrayList<Account> accounts ;


    
    public int getId(){
        return this.id ;
    }
 
    public void setId(int id){
        this.id = id ;
    }

    public String getName(){
        return this.name ;
    }

    public void setName(String name){
        this.name = name ;
    }

    public String getPhone(){
        return this.phone ;
    }

    public void setPhone(String phone){
        this.phone = phone ;
    }

    public Client(int id , String name , String phone){
        this.id = id ;
        this.name = name ; 
        this.phone = phone;
        accounts = new ArrayList<>(); 
    }

    public boolean addAccount(Account account){
        this.accounts.add(account) ; 
        return true ;
    }

    public boolean removeAccount(int accountId){
        for(int i =0 ; i < this.accounts.size(); i++){
            if(this.accounts.get(i).getId() == accountId){
                System.out.println("Acccount ID : "+accountId+" has been removed\n");
                this.accounts.remove(i) ;
                return true ;
            }
        }
        return false ;
    }

    public String toString(){

        String ans = "" ;
        ans += "ID = "+this.id+" , Name : "+this.name+" , TEL : "+ this.phone+"\n";
        ans += "Accounts \n" ;
        for(Account ac : this.accounts){
             ans += "Accounts ID = "+ac.getId()+" , Balance = "+ac.getBalance()+
             " , Annual Interest Rate = "+ac.getAnnualInterestRate()+" %\n";
        }
        return ans ;
    }
}
