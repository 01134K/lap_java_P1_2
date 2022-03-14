package lib;

public class Animal{
    protected String name ; 

    public Animal(String name){
        System.out.println("[Animal Created]");
        this.name = name ;
    }

    public void print(){
        System.out.println("Animal : "+this.name);
    }

    public String getName(){
        return this.name ;
    }
    public void setName(String name){
        this.name = name ;
    }
}