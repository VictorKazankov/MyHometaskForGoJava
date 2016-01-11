
public class Squares {
    /** Trangle
     * basicTrangle - lenght of basic side
     * heightTrangle - Trangle height
     * Formula for calc: Square = 1 / 2 * basicTrangle * heightTrangle
     */
    public float resultSquareForTrangle;

    /** Rectangle
     * firstSide - lenght first side
     * secondSide - lenght second side
     * Formula for calc: Square = firstSide * secondSide
     */
    private float firstSideRectangle;
    private float secondSideRectangle;
    public float resultSquareForRectangle;

    /**Circle
     * radius - radius of Circle
     * Pi = 3.1415
     * Formula for calc: Square = Pi * radius * radius
     */
    private float radius;
    private float Pi = (float) Math.PI;
    public float resultSquareCircle;


    //////////////////////////////////////////////////////
    public float getSquareForTrangle( float basicTrangle, float heightTrangle){
        return resultSquareForTrangle = (1f / 2f) * basicTrangle * heightTrangle;
    }

    public float getSquareForRectangle(float firstSideRectangle, float secondSideRectangle){
        return resultSquareForRectangle = firstSideRectangle * secondSideRectangle;
    }

    public float getSquareCircle(float radius, float Pi){
        return resultSquareCircle = Pi * radius * radius;
    }
    //////////////////////////////////////////////////////


}
