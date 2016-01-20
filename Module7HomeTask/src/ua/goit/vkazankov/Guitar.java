package ua.goit.vkazankov;

public class Guitar extends Instrument{
    private String type;
    private int countString;

    void changeTone(){

    }
/* 1. антипатерн это Copy-Past. В данном случае у меня это метод Play оторый я использую сейчас в каждом классе
*  Его надо вынести в отдельный базовый класс, в данном случае класс Instrument.
*  А из него уже использовать в классах потомках.
*/
    void play(){

    }
// Здесь я оставил старую реализацию метода play, думая что может быть она понадобится когда-нибудь
// Надо убирать такие методы что-бы они не засоряли код

 /*   void playOld(){

    }
    */
}
