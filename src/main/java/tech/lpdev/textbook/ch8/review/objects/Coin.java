package tech.lpdev.textbook.ch8.review.objects;


import math.MathUtil;

public class Coin {
    private int faceUp;

    public Coin() {
        flipCoin();
    }

    public int showFace() {
        return faceUp;
    }

    public void flipCoin() {
        faceUp = MathUtil.random(0, 1);
    }
}
