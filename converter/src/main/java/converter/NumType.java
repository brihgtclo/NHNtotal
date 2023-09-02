package converter;

public class NumType {
    private final String number;

    public NumType(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public int getLength(){
        return this.number.length();
    }
    public int getInit(){
        return 0;
    }
}
