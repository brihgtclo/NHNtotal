package converter;

import static converter.Converter.*;

public class ConverterTest {
    public static void main(String[] args) {
        NumBinary numBinary = new NumBinary("100111111");
        NumOctor numOctor = new NumOctor("477");
        NumHexadecimal numHexadecimal = new NumHexadecimal("13F");
        System.out.println(toDecimal(numBinary));
        System.out.println(toDecimal(numOctor));
        System.out.println(toDecimal(numHexadecimal));
        System.out.println(reduceToDecimal(numBinary));
        System.out.println(reduceToDecimal(numHexadecimal));
        System.out.println(reduceToDecimal(numOctor));
        System.out.println(convertToBase(319,2));
        System.out.println(convertToBase(319,8));
        System.out.println(convertToBase(319,16));

        System.out.println(toOctal(numBinary));
        System.out.println(toOctal(numHexadecimal));
        System.out.println(toHex(numBinary));
        System.out.println(toHex(numOctor));
        System.out.println(toBinary(numHexadecimal));
        System.out.println(toBinary(numOctor));


    }

}
