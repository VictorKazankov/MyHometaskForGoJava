package ua.goit.vkazankov.WorkWithFiles;

public class AudioFile extends File{
    private String format;
    private int bitrade;

    void Play(){
        throw new IllegalStateException();
    }

    void Record(){
        throw new IllegalStateException("Error: Method has been invoked at an illegal or inappropriate time");
    }
}
