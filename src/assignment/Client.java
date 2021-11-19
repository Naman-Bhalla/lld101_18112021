package assignment;

public class Client {

    public static void main(String[] args) {

        Bird a = new Pigeon();
        Bird b = new Peacock();
        Bird c = new Sparrow();
        /*
        * Here client does not know which fly method is being used
        * or what is the flying behavior of any bird as we are using Abstract Class Reference to call fly
        * and this way of programming called Abstraction
        * */
        a.fly();
        b.fly();
        c.fly();
        
    }
}
