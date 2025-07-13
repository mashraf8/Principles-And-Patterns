package design_patterns.behavioral_patterns.command;

public class JuiceOrder implements OrderCommand
{
    private Chef chef;

    public JuiceOrder(Chef chef)
    {
        this.chef = chef;
    }

    @Override
    public void execute()
    {
        chef.makeJuice();
    }

    @Override
    public void undo()
    {
        chef.cancelJuice();
    }
}
