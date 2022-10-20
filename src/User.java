public class User extends Person2{
    protected boolean admin;

    public User(String firstName, String lastName, boolean admin) throws IllegalArgumentException {
        super(firstName, lastName);
        this.admin = admin;
    }

    public boolean isAdmin(){
        return admin;
    }
}
