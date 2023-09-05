package Starter;

import java.util.Scanner;

public class Whatday {
    static int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] monthNames = {"January", "Feburary", "March", "April", "May", "June", "July", "August", "Sepetember", "October", "November", "December"};

    public static void main(String[] args) {
        System.out.print("Enter a digit 1 between 365: ");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int dayNum = Integer.parseInt(line);
        System.out.print("Enter a year number :");
        String line2 = scanner.nextLine();
        int year = Integer.parseInt(line2);
        boolean isLeapYear = (year % 4 == 0) && ((year % 400 == 0)||(year%100 != 0));

        if((dayNum <= 0 || dayNum > 365)||year <= 0)
            throw new IllegalArgumentException("out of date                                             ");
        int monthNum = 0;
        for(int days : daysInMonth){
            if(dayNum <= days)
                break;
            else {
                dayNum -= days;
                monthNum++;
            }
        }

        String monthName = monthNames[monthNum];
        System.out.println(monthName + dayNum);
        System.out.println(isLeapYear);

    }

    private void hi() {
    }
}