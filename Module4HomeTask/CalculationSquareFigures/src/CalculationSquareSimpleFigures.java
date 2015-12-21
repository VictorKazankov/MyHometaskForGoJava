
public class CalculationSquareSimpleFigures {

    public static void main(String[] args) {

        Squares squares = new Squares(5, 7, 3.5f, 4.8f, 10, 3.1415f);


        System.out.println("Trangle square = " + squares.getSquareForTrangle());
        System.out.println("Rectangle square = " + squares.getSquareForRectangle());
        System.out.println("Circle square = " + squares.getSquareCircle());
    }
}
