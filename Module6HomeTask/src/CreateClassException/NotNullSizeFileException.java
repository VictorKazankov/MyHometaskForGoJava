package CreateClassException;


public class NotNullSizeFileException extends Exception{

    private float sizeValue;

    public NotNullSizeFileException(float sizeValue){
        this.sizeValue = sizeValue;
    }

    public float getSizeValue(){
        return sizeValue;
    }


}
