
public class Squares {
    /** Trangle
     * basicTrangle - lenght of basic side
     * heightTrangle - Trangle height
     * Formula for calc: Square = 1 / 2 * basicTrangle * heightTrangle
     */
    private float basicTrangle;
    private float heightTrangle;
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
    private float Pi;
    public float resultSquareCircle;

    //////////////////////////////////////////////////////

    Squares(float basicTrangle, float heightTrangle,
            float firstSideRectangle, float secondSideRectangle,
            float radius, float Pi){

        this.basicTrangle = basicTrangle;
        this.heightTrangle = heightTrangle;

        this.firstSideRectangle = firstSideRectangle;
        this.secondSideRectangle = secondSideRectangle;

        this.radius = radius;
        this.Pi = 3.1415f;

    }

    //////////////////////////////////////////////////////
    public float getSquareForTrangle(){
        return resultSquareForTrangle = (1f / 2f) * basicTrangle * heightTrangle;
    }

    public float getSquareForRectangle(){
        return resultSquareForRectangle = firstSideRectangle * secondSideRectangle;
    }

    public float getSquareCircle(){
        return resultSquareCircle = Pi * radius * radius;
    }
    //////////////////////////////////////////////////////


    public float getBasicTrangle() {
        return basicTrangle;
    }

    public float getHeightTrangle() {
        return heightTrangle;
    }

    public float getFirstSideRectangle() {
        return firstSideRectangle;
    }

    public float getSecondSideRectangle() {
        return secondSideRectangle;
    }

    public float getRadius() {
        return radius;
    }

    public float getPi() {
        return Pi;
    }

}
