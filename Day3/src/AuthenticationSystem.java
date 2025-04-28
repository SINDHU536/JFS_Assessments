class Authenticator {
    private String correctPassword = "admin123"; // Predefined correct password

    // Member Inner Class
    private class Validator {
        public boolean validate(String inputPassword) {
            return correctPassword.equals(inputPassword);
        }
    }

    public void login(String password) {
        Validator validator = new Validator(); // Create an object of inner class
        if (validator.validate(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Incorrect Password");
        }
    }
}

public class AuthenticationSystem {
    public static void main(String[] args) {
        Authenticator auth = new Authenticator();

        auth.login("admin123"); // Login Successful
        auth.login("wrongpass"); // Incorrect Password
    }
}
