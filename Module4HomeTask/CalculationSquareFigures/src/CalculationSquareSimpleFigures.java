
public class CalculationSquareSimpleFigures {

    public static void main(String[] args) {

        Squares squares = new Squares();


        System.out.println("Trangle square = " + squares.getSquareForTrangle(5,7));
        System.out.println("Rectangle square = " + squares.getSquareForRectangle(3.5f, 4.8f));
        System.out.println("Circle square = " + squares.getSquareCircle(10, 3.1415f));
    }
}
