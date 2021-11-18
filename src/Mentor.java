public class Mentor extends User {
    private int numberOfMentees;

    public void giveAdvice() {
        System.out.println("Some advice");
    }
    public boolean login() {
        System.out.println("Logged in Mentor");
        return true;
    }
}
