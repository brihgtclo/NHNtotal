package Starter;

import java.util.Random;
import java.util.Scanner;

public class tictaxtoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String i = "";
        String you = "";
        String[][] map = new String[3][3];
        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                map[j][k] = " ";
            }
        }


        for (; ; ) {
            System.out.println("좌표를 입력해 주세요 예 1,1");
            i = scanner.nextLine();
            inputTac(i, "@", map);
            arrToString(map);
            if (isWin(map)) {
                System.out.println("나는 승리했다");
                return;
            }
//            you = scanner.nextLine();
//            inputTac(you, "X", map);
            conputerInput(map);
            arrToString(map);
            if (isWin(map)) {
                System.out.println("너가 승리했다");
                return;
            }
        }
    }

    private static void conputerInput(String[][] map) {
        Random random =new Random();
        boolean isInput = true;
        int x;
        int y;
        for(;isInput;){
            x = random.nextInt(3);
            y =random.nextInt(3);
            if(map[x][y] == " "){
                map[x][y] = "X";
                isInput = false;
            }
        }
    }

    private static void arrToString(String[][] map) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean isWin(String[][] map) {
        return x(map) || y(map) || cross(map);
    }

    private static boolean cross(String[][] map) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++) {
            if (map[i][i].equals("X"))
                x++;
            if (map[i][i].equals("@"))
                y++;
        }
        if (x == 3 || y == 3)
            return true;
        x = 0;
        y = 0;
        for (int i = 0; i < 3; i++) {
            if (map[2 - i][2 - i].equals("X"))
                x++;
            if (map[2 - i][2 - i].equals("@"))
                y++;
        }
        if (x == 3 || y == 3)
            return true;
        return false;
    }

    private static boolean y(String[][] map) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[i][j].equals("X"))
                    x++;
                if (map[i][j].equals("@"))
                    y++;
                if (x == 3 || y == 3)
                    return true;
            }
                x = 0;
                y = 0;
        }
        return false;
    }

    private static boolean x(String[][] map) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (map[j][i].equals("X"))
                    x++;
                if (map[j][i].equals("@"))
                    y++;
                if (x == 3 || y == 3)
                    return true;
            }
                x = 0;
                y = 0;
        }
        return false;

    }

    public static void inputTac(String user, String tec, String[][] map) {

        String[] arr = user.split(",");
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);
        if(map[x][y] != " ") throw new IllegalArgumentException("이미 입력되어 있습니다");
        map[x][y] = tec;
    }
}
