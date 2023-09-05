package num;

public class Main {
    public static int[][] soultion(int n){
        int[][] result = new int[n][n];
        int x = 0;
        int y = -1;
        int number = 1;
        int direcion = 1;
        while (n > 0){
            for (int i = 0; i < n; i++) {
                y += direcion;
                result[x][y] = number;
                number++;
            }
            n--;
            for (int i = 0; i < n; i++) {
                x += direcion;
                result[x][y] = number;
                number++;
            }
            direcion *= -1;
        }
        return result;
    }

    public static void main(String[] args) {
        arrToString(soultion(4));
    }

    private static void arrToString(int[][] soultion) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(soultion[i][j]);
            }
            System.out.println();
        }
    }
}
