package ua.goit.vkazankov.WorkWithFiles;

import java.io.FileNotFoundException;

public class DirectoryWindows {
    private float size;
    private String path;
    public String name;

    public File file[];

    //This method return new name of file
    String changeName(){
        try {
            throw new FileNotFoundException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return name;
    }

    void addFile(){

    }

    void deleteFile(){

    }
}
