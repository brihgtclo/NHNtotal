package converter;

public class NumBinary extends NumType {

    public NumBinary(String number) {
        super(number);
    }

    @Override
    public int getInit(){
        return 2;
    }
}
