package converter;

import static converter.Converter.*;

public class ConverterTest {
    public static void main(String[] args) {
        NumBinary numBinary = new NumBinary("0101001");
        NumOctor numOctor = new NumOctor("144");
        NumHexadecimal numHexadecimal = new NumHexadecimal("64");
        System.out.println(ToDecimal(numBinary));
        System.out.println(ToDecimal(numOctor));
        System.out.println(ToDecimal(numHexadecimal));


//        System.out.println(reduceToDecomal("64",16));
    }

}
