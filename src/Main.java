public class Main {
    public static void main(String[] args) {
        String login = "gfhgwunbe";
        String password = "ghemKne3";
        String confirmPassword = "rjbguje";
        checkLogInCredentials(login, password, confirmPassword);
    }

    private static boolean checkLogInCredentials(String login, String password, String confirmPassword) {
        boolean credentialsCorrect = true;
        if (login.length() > 20 || password.length() > 20) {
            credentialsCorrect = false;
        }

        return credentialsCorrect;
    }
}