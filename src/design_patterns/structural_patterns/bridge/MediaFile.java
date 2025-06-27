package design_patterns.structural_patterns.bridge;

public class MediaFile
{
    protected OSPlayer osPlayer;

    public MediaFile(OSPlayer osPlayer)
    {
        this.osPlayer = osPlayer;
    }

}
