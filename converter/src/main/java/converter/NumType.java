package converter;

class NumType{
    private String number = null;

    public NumType(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public int getLength(){
        return this.number.length();
    }
}
