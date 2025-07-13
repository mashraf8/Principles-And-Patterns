package design_patterns.behavioral_patterns.chain_of_responsibility;
import java.util.Map;

public class PasswordCheckHandler extends Handler
{
    private Map<String, String> userPasswords;

    public PasswordCheckHandler(Map<String, String> userPasswords)
    {
        this.userPasswords = userPasswords;
    }

    @Override
    public boolean handle(String email, String password)
    {
        if (!userPasswords.get(email).equals(password))
        {
            System.out.println("Invalid password.");
            return false;
        }
        return next == null || next.handle(email, password);
    }
}
