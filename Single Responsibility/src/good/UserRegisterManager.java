package good;

public class UserRegisterManager {
    private DataService dataService;

    private EmailService emailService;

    private LoginService loginService;

    public  UserRegisterManager(DataService dataService, EmailService emailService, LoginService loginService){
        this.dataService = dataService;
        this.emailService = emailService;
        this.loginService = loginService;
    }


    public void registerUser(String name, String email){

        //save Data
        dataService.saveData(name, email);

        //sendEmail(email
        emailService.sendEmail(email);

        //LogUser(name)
        loginService.loginUser(name);

    }
}
