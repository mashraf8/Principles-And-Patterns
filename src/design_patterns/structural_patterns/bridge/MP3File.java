package design_patterns.structural_patterns.bridge;

public class MP3File extends MediaFile
{
    public MP3File(OSPlayer osPlayer)
    {
        super(osPlayer);
    }

    public void playFile(String fileName)
    {
        System.out.println("File Type: MP3");
        osPlayer.play(fileName);
    }
}
