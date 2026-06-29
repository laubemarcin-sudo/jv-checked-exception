package core.basesyntax;

public class UserService {

    public void registerUser(User user) {
        String password = user.getPassword();
        String repeatPassword = user.getRepeatPassword();
        PasswordValidator passwordValidator = new PasswordValidator(); // Pamiętaj o usunięciu "X" z przodu!

        try {
            passwordValidator.validate(password, repeatPassword);
            saveUser(user);
        } catch (PasswordValidationException e) {
            System.out.println("Your passwords are incorrect. Try again.");
        }
    }
}