package assignment;

public abstract class Bird {
    int numberOfPaws;
    String beakType;
    String colour;
    FlyingBehaviour flyingBehaviour;

    public void fly() {
        flyingBehaviour.fly();
    }
}
