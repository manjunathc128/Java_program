package encapsulation;

public class UserProfile {
    // private fields encapsulation hides the sensitive data 
    private String username;
    private String email;
    private String password;

    public UserProfile(String username, String email, String password){
        this.username = username;
        this.email = email;
        setPassword(password); // use setter to enforce password rules
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        if (username.length() >= 3){
            this.username = username;

        }else {
            System.out.println("Username must be at least 3 characters long");
        }
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        if (email.contains("@")){
            this.email = email;
        }else{
            System.out.println("Invalid email format");
        }
    }

    public boolean verifyPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }
    public void setPassword(String password){
        if (password.length() >= 8) {
            this.password = password;
        } else{
            System.out.println("Password must be at least 8 characters long.");
        }
    }
    public static void main(String[] args){
        UserProfile user1 = new UserProfile("Manjunath", "cmanjunath333@gmail.com", "GFet3456");
        System.out.println(user1.getEmail());
    }
}
