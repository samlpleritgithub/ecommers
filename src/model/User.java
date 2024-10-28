package model;
public class User {
    // Fields for the User class
    private int id;
    private String name;
    private String email;

    // Constructor with all fields
    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Overridden toString method for displaying user details
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    // Main method for testing
    public static void main(String[] args)
    {
    	User user=new User(1,"pooja","ps3777903@gmail.com");
    	System.out.println(user);
    	user.setName("pooja");
    	user.setEmail("ps3777903@gmail.com");
    	System.out.println(user);
    }
}