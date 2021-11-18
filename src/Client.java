import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Client {

    public static void printUserNames(List<User> users) {
        for (User u: users) {
            System.out.println(u.getName());
        }
    }

    public static void main(String[] args) {
        User user = new User();
        user.login();
        user.setName("Naman");
        Mentor mentor = new Mentor();
        mentor.login();

//        Mentor mentor1 = new User();
        // don't code to implementation
        // code to interfaces
        User user1 = new Mentor();
        user1.login();
//        user.giveAdvice();
//        user1.noOfMentees;
        User user2 = new Instructor();
        user2.login();
        User user3 = new Student();
        user3.login();

        User user4 = new User();

        List<User> users = new ArrayList<>();
        users.add(new Mentor());
        users.add(new Instructor());
        users.add(new User());
        users.add(new Student());

        printUserNames(users);
    }
}


// there is a method that will print
// the name of every user I have
// mentor, instructor, ta

// we can pass an object of a child class
// to an object of a parent class and the
// exact method that is callled is determined
// based on real class => polymorphism