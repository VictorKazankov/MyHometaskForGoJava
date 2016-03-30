package ua.goit.vkazankov;

import ua.goit.vkazankov.ClassForCollection.*;

import java.io.*;
import java.nio.CharBuffer;
import java.util.ArrayList;


public class EncriptionByCaesarMethod {
    public static void main(String[] args) throws IOException {

        ArrayList<Flower> objectList = new ArrayList();


        //List for encode elements
        ArrayList<StringBuilder> newObjectList = new ArrayList();

        //Shift from started value
        int shiftOfLetter = 3;

        objectList.add(new Chamomile("Astra"));
        objectList.add(new Astra("Chamomile"));
        objectList.add(new Tulip("Rose"));
        objectList.add(new Rose("Tulip"));

        // clean list.txt file



        // do encode our strings, where 3 - shift of letter
        System.out.println("List strings after encode:");
        for (int i = 0; i < 4; i++){
            newObjectList.add(EncriptionByCaesarMethod.encode(objectList.get(i),shiftOfLetter));
            EncriptionByCaesarMethod.cleanFile();
            EncriptionByCaesarMethod.writeListToFile(newObjectList.get(i),1);
            //System.out.println(newObjectList.get(i));


        }




        System.out.println("\n" + "List strings after decode:");
        for (int i = 0; i < 4; i++){
            EncriptionByCaesarMethod.readListFromFile();
            System.out.println(EncriptionByCaesarMethod.decode(newObjectList.get(i),shiftOfLetter));
            //EncriptionByCaesarMethod.cleanFile();

        }


    }

    private static String readListFromFile() throws IOException {
        //File file = new File("list.txt");
        StringBuilder fileContent = new StringBuilder();
        //FileReader reader = null;

        try {
            //reader = new FileReader(file);
            BufferedReader in = new BufferedReader(new FileReader("list.txt"));
            String s;
            try {
                while ((s = in.readLine()) != null) {
                    fileContent.append(s);
                    fileContent.append("\n");
                }
            } finally {
                in.close();
            }
        }catch (IOException e){
            System.out.println("Файл не может быть прочитан");
        }

        return fileContent.toString();

    }

    //////////////////////////////////////////////////////////

    private static void cleanFile() throws FileNotFoundException, UnsupportedEncodingException {
        new PrintWriter(new OutputStreamWriter(new FileOutputStream("list.txt"), "UTF-8"));
    }


    private static void writeListToFile(StringBuilder oneStringList, int counter) throws IOException {

        File file = new File("list.txt");

        FileWriter writer = null;


            try {

                writer = new FileWriter(file,true);

                writer.write(oneStringList.toString());
                writer.append('\n');

            }catch (IOException e){
                System.out.println("Файл не готов для записи");

            }finally {
                try {
                    writer.close();

                }catch(IOException e){
                    System.out.println("Поток записи не может быть закрыт");
                }
            }

    }



    private static StringBuilder decode(StringBuilder decodeflower, int shiftOfLetter) {

        char letter;
        int ascii;
        StringBuilder newDecodeString = new StringBuilder();

        for (int i = 0; i < (decodeflower.toString()).length(); i++ ){
            letter = (decodeflower.toString()).charAt(i);
            ascii = (int)letter;
            ascii -= shiftOfLetter;
            char decodeLetter = (char)ascii;
            newDecodeString = newDecodeString.append(decodeLetter);

        }

        return newDecodeString;
    }

    private static StringBuilder encode(Flower encodeflower, int shiftOfLetter) {


        char letter;
        int ascii;
        StringBuilder newEncoderString = new StringBuilder();



        for (int i = 0; i < (encodeflower.toString()).length(); i++ ){
            letter = (encodeflower.toString()).charAt(i);
            ascii = (int)letter;
            ascii += shiftOfLetter;
            char encodeLetter = (char)ascii;
            newEncoderString = newEncoderString.append(encodeLetter);

        }


        return newEncoderString;
    }
}
