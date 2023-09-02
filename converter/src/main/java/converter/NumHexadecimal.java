package converter;

public class NumHexadecimal extends NumType{
    public NumHexadecimal(String number) {
        super(number);
    }

    @Override
    public int getInit(){
        return 16;
    }
}
