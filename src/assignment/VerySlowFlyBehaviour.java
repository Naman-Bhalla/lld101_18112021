package assignment;

public class VerySlowFlyBehaviour implements FlyingBehaviour {
    //implementing the fly method of flyingBehavior interface
    @Override
    public void fly() {
        System.out.println("Fly very slow");
    }
}
