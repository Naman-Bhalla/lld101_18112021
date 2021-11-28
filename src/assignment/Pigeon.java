package assignment;

// extend keyword is used to extend the parent class. This concept is called inheritance as Pigeon will inherit all properties of Bird class
public class Pigeon extends Bird {
    //it will have all the properties defined in bird interface and teh FlyingBehavior will be set as
    // SlowFlyBehavior so fly method of this class will be used
    Pigeon() {
        flyingBehaviour = new SlowFlyBehaviour();
    }
}
