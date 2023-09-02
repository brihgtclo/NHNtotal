package converter;

public class NumOctor extends NumType{

    public NumOctor(String number) {
        super(number);
    }

    @Override
    public int getInit(){
        return 8;
    }
}
