public class UserManagementSystem {
    // Private fields for username and password
    private String username;
    private String password;

    // Constructor to initialize username and password
    public User(String username, String password) {
        this.username = username;
        setPassword(password); // Using setter to validate password
    }

    // Getter for username (since it's publicly accessible)
    public String getUsername() {
        return username;
    }

    // Setter for password with validation (password must be at least 8 characters)
    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password; // Password is set only if it's valid
        } else {
            System.out.println("Password must be at least 8 characters long.");
        }
    }

    // Method to display user information (for demonstration purposes)
    public void displayUserDetails() {
        System.out.println("Username: " + username);
        // We don't show password for security reasons
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        // Creating a user instance with valid data
        User user1 = new User("john_doe", "securePass123");
        user1.displayUserDetails(); // Display username
        
        // Trying to set an invalid password
        user1.setPassword("short");
        
        // Trying to set a valid password again
        user1.setPassword("newValidPass");
        user1.displayUserDetails();
    }
}
