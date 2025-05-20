package bad;

public class UserRegisterManager {

    public void registerUser(String name, String email){
        saveData(name, email);

        sendEmail(email);

        logUser(name);
    }

    private void logUser(String name) {
        System.out.println("Logging user: " + name);
    }

    private void sendEmail(String email) {
        System.out.println("Sending email to:" + email);
    }

    private void saveData(String name, String email) {
        System.out.println("User data saved");
    }
}
