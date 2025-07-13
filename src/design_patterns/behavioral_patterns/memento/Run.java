package design_patterns.behavioral_patterns.memento;

public class Run
{
    public static void main(String[] args)
    {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.type("Hello");
        history.saveState(editor.save());

        editor.type(" World");
        history.saveState(editor.save());

        editor.type("!");

        editor.show(); // Content: Hello World!

        editor.restore(history.undo());
        editor.show(); // Content: Hello World

        editor.restore(history.undo());
        editor.show(); // Content: Hello
    }
}
