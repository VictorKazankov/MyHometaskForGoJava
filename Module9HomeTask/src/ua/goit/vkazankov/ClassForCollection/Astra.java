package ua.goit.vkazankov.ClassForCollection;

public class Astra extends Flower {
    protected String name;
    private String sort;

    public Astra(String name){
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


    void Plant(){

    }
}
