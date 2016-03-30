package ua.goit.vkazankov.ClassForCollection;

public class Tulip extends Flower {
    private String name;
    private float lengthAfterCut;

    public Tulip(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    void smell(){

    }
}
