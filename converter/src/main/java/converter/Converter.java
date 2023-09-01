package converter;

public class Converter {
    public static int reduceToDecomal(String number, int init) {
        int result = 0;
        char[] arr = new char[number.length()];

        for (int i = 0; i < number.length(); i++) {
            arr[i] = number.charAt(i);
        }
        for (int i = 0; i < number.length(); i++) {
            if (arr[number.length() - i - 1] != '0') {
                int temp = ((Integer.valueOf(arr[number.length() - 1 - i])) - 48);
                result += Math.pow(init, i)*temp;
            }
        }
        return result;
    }
    public static int ToDecimal(NumBinary number){
        return reduceToDecomal(number.getNumber(), 2);
    }
    public static int ToDecimal(NumOctor number){
        return reduceToDecomal(number.getNumber(), 8);
    }
    public static int ToDecimal(NumHexadecimal number){
        return reduceToDecomal(number.getNumber(), 16);
    }



}
