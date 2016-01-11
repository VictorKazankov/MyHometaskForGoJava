package ua.goit.vkazankov.workWithFiles;

public class File {
    public String type;
    protected String name;
    protected float size;

    // This method return new type of file after change
    String changeType(){
        return type;
    }
}
