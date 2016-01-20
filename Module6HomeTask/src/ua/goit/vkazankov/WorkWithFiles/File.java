package ua.goit.vkazankov.WorkWithFiles;

import java.io.FileNotFoundException;

public class File {
    public String type;
    protected String name;
    protected float size;

    // This method return new type of file after change
    String changeType(){
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return type;
    }
}
