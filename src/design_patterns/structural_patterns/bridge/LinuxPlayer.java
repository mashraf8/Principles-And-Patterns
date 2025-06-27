package design_patterns.structural_patterns.bridge;

public class LinuxPlayer implements OSPlayer
{
    @Override
    public void play(String fileName)
    {
        System.out.println("Playing " + fileName + " on Linux.");
    }
}
