package com.nhnacademy.java.poker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Table {
    static List<User> users = new ArrayList<>();
    static Dealer dealer;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("플레이어의 수를 입력 하세요 : ");
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print(i + 1 + "번 플레이어의 이름을 입력해 주세요 : ");
            String name = scanner.next();
            users.add(new User(i, name));
        }


        System.out.println("게임을 선택해 주세요(입력 : 1 포커, 입력 : 2 블랙잭)");
        dealer = new Dealer(scanner.nextInt(), users);
    }
}
