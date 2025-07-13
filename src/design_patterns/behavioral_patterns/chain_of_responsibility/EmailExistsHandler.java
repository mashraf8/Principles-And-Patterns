package design_patterns.behavioral_patterns.chain_of_responsibility;
import java.util.Set;

public class EmailExistsHandler extends Handler
{
    private Set<String> emails;

    public EmailExistsHandler(Set<String> emails)
    {
        this.emails = emails;
    }

    @Override
    public boolean handle(String email, String password)
    {
        if (!emails.contains(email))
        {
            System.out.println("Email not found.");
            return false;
        }
        return next == null || next.handle(email, password);
    }
}
