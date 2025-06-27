package design_patterns.structural_patterns.bridge;

public class Run
{
    public static void main(String[] args)
    {
        MP3File song1 = new MP3File(new WindowsPlayer());
        song1.playFile("song.mp3");

        MP4File video1 = new MP4File(new LinuxPlayer());
        video1.playFile("movie.mp4");
    }
}
