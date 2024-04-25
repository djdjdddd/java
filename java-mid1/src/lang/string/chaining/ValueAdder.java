package lang.string.chaining;

/**
 * @author : yong
 * @fileName : ValueAdder
 * @date : 2024-04-26
 * @description :
 */
public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue){
        value += addValue;
        return this;
    }

    public int getValue(){
        return value;
    }

}
