public class Person2 implements Greeter {
    private String firstName;
    private String lastName;

    public Person2 (String firstName, String lastName)
        throws IllegalArgumentException {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String sayHello() {
        return String.format("Hello from %s %s.", getFirstName(), getLastName());
    }
}
