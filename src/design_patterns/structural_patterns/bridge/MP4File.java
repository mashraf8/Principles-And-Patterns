package design_patterns.structural_patterns.bridge;

public class MP4File extends MediaFile
{
    public MP4File(OSPlayer osPlayer)
    {
        super(osPlayer);
    }

    public void playFile(String fileName)
    {
        System.out.println("File Type: MP4");
        osPlayer.play(fileName);
    }
}
