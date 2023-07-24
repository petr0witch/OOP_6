package homework1;

public class UserReporter {
    private User user;
    public UserReporter(User user) {
        this.user = user;
    }
    public void report() {
        System.out.println("Report for user: " + user.getName());
    }
}
