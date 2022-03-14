import lib.*;
public class main {
    public static void main(String[] args) {
        Dog D = new Dog("Bob");
        D.print();
        D.greets();
        Cat C = new Cat("Teen");
        C.print();
        C.greets();
        Tiger T = new Tiger("Leo", 18);
        T.print();
        T.attack(D);
    }
}
