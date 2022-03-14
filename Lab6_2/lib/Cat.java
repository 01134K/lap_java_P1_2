package lib;

public class Cat extends Animal{
   
    public Cat(String name){
        super(name);
        System.out.println("[Cat Created]");
    }

    public void print(){
        System.out.println("Cat : "+this.name);
    }

    public void greets(){
        System.out.println("Meow Meow !!!");
    }
}
