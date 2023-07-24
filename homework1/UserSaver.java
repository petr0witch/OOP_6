package homework1;

public class UserSaver  {
    private User user;
    public UserSaver(User user) {
        this.user = user;
    }
    public void save(){
        Persister persister = new Persister(user);
        persister.save();
    }
}
