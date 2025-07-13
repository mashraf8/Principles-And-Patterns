package design_patterns.behavioral_patterns.interpreter;

public class Run
{
    public static void main(String[] args)
    {
        // Ahmed AND Ali
        Expression ahmed = new NameExpression("Ahmed");
        Expression ali = new NameExpression("Ali");
        Expression both = new AndExpression(ahmed, ali);

        // Ahmed OR Omar
        Expression omar = new NameExpression("Omar");
        Expression oneOfThem = new OrExpression(ahmed, omar);

        // NOT Ali
        Expression notAli = new NotExpression(ali);

        String context1 = "Ahmed Ali";
        String context2 = "Ahmed";
        String context3 = "Omar";
        String context4 = "Sara";

        System.out.println("Ahmed AND Ali in 'Ahmed Ali'? " + both.interpret(context1)); // true
        System.out.println("Ahmed AND Ali in 'Ahmed'? " + both.interpret(context2));     // false

        System.out.println("Ahmed OR Omar in 'Ahmed'? " + oneOfThem.interpret(context2)); // true
        System.out.println("Ahmed OR Omar in 'Omar'? " + oneOfThem.interpret(context3));  // true
        System.out.println("Ahmed OR Omar in 'Sara'? " + oneOfThem.interpret(context4));  // false

        System.out.println("NOT Ali in 'Ahmed'? " + notAli.interpret(context2));          // true
        System.out.println("NOT Ali in 'Ali'? " + notAli.interpret("Ali"));               // false
    }
}
