package design_patterns.behavioral_patterns.memento;

public class TextEditor
{
    private String content = "";

    public void type(String text)
    {
        content += text;
    }

    public void show()
    {
        System.out.println("Content: " + content);
    }

    public Memento save()
    {
        return new Memento(content);
    }

    public void restore(Memento memento)
    {
        this.content = memento.getState();
    }
}
