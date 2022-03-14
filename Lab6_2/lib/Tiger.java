package lib;

public class Tiger extends Cat{

    protected int fang ;

    public Tiger(String name , int fang){
        super(name);
        this.fang = fang;
        System.out.println("[Tiger Created]");
    }

    public void print(){
        System.out.println("Tiger : "+this.name
         + " have "+this.fang+" fangs.");
    }

    public void greets(){
        System.out.println("Ummmmm !!!");
    }

    public void attack(Animal enemy){
        System.out.println(this.name+" Attack to "
        +enemy.name+" with "+this.fang+" fangs!");
    }

    public int getFang(){
        return this.fang ;
    }
    public void setFang(int fang){
        this.fang = fang ;
    }

    

}
