package nhnacademy;

public class AlphabetSwap {
    public static String swap(String str){
        StringBuilder result = new StringBuilder();
        char[] arr = str.toCharArray();
        for (char alphabet: arr){
            if(isUpper(alphabet))
                alphabet = (char) (alphabet + 32);
            else if (isSmall(alphabet))
                alphabet = (char) (alphabet - 32);
            result.append(alphabet);
        }
        return result + "";
    }

    private static boolean isSmall(char alphabet) {
        return alphabet >= 97 && alphabet <= 122;
    }

    private static boolean isUpper(char alphabet) {
        return alphabet >=65 && alphabet <= 90;
    }
}
