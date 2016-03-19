package ua.goit.vkazankov;

import ua.goit.vkazankov.ClassForCollection.*;

import java.util.ArrayList;



public class EncriptionByCaesarMethod {
    public static void main(String[] args) {

        ArrayList<Flower> objectList = new ArrayList();

        //List for encode elements
        ArrayList<StringBuilder> newObjectList = new ArrayList();

        //Shift from started value
        int shiftOfLetter = 3;

        objectList.add(new Chamomile("Astra"));
        objectList.add(new Astra("Chamomile"));
        objectList.add(new Tulip("Rose"));
        objectList.add(new Rose("Tulip"));

        // do encode our strings, where 3 - shift of letter
        System.out.println("List strings after encode:");
        for (int i = 0; i < 4; i++){
            newObjectList.add(EncriptionByCaesarMethod.encode(objectList.get(i),shiftOfLetter));
            System.out.println(newObjectList.get(i));
        }


        System.out.println("List strings after decode:");
        for (int i = 0; i < 4; i++){
            System.out.println(EncriptionByCaesarMethod.decode(newObjectList.get(i),shiftOfLetter));
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
