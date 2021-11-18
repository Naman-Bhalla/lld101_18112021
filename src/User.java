public class User {
    private String name;
    private String email;
    private String password;

    public boolean login() {
        System.out.println("Logged in");
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
}
// private public protected default
// Encapsulation:
// 1. Data and methods should be together
// of an entity
// 2. Only those things should be
// allowed for client that entity
// wants
// method overriding