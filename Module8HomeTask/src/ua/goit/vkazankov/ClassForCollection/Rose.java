package ua.goit.vkazankov.ClassForCollection;

public class Rose extends Flower{
    private int countNeedles;
    private String name;

    public Rose(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name Flower: " + name;
    }

    void grow(){

    }
}
