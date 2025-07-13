package design_patterns.behavioral_patterns.chain_of_responsibility;
import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

public class Run
{
    public static void main(String[] args)
    {
        Set<String> emails = new HashSet<>();
        emails.add("user@example.com");

        Map<String, String> passwords = new HashMap<>();
        passwords.put("user@example.com", "123456");

        Set<String> activeAccounts = new HashSet<>();
        activeAccounts.add("user@example.com");

        Handler chain = new EmailExistsHandler(emails);
        chain.setNext(new PasswordCheckHandler(passwords)).setNext(new ActiveAccountHandler(activeAccounts));

        chain.handle("wrong@example.com", "123456");    // Email not found
        chain.handle("user@example.com", "wrongpass");  // Invalid password
        chain.handle("user@example.com", "123456");     // Login successful
    }

}
