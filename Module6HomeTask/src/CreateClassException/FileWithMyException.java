package CreateClassException;

public class FileWithMyException {
    public String type;
    protected String name;
    protected static float size;

    // This method return new type of file after change
    public static void main(String[] args) {
        if(size == 0){
            try {
                throw new NotNullSizeFileException(size);
            } catch (NotNullSizeFileException e) {
                System.out.println("[ERROR]: Size file = " + e.getSizeValue() + ". " + "Size this file should be > = 0");
            }
        }
    }


}
