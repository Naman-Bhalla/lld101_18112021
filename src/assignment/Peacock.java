package assignment;

// extend keyword is used to extend the parent class. This concept is called inheritance as Peacock will inherit all properties of Bird class
public class Peacock extends Bird {
    //it will have all teh properties defined in bird interface and teh FlyingBehavior will be set as
    // VerySlowFlyBehavior so fly method of this class will be used
    Peacock() {
        flyingBehaviour = new VerySlowFlyBehaviour();
    }
}
