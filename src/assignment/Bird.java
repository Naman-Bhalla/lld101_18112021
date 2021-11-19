package assignment;

public abstract class Bird {
    /*
    * Abstract class used
    * to define all the common properties
    * of any kind of bird
    * */
    int numberOfPaws;
    String beakType;
    String colour;

    //Interface of FlyingBehavior as it can be different for different birds
    // and those class may have to extend other class
    FlyingBehaviour flyingBehaviour;

    //In any bird class we will set flying behaviour
    // and for that flying behavior fly method will be called
    public void fly() {
        flyingBehaviour.fly();
    }
}
