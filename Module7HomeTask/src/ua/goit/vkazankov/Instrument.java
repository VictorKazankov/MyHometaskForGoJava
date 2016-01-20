package ua.goit.vkazankov;

public class Instrument {
/* Здесь я жестко прописываю имя владельца инструмента в соответствующую переменную, т.е. использую Hard code
* И чтоб в процессе его нельзя было изменить ставлю final.
* Желательно так жестко это не делать, а наполнять такие данные через properties или не использовать final
 */
    protected final String owner = "vkazankov";
    protected String name;

    String changeType(){
        return name;
    }


}
