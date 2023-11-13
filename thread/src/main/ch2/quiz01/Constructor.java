package ch2.quiz01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Constructor {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int count = Integer.parseInt(bf.readLine());
        Counter ct1 = new Counter(name, count);
        name = bf.readLine();
        count = Integer.parseInt(bf.readLine());
        Counter ct2 = new Counter(name, count);
        ct1.run();
        ct2.run();
    }
}
