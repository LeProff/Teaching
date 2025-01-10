package tech.lpdev.textbook.ch8.review;

import tech.lpdev.textbook.ch8.review.objects.Coin;

public class CoinDemo {

    public static void main(String[] args) {
        Coin nickel = new Coin();

        nickel.flipCoin();
        if (nickel.showFace() == 0) System.out.println("Heads up!");
        else System.out.println("Tails up!");
    }
}
