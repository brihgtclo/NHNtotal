package com.nhnacademy.mart;

import static java.lang.System.in;

import java.util.Scanner;

public class NhnMartShell {

    public static void main(String[] args) {
        NhnMart mart = new NhnMart();

        mart.prepareMart();

        BuyList buyList = inputBuyListFromShell();


        // 본인이름을 각자 맞게 영어로 변경
        // 홍길동 학생
        // -> hongGilDong or gilDong
        Customer jungByeongHun = new Customer(buyList);

        // 장바구니를 챙긴다.
        jungByeongHun.bring(mart.provideBasket());

        // 식품을 담는다.
        jungByeongHun.pickFoods(mart.getFoodStand());
        // 카운터에서 계산한다.
        jungByeongHun.payTox(mart.getCounter());



    }

    private static BuyList inputBuyListFromShell() {

        System.out.println("NHN 마트에 오신 것을 환영합니다. 사고 싶은 물건을 골라주세요.");
        Scanner scanner = new Scanner(in);
        System.out.print("> ");
        String wantList = scanner.nextLine();
        MyLogger.getLogger().info("입력값 : " + wantList);
        BuyList buyList = new BuyList();

        buyList.add(wantList.split(" "));

        return buyList;
    }
}

