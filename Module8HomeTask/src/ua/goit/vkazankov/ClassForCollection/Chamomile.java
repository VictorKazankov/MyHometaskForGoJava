package ua.goit.vkazankov.ClassForCollection;


public class Chamomile extends Flower{
    private String species;
    private String name;

    public Chamomile(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name Flower: " + name;
    }

    void applyInTea(){

    }
}
