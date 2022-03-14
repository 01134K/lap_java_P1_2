package lib;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
        System.out.println("[Dog Created]");
    }

    public void print(){
        System.out.println("Dog : "+this.name);
    }

    public void greets(){
        System.out.println("Woof Woof !!!");
    }

    public void cheakHand(){
        System.out.println("Dog CheckHand");
    }
}
