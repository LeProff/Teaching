package textbook.unit8.review;

import textbook.unit8.review.objects.Coin;

public class Coin1 {

    public static void main(String[] args) {
        Coin nickel = new Coin();

        nickel.flipCoin();
        if (nickel.showFace() == 0) System.out.println("Heads up!");
        else System.out.println("Tails up!");
    }
}
