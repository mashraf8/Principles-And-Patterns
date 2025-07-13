package design_patterns.behavioral_patterns.chain_of_responsibility;
import java.util.Set;

public class ActiveAccountHandler extends Handler
{
    private Set<String> activeUsers;

    public ActiveAccountHandler(Set<String> activeUsers)
    {
        this.activeUsers = activeUsers;
    }

    @Override
    public boolean handle(String email, String password)
    {
        if (!activeUsers.contains(email))
        {
            System.out.println("Account not activated.");
            return false;
        }
        System.out.println("Login successful.");
        return true;
    }
}
