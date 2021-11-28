package assignment;

// extend keyword is used to extend the parent class. This concept is called inheritance as Sparrow will inherit all properties of Bird class
public class Sparrow extends Bird {
    //it will have all teh properties defined in bird interface and teh FlyingBehavior will be set as
    // SlowFlyBehavior so fly method of this class will be used
    Sparrow() {
        flyingBehaviour = new SlowFlyBehaviour();
    }}
