package Reverscalculater;

public class Main {

    public static int revers(int number) {
        if (number < 10) return number;
        return ((number % 10) * ((int) Math.pow(10, (int) (Math.log10(number))))) + revers(number / 10);
    }



    //    public static int revers(int number){
//        char[] arr = String.valueOf(number).toCharArray();
//        StringBuilder sb = new StringBuilder();
//        for (int i = arr.length-1; i >-1 ; i--) {
//            sb.append(arr[i]);
//        }
//        return Integer.parseInt(String.valueOf(sb));
//    }
    public static int reverscalcul(int num1, int num2) {
        return revers(revers(num1) + revers(num2));
    }

    public static void main(String[] args) {
        System.out.println(reverscalcul(123, 123));
        System.out.println(reverscalcul(1000, 1));
        System.out.println(reverscalcul(456, 789));
        System.out.println(reverscalcul(5, 5));
    }
}
