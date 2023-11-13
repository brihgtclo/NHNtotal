package ch2.quiz02;

import ch2.quiz01.Counter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Constructor {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String name = bf.readLine();
        int count = Integer.parseInt(bf.readLine());
        ThreadCounter ct1 = new ThreadCounter(name, count);
        name = bf.readLine();
        count = Integer.parseInt(bf.readLine());
        ThreadCounter ct2 = new ThreadCounter(name, count);
        ct1.start();
        ct2.start();
    }
}
