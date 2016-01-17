package ua.goit.vkazankov.WorkWithFiles;

import java.io.FileNotFoundException;

public class TextFile extends File{
    private String type;
    public int countStrings;

    // This is method returning number string
    int addString(){

        return countStrings;
    }

    void cleanAddText() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

}
