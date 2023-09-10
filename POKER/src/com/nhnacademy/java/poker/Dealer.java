package com.nhnacademy.java.poker;

import java.util.*;

public class Dealer {
    List<User> players;
    List<Card> dealerDeck;


    public Dealer(int game, List<User> users) {
        this.players = users;
        if (game == 1)
            startPorker();
        if (game == 2)
            dealerDeck = new Deck(6).getDeck();
    }

    private void startPorker() {
        dealerDeck = new Deck().getDeck();
        Collections.shuffle(dealerDeck);
        dealTheCard();
        showHand();
        handCheck();
    }

    private void showHand() {
        for (User user : players) {
            System.out.print(user.getName() + " = ");
            for (Card card : user.getHand()) {
                System.out.print(card.toString() + " ");
            }
            System.out.println();
        }
    }

    private void handCheck() {
        for (User user : players) {
            Collections.sort(user.getHand());
            System.out.println(rank(user));
        }
        Collections.sort(players);
        System.out.println("승리자 : " + players.get(0).getName());
    }

    private Rank rank(User user) {
        int count = 0;
        int pare = 0;
        int card = 1;
        List<Card> list = new ArrayList<>();
        for (int i = 0; i < user.getHand().size(); i++) {
            for (int j = i; j < user.getHand().size(); j++) {
                if (user.hand.get(i).getRealNumber() == user.hand.get(j).getRealNumber())
                    count++;
            }
            if (count == 2){
                list.add(user.getHand().get(i));
                pare++;
                i++;
            }
            if (count >= 3) {
                list.add(user.getHand().get(i));
                card = count;
                i += count-1;
            }
            count = 0;
        }
        if (card == 4) {
            user.setScore(400000+list.get(0).getRealNumber());
            return Rank.Four;
        }
        if (card == 3) {
            user.setScore(300000+list.get(0).getRealNumber());
            return Rank.Three;
        }
        if (pare >= 2) {
            user.setScore(200000+(list.get(0).getRealNumber()*1000)+(list.get(1).getRealNumber()*10)+list.get(0).getPatternValue());
            return Rank.Two;
        }
        if (pare == 1) {
            user.setScore(100000+(list.get(0).getRealNumber()*10)+list.get(0).getPatternValue());
            return Rank.One;
        }
        user.setScore(user.getHand().get(0).getRealNumber()*10+user.getHand().get(0).getPatternValue());
        return Rank.Top;
    }

    private void dealTheCard() {
        for (int i = 0; i < 5; i++) {
            for (User user : players) {
                user.addHand(dealerDeck.get(0));
                dealerDeck.remove(0);
            }
        }
    }
}
