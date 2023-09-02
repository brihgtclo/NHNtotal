package converter;

public class Converter {
    public static int reduceToDecimal(String number, int init) {
        int result = 0;
        char[] arr = new char[number.length()];

        for (int i = 0; i < number.length(); i++) {
            arr[i] = number.charAt(i);
        }
        for (int i = 0; i < number.length(); i++) {
            if (arr[number.length() - i - 1] != '0') {
                int temp = (charToNum((Integer.valueOf(arr[number.length() - 1 - i]))));
                result += Math.pow(init, i) * temp;
            }
        }
        return result;
    }
    public static int reduceToDecimal(NumType number){
        int result = 0;
        char[] arr = new char[number.getLength()];

        for (int i = 0; i < number.getLength(); i++) {
            arr[i] = number.getNumber().charAt(i);
        }
        for (int i = 0; i < number.getLength(); i++) {
            if (arr[number.getLength() - i - 1] != '0') {
                int temp = (charToNum((Integer.valueOf(arr[number.getLength() - 1 - i]))));
                result += Math.pow(number.getInit(), i) * temp;
            }
        }
        return result;
    }

    private static int charToNum(int number) {
        if (idNumber(number))
            return number - 48;
        else if (isAlphabet(number)) {
            return number - 55;
        } else throw new IllegalArgumentException("잘못된 입력값 입니다.");
    }

    private static boolean isAlphabet(int number) {
        return number >= 65 && number <= 70;
    }

    private static boolean idNumber(int number) {
        return number >= 48 && number <= 57;
    }

    public static String convertToBase(int number, int init) {
        String str = "";
        String result = "";
        char temp;
        while (number >= init) {
            temp = numToChar(number % init);
            str += temp;
            number /= init;
        }
        temp = numToChar(number);
        str += temp;
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    private static char numToChar(int number) {
        char result;
        if (number < 10)
            result = (char) (number + 48);
        else
            result = (char) (number + 55);
        return result;
    }



    public static int toDecimal(NumBinary number) {
        return reduceToDecimal(number);
    }

    public static int toDecimal(NumOctor number) {
        return reduceToDecimal(number);
    }

    public static int toDecimal(NumHexadecimal number) {
        return reduceToDecimal(number);
    }

    public static String toOctal(NumBinary number) {
        return convertToBase(toDecimal(number), 8);
    }

    public static String toOctal(NumHexadecimal number) {
        return convertToBase(toDecimal(number), 8);
    }

    public static String toBinary(NumOctor number) {
        return convertToBase(toDecimal(number), 2);
    }

    public static String toBinary(NumHexadecimal number) {
        return convertToBase(toDecimal(number), 2);
    }

    public static String toHex(NumBinary number) {
        return convertToBase(toDecimal(number), 16);
    }

    public static String toHex(NumOctor number) {
        return convertToBase(toDecimal(number), 16);
    }


}
