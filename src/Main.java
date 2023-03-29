import java.sql.SQLClientInfoException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String login = "tttttttttfdfg";
        String password = "ghemKn#e3";
        String confirmPassword = "ghemKne3";
        System.out.println(checkLogInCredentials(login, password, confirmPassword));
    }

    public static boolean checkLogInCredentials(String login, String password, String confirmPassword) {
        try {
            if (!Pattern.matches("^[a-zA-z0-9_]{1,20}$", login)) {
                throw new WrongLoginException("Wrong login format or length");
            }
            if (!Pattern.matches("^[a-zA-z0-9_]{1,19}$", password)) {
                throw new WrongPasswordException("Wrong password format");
            }
            if (!password.equals(confirmPassword)) {
                throw new WrongPasswordException("Passwords do not match");
            }
        } catch (WrongLoginException | WrongPasswordException wLog) {
            //System.out.println(wLog.getMessage());
            wLog.printStackTrace();
            return false;
        }
        return true;
    }
}